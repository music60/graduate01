package cn.edu.gdupt.common;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.io.IOException;
import java.io.StringWriter;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author tomle
 *
 */
public class BeansAndJson {
	private static final Logger LOGGER = LoggerFactory.getLogger(BeansAndJson.class);
	/**
	 * beans 转成json String
	 * @param o
	 * @return
	 * @throws IOException
	 */
	public static String bean2Json(Object o) throws IOException{
		return bean2Json(o, null);
	}
	
	/**
	 * beans 转成json String
	 * @param o
	 * @param dateForma 转换的日期格式
	 * @return
	 * @throws IOException
	 */
	public static String bean2Json(Object o, String dateForma) throws IOException{
        ObjectMapper mapper = new ObjectMapper();
        StringWriter writer = new StringWriter();
        if(dateForma != null){
        	mapper.setDateFormat(new SimpleDateFormat(dateForma));
        }
        try {
			mapper.writeValue(writer, o);
		} catch (JsonGenerationException e) {
			LOGGER.error("beans2json出错JsonGenerationException", e);
			throw e;
		} catch (JsonMappingException e) {
			LOGGER.error("beans2json出错JsonMappingException", e);
			throw e;
		} catch (IOException e) {
			LOGGER.error("beans2json出错beans2json", e);
			throw e;
		}
        return writer.toString();
	}
	
	/**
	 * json String 转成 beans
	 * @param jsonString
	 * @param clazz
	 * @return
	 * @throws IOException
	 */
	public static <T> T json2Beans(String jsonString, Class<T> clazz) throws IOException{
    	ObjectMapper mapper = new ObjectMapper();
    	try {
			return mapper.readValue(jsonString, clazz);
		} catch (JsonParseException e) {
			LOGGER.error("beans2json出错JsonParseException", e);
			throw e;
		} catch (JsonMappingException e) {
			LOGGER.error("beans2json出错JsonMappingException", e);
			throw e;
		} catch (IOException e) {
			LOGGER.error("beans2json出错beans2json", e);
			throw e;
		}
	}
	
	public static Map<String, Object> json2Map(String jsonString) throws IOException {
    	try {
    		JsonFactory factory = new JsonFactory(); 
    	    ObjectMapper mapper = new ObjectMapper(factory); 
    	    TypeReference<HashMap<String,Object>> typeRef = new TypeReference<HashMap<String,Object>>() {}; 
    	    HashMap<String,Object> o = mapper.readValue(jsonString, typeRef); 
    		
    	    return o;
		} catch (JsonParseException e) {
			LOGGER.error("json2Map出错JsonParseException", e);
			throw e;
		} catch (JsonMappingException e) {
			LOGGER.error("json2Map出错JsonMappingException", e);
			throw e;
		} catch (IOException e) {
			LOGGER.error("json2Map出错IOException", e);
			throw e;
		}
	}
	
	public static Map<String, Object> json2MapNoException(String jsonString) {
		try {
			return json2Map(jsonString);
		} catch (IOException e) {
		}
		
		return null;
	}
	
	public static Map<String, String> mapObj2mapString(Map<String, Object> map) {
		Map<String, String> params = new HashMap<String, String>();
		
		Iterator<String> iterator = map.keySet().iterator();
		while (iterator.hasNext()) {
			String key = (String) iterator.next();
			String value = StringUtils.toStringByTrim((String)map.get(key));
			
			params.put(key, value);
		}
		
		return params;
	}
	
	public static String bean2JsonNoException(Object o) {
		try {
			return bean2Json(o);
		} catch (IOException e) {
		}
		
		return null;
	}
	
	public static String bean2JsonNoException(Object o,String dateFormat) {
		try {
			return bean2Json(o, dateFormat);
		} catch (IOException e) {
		}
		
		return null;
	}
	
	/**
	 * Json转成List
	 * @param jsonString Json字符串
	 * @param clazz List中的类型
	 * @return 结果集
	 */
	public static <T> List<T> json2List(String jsonString, Class<T> clazz) {
		List<T> rs = new ArrayList<T>();
		
    	ObjectMapper mapper = new ObjectMapper();
    	try {
    		BeanInfo beanInfo = Introspector.getBeanInfo(clazz);
        	PropertyDescriptor[] descriptors = beanInfo.getPropertyDescriptors();
        	
        	Map<String, PropertyDescriptor> pds = new HashMap<String, PropertyDescriptor>();
        	for (PropertyDescriptor propertyDescriptor : descriptors) {
    			Method writeMethod = propertyDescriptor.getWriteMethod();
    			Method readMethod = propertyDescriptor.getReadMethod();
    			
    			if(readMethod != null && writeMethod != null) {
    				pds.put(propertyDescriptor.getName().toLowerCase(), propertyDescriptor);
    			}
    		}
        	
    		@SuppressWarnings("unchecked")
			List<LinkedHashMap<String, Object>> list = mapper.readValue(jsonString, List.class);
    		
    		for (int i = 0; i < list.size(); i++) { 
    	         Map<String, Object> map = list.get(i);  
    	         Set<String> set = map.keySet();
    	         
    	         T newInstance = clazz.newInstance();
    	         
    	         for (Iterator<String> it = set.iterator(); it.hasNext();) {
    	        	 String key = it.next();
    	        	 
    	        	 PropertyDescriptor propertyDescriptor = pds.get(key.toLowerCase());
    	        	 if(propertyDescriptor != null) {
    	        		 propertyDescriptor.getWriteMethod().invoke(newInstance, toObject(propertyDescriptor.getPropertyType(), map.get(key)));
    	        	 }
    	         }
    	         
    	         rs.add(newInstance);
    	    }
    		
			return rs;
		} catch (Exception e) {
			LOGGER.error("beans2json出错JsonParseException", e);
			
			return null;
		} 
	}
	
	static Object toObject(Class<?> propertyType, Object obj) {
		if(propertyType == byte.class || propertyType == Byte.class) {
			if(obj instanceof Byte)
				return obj;
			
			return Byte.valueOf(obj.toString());
		} else if(propertyType == short.class || propertyType == Short.class) {
			if(obj instanceof Short)
				return obj;
			
			return Short.valueOf(obj.toString());
		} else if(propertyType == int.class || propertyType == Integer.class) {
			if(obj instanceof Integer)
				return obj;
			
			return obj==null?null:Integer.valueOf(obj.toString());
		} else if(propertyType == long.class || propertyType == Long.class) {
			if(obj instanceof Long)
				return obj;
			
			return Long.valueOf(obj.toString());
		} else if(propertyType == float.class || propertyType == Float.class) {
			if(obj instanceof Float)
				return obj;
			
			return Float.valueOf(obj.toString());
		} else if(propertyType == double.class || propertyType == Double.class) {
			if(obj instanceof Double)
				return obj;
			
			return Double.valueOf(obj.toString());
		} else if(propertyType == BigInteger.class){
			if(obj instanceof BigInteger)
				return obj;
			
			return BigInteger.valueOf(Long.parseLong(obj.toString()));
		} else if(propertyType == BigDecimal.class) {
			if(obj instanceof BigDecimal)
				return obj;
			
			return BigDecimal.valueOf(Double.parseDouble(obj.toString()));
		} else if(propertyType == boolean.class || propertyType == Boolean.class) {
			if(obj instanceof Boolean)
				return obj;
			
			return Boolean.valueOf(obj.toString());
		} else if(propertyType == byte[].class) {
			if(obj instanceof Byte[]) {
				Byte[] d1 = (Byte[])obj;
				byte[] d2 = new byte[d1.length];
				
				for (int i = 0; i < d2.length; i++) {
					d2[i] = d1[i];
				}
				
				return d2;
			}
			
			return obj.toString().getBytes();
		} else if(propertyType == Byte[].class) {
			if(obj instanceof Byte[]) {
				return obj;
			}
			
			return obj.toString().getBytes();
		}
		
		return obj;
	}
	
	/**
	 * list 转成 json
	 * @param <T>
	 * @param list
	 * @param clazz
	 * @return
	 */
	public static <T> String list2Json(List<T> list,Class<?> clazz){
		ObjectMapper mapper = new ObjectMapper(); 
		StringWriter sw = new StringWriter();  
		try {
			mapper.writeValue(sw, list);
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}  
		
		return sw.toString();
	}
	
	/**
	 * Json转List数组
	 * @param json
	 * @param clazz
	 * @return
	 */
	public static <T> List<T> json2List2(String json,Class<T> clazz,String dateFormat){
		List<T> list = null;
		try{
			ObjectMapper mapper = new ObjectMapper(); 
			
			if(StringUtils.isNotEmptyByTrim(dateFormat))
				mapper.setDateFormat(new SimpleDateFormat(dateFormat));
			else
				mapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
			
			JavaType javaType = mapper.getTypeFactory().constructParametricType(ArrayList.class, clazz); 
			list = mapper.readValue(json, javaType);
		}catch(Exception e){
			LOGGER.error("json2List2 出错 exception",e);
			list = new ArrayList<T>();
		}
		return list;
	}
}
