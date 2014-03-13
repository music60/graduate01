package cn.edu.gdupt.model;

import java.sql.Timestamp;

/**
 * TComment entity. @author MyEclipse Persistence Tools
 */

public class TComment implements java.io.Serializable {

	// Fields

	private Integer id;
	private TUser TUser;
	private Integer rootid;
	private Integer superid;
	private String content;
	private Timestamp date;

	// Constructors

	/** default constructor */
	public TComment() {
	}

	/** minimal constructor */
	public TComment(Integer id, TUser TUser, Integer rootid, Integer superid) {
		this.id = id;
		this.TUser = TUser;
		this.rootid = rootid;
		this.superid = superid;
	}

	/** full constructor */
	public TComment(Integer id, TUser TUser, Integer rootid, Integer superid,
			String content, Timestamp date) {
		this.id = id;
		this.TUser = TUser;
		this.rootid = rootid;
		this.superid = superid;
		this.content = content;
		this.date = date;
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

	public Integer getRootid() {
		return this.rootid;
	}

	public void setRootid(Integer rootid) {
		this.rootid = rootid;
	}

	public Integer getSuperid() {
		return this.superid;
	}

	public void setSuperid(Integer superid) {
		this.superid = superid;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Timestamp getDate() {
		return this.date;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}

}