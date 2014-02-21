package cn.edu.gdupt.model;

/**
 * TArticle entity. @author MyEclipse Persistence Tools
 */

public class TArticle implements java.io.Serializable {

	// Fields

	private Integer id;
	private String title;
	private String content;
	private String introduce;
	private Integer userid;
	private String type;

	// Constructors

	/** default constructor */
	public TArticle() {
	}

	/** minimal constructor */
	public TArticle(String title, Integer userid, String type) {
		this.title = title;
		this.userid = userid;
		this.type = type;
	}

	/** full constructor */
	public TArticle(String title, String content, String introduce,
			Integer userid, String type) {
		this.title = title;
		this.content = content;
		this.introduce = introduce;
		this.userid = userid;
		this.type = type;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public String getIntroduce() {
		return this.introduce;
	}

	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}

	public Integer getUserid() {
		return this.userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

}