package cn.edu.gdupt.model;

/**
 * TStudyPlanVideo entity. @author MyEclipse Persistence Tools
 */

public class TStudyPlanVideo implements java.io.Serializable {

	// Fields

	private Integer id;
	private TStudyPlan TStudyPlan;
	private Integer needTime;
	private Integer nowTime;
	private Integer status;

	// Constructors

	/** default constructor */
	public TStudyPlanVideo() {
	}

	/** minimal constructor */
	public TStudyPlanVideo(TStudyPlan TStudyPlan) {
		this.TStudyPlan = TStudyPlan;
	}

	/** full constructor */
	public TStudyPlanVideo(TStudyPlan TStudyPlan, Integer needTime,
			Integer nowTime, Integer status) {
		this.TStudyPlan = TStudyPlan;
		this.needTime = needTime;
		this.nowTime = nowTime;
		this.status = status;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public TStudyPlan getTStudyPlan() {
		return this.TStudyPlan;
	}

	public void setTStudyPlan(TStudyPlan TStudyPlan) {
		this.TStudyPlan = TStudyPlan;
	}

	public Integer getNeedTime() {
		return this.needTime;
	}

	public void setNeedTime(Integer needTime) {
		this.needTime = needTime;
	}

	public Integer getNowTime() {
		return this.nowTime;
	}

	public void setNowTime(Integer nowTime) {
		this.nowTime = nowTime;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

}