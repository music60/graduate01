package cn.edu.gdupt.model;

/**
 * TStudyPlanArticle entity. @author MyEclipse Persistence Tools
 */

public class TStudyPlanArticle implements java.io.Serializable {

	// Fields

	private Integer id;
	private TStudyPlan TStudyPlan;
	private Integer needTime;
	private Integer nowtime;
	private Integer status;

	// Constructors

	/** default constructor */
	public TStudyPlanArticle() {
	}

	/** minimal constructor */
	public TStudyPlanArticle(TStudyPlan TStudyPlan) {
		this.TStudyPlan = TStudyPlan;
	}

	/** full constructor */
	public TStudyPlanArticle(TStudyPlan TStudyPlan, Integer needTime,
			Integer nowtime, Integer status) {
		this.TStudyPlan = TStudyPlan;
		this.needTime = needTime;
		this.nowtime = nowtime;
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

	public Integer getNowtime() {
		return this.nowtime;
	}

	public void setNowtime(Integer nowtime) {
		this.nowtime = nowtime;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

}