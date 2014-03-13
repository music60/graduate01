package cn.edu.gdupt.service.impl;

import java.util.List;

import cn.edu.gdupt.dao.TPlanTypeDAO;
import cn.edu.gdupt.model.TPlanType;
import cn.edu.gdupt.service.PlanTypeService;


/**
 * 
 * 计划类型服务 实现
 * 2014-3-1
 * @author wangjj
 *
 */
public class PlanTypeServiceImpl implements PlanTypeService {
	
	private TPlanTypeDAO tPlanTypeDAO;
	
	public TPlanTypeDAO gettPlanTypeDAO() {
		return tPlanTypeDAO;
	}

	public void settPlanTypeDAO(TPlanTypeDAO tPlanTypeDAO) {
		this.tPlanTypeDAO = tPlanTypeDAO;
	}

	@Override
	public TPlanType addPlanType(TPlanType tPlanType) {
		// TODO Auto-generated method stub
		tPlanTypeDAO.save(tPlanType);
		return null;
	}

	@Override
	public List<TPlanType> findByName(TPlanType tPlanType, boolean isAccurate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TPlanType> findByType(String type, boolean isAccurate) {
		// TODO Auto-generated method stub
		return null;
	}

}
