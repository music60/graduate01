package cn.edu.gdupt.model;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * TStudyPlan entity. @author MyEclipse Persistence Tools
 */

public class TStudyPlan implements java.io.Serializable {

	// Fields

	private Integer id;
	private TUser TUser;
	private String name;
	private String decribe;
	private String type;
	private Timestamp startTime;
	private Timestamp endTime;
	private Timestamp studyTime;
	private Integer nowStudy;
	private Integer status;
	private Set TStudyPlanArticles = new HashSet(0);
	private Set TStudyPlanVideos = new HashSet(0);

	// Constructors

	/** default constructor */
	public TStudyPlan() {
	}

	/** minimal constructor */
	public TStudyPlan(TUser TUser, String type) {
		this.TUser = TUser;
		this.type = type;
	}

	/** full constructor */
	public TStudyPlan(TUser TUser, String name, String decribe, String type,
			Timestamp startTime, Timestamp endTime, Timestamp studyTime,
			Integer nowStudy, Integer status, Set TStudyPlanArticles,
			Set TStudyPlanVideos) {
		this.TUser = TUser;
		this.name = name;
		this.decribe = decribe;
		this.type = type;
		this.startTime = startTime;
		this.endTime = endTime;
		this.studyTime = studyTime;
		this.nowStudy = nowStudy;
		this.status = status;
		this.TStudyPlanArticles = TStudyPlanArticles;
		this.TStudyPlanVideos = TStudyPlanVideos;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public TUser getTUser() {
		return this.TUser;
	}

	public void setTUser(TUser TUser) {
		this.TUser = TUser;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDecribe() {
		return this.decribe;
	}

	public void setDecribe(String decribe) {
		this.decribe = decribe;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Timestamp getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Timestamp startTime) {
		this.startTime = startTime;
	}

	public Timestamp getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Timestamp endTime) {
		this.endTime = endTime;
	}

	public Timestamp getStudyTime() {
		return this.studyTime;
	}

	public void setStudyTime(Timestamp studyTime) {
		this.studyTime = studyTime;
	}

	public Integer getNowStudy() {
		return this.nowStudy;
	}

	public void setNowStudy(Integer nowStudy) {
		this.nowStudy = nowStudy;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Set getTStudyPlanArticles() {
		return this.TStudyPlanArticles;
	}

	public void setTStudyPlanArticles(Set TStudyPlanArticles) {
		this.TStudyPlanArticles = TStudyPlanArticles;
	}

	public Set getTStudyPlanVideos() {
		return this.TStudyPlanVideos;
	}

	public void setTStudyPlanVideos(Set TStudyPlanVideos) {
		this.TStudyPlanVideos = TStudyPlanVideos;
	}

}