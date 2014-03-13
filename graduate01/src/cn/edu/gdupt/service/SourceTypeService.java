package cn.edu.gdupt.service;

import java.util.List;

import cn.edu.gdupt.model.TSourceType;


/**
 * 
 * 资源类型服务
 * 2014-3-1
 * @author wangjj
 *
 */
public interface SourceTypeService {
	
	TSourceType addPlanType(TSourceType TSourceType);

	List<TSourceType> findByName(TSourceType TSourceType, boolean isAccurate);

	List<TSourceType> findByType(String type,boolean isAccurate);
}
