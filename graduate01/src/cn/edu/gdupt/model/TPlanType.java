package cn.edu.gdupt.model;

/**
 * TPlanType entity. @author MyEclipse Persistence Tools
 */

public class TPlanType implements java.io.Serializable {

	// Fields

	private Integer id;
	private String type;
	private String name;
	private String remark;

	// Constructors

	/** default constructor */
	public TPlanType() {
	}

	/** minimal constructor */
	public TPlanType(String type) {
		this.type = type;
	}

	/** full constructor */
	public TPlanType(String type, String name, String remark) {
		this.type = type;
		this.name = name;
		this.remark = remark;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}