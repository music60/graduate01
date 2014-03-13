package cn.edu.gdupt.action;

import java.util.List;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import cn.edu.gdupt.common.BeansAndJson;
import cn.edu.gdupt.model.TArticle;
import cn.edu.gdupt.model.TUser;
import cn.edu.gdupt.service.ArticleService;

import com.opensymphony.xwork2.Action;

public class SearchArticleAction implements Action {
	private ArticleService articleService;
	private TUser tUser;
	private String username;
	private String title;
	private JSONArray result;
	private List<TArticle> tArticles;
	
	public TUser gettUser() {
		return tUser;
	}

	public void settUser(TUser tUser) {
		this.tUser = tUser;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public JSONArray getResult() {
		return result;
	}

	public void setResult(JSONArray result) {
		this.result = result;
	}

	public List<TArticle> gettArticles() {
		return tArticles;
	}

	public void settArticles(List<TArticle> tArticles) {
		this.tArticles = tArticles;
	}

	public ArticleService getArticleService() {
		return articleService;
	}

	public void setArticleService(ArticleService articleService) {
		this.articleService = articleService;
	}

	@Override
	public String execute() throws Exception {
		if (username!=null) {
			tUser = new TUser();
			tUser.setUsername(username);
			tArticles =articleService.findByUsername(tUser,false);
		}
		if (title!=null) {
			tArticles =articleService.findByTitle(title,false);
		}
		System.out.println("artitleName="+username);
		System.out.println("size="+tArticles.size());
		System.out.println("title="+title);
		String ss =BeansAndJson.list2Json(tArticles, TArticle.class);
		System.out.println(ss);
		//System.out.println("username="+tArticles.get(0).getTUser().getUsername());
//		for (TArticle tArticle  : tArticles) {
//			System.out.println("tArticle.getTUser()+"+tArticle.getTUser().getId());
//			System.out.println("tArticle.getTUser()+"+tArticle.getTUser().getUsername());
//		}
//		 
//		JSONObject jobject = JSONObject.fromObject(tArticles); 
//		//result= gson.toJson(tArticles,new TypeToken<List<TArticle>>() {}.getType());
//		
//		System.out.println(result);
//		System.out.println("id="+tArticles.get(0).getId());
//		if (tArticles!=null) {
//			result=JSONArray.fromObject(tArticles);  //或者JSONArray jsarry=JSONArray.fromObject(list)
//		} 
		
		return "success";
		
	}

}
