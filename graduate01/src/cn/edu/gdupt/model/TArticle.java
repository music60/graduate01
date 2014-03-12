package cn.edu.gdupt.model;

import java.sql.Timestamp;

/**
 * TArticle entity. @author MyEclipse Persistence Tools
 */

public class TArticle implements java.io.Serializable {

	// Fields

	private Integer id;
	private TUser TUser;
	private String title;
	private String content;
	private String tag;
	private String type;
	private Timestamp date;

	// Constructors

	/** default constructor */
	public TArticle() {
	}

	/** minimal constructor */
	public TArticle(TUser TUser, String title, String type) {
		this.TUser = TUser;
		this.title = title;
		this.type = type;
	}

	/** full constructor */
	public TArticle(TUser TUser, String title, String content, String tag,
			String type, Timestamp date) {
		this.TUser = TUser;
		this.title = title;
		this.content = content;
		this.tag = tag;
		this.type = type;
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

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getTag() {
		return this.tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Timestamp getDate() {
		return this.date;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}

}