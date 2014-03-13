package cn.edu.gdupt.service.impl;

import java.util.List;

import cn.edu.gdupt.dao.TStudyPlanDAO;
import cn.edu.gdupt.model.TStudyPlan;
import cn.edu.gdupt.model.TUser;
import cn.edu.gdupt.service.StudyPlanService;

public class StudyPlanServiceImpl implements StudyPlanService {
	
private TStudyPlanDAO tStudyPlanDAO;
	
	public TStudyPlanDAO gettStudyPlanDAO() {
		return tStudyPlanDAO;
	}

	public void settStudyPlanDAO(TStudyPlanDAO tStudyPlanDAO) {
		this.tStudyPlanDAO = tStudyPlanDAO;
	}

	@Override
	public TStudyPlan addStudyPlan(TStudyPlan tStudyPlan) {
		tStudyPlanDAO.save(tStudyPlan);
		return tStudyPlan;
	}

	@Override
	public List<TStudyPlan> findByUser(TUser tUser, boolean isAccurate) {
		return tStudyPlanDAO.findByUser(tUser,isAccurate);
	}

	@Override
	public List<TStudyPlan> findByPlanName(String planName, boolean isAccurate) {
		return tStudyPlanDAO.findByName(planName,isAccurate);
	}


}
