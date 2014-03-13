package cn.edu.gdupt.service;

import java.util.List;

import cn.edu.gdupt.model.TPlanType;

/**
 * 
 * 学习计划服务
 * 2014-3-1
 * @author wangjj
 *
 */
public interface PlanTypeService {

	TPlanType addPlanType(TPlanType tPlanType);

	List<TPlanType> findByName(TPlanType tPlanType, boolean isAccurate);

	List<TPlanType> findByType(String type,boolean isAccurate);
	
	
}
