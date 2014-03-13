package cn.edu.gdupt.service;

import java.util.List;

import cn.edu.gdupt.model.TArticle;
import cn.edu.gdupt.model.TStudyPlan;
import cn.edu.gdupt.model.TUser;


/**
 * 
 * 学习类型类型服务
 * 2014-3-4
 * @author wangjj
 *
 */
public interface StudyPlanService {

	TStudyPlan addStudyPlan(TStudyPlan tStudyPlan);

	List<TStudyPlan> findByUser(TUser tUser, boolean isAccurate);

	List<TStudyPlan> findByPlanName(String planName, boolean isAccurate);
	
	
}
