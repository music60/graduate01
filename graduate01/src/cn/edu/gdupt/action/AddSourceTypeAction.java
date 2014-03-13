package cn.edu.gdupt.action;

import cn.edu.gdupt.model.TSourceType;
import cn.edu.gdupt.service.SourceTypeService;

import com.opensymphony.xwork2.Action;

public class AddSourceTypeAction implements Action {
		
	private String type;
	private String name;
	private String remark;
	private SourceTypeService sourceTypeService;
	
	public SourceTypeService getSourceTypeService() {
		return sourceTypeService;
	}

	public void setSourceTypeService(SourceTypeService sourceTypeService) {
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
		TSourceType tSourceType = new TSourceType();
		tSourceType.setType(type);
		tSourceType.setName(name);
		tSourceType.setRemark(remark);
		sourceTypeService.addPlanType(tSourceType);
		return "success";
	}

}
