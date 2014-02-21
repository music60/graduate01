package cn.edu.gdupt.model;

/**
 * TVideo entity. @author MyEclipse Persistence Tools
 */

public class TVideo implements java.io.Serializable {

	// Fields

	private Integer id;
	private String title;
	private String url;
	private String introduce;
	private Integer userid;
	private String type;
	private String label;

	// Constructors

	/** default constructor */
	public TVideo() {
	}

	/** minimal constructor */
	public TVideo(String title, Integer userid, String type) {
		this.title = title;
		this.userid = userid;
		this.type = type;
	}

	/** full constructor */
	public TVideo(String title, String url, String introduce, Integer userid,
			String type, String label) {
		this.title = title;
		this.url = url;
		this.introduce = introduce;
		this.userid = userid;
		this.type = type;
		this.label = label;
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

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
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

	public String getLabel() {
		return this.label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

}