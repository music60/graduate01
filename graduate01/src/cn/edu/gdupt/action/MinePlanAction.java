package cn.edu.gdupt.action;

import cn.edu.gdupt.service.StudyPlanService;

import com.opensymphony.xwork2.Action;

public class MinePlanAction implements Action {
	
	private StudyPlanService studyPlanService;
	private String name;
	private int userid;
	private String decribe;
	private String type;
	private String startTime;
	private String endTime;
	private String studyTime;
	private int nowStudy;
	private int status;
	
	
	
	public StudyPlanService getStudyPlanService() {
		return studyPlanService;
	}

	public void setStudyPlanService(StudyPlanService studyPlanService) {
		this.studyPlanService = studyPlanService;
	}

	public String getMineStudyPlan() {
		return SUCCESS;
	}
	
	@Override
	public String execute() throws Exception {
		return null;
	}

}
