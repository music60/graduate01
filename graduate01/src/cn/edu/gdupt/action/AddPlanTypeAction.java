package cn.edu.gdupt.action;

import cn.edu.gdupt.model.TPlanType;
import cn.edu.gdupt.service.PlanTypeService;

import com.opensymphony.xwork2.Action;

public class AddPlanTypeAction implements Action {
		
	private String type;
	private String name;
	private String remark;
	private PlanTypeService sourceTypeService;
	
	public PlanTypeService getPlanTypeService() {
		return sourceTypeService;
	}

	public void setPlanTypeService(PlanTypeService sourceTypeService) {
		this.sourceTypeService = sourceTypeService;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Override
	public String execute() throws Exception {
		TPlanType tPlanType = new TPlanType();
		tPlanType.setType(type);
		tPlanType.setName(name);
		tPlanType.setRemark(remark);
		sourceTypeService.addPlanType(tPlanType);
		return "success";
	}

}
