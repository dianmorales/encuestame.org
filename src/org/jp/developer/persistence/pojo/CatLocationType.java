package org.jp.developer.persistence.pojo;

// Generated 01-17-2009 11:50:28 AM by Hibernate Tools 3.2.2.GA

/**
 * CatLocationType generated by hbm2java
 */
public class CatLocationType implements java.io.Serializable {

	private String tidtype;
	private String description;
	private Integer level;

	public CatLocationType() {
	}

	public CatLocationType(String tidtype) {
		this.tidtype = tidtype;
	}

	public CatLocationType(String tidtype, String description, Integer level) {
		this.tidtype = tidtype;
		this.description = description;
		this.level = level;
	}

	public String getTidtype() {
		return this.tidtype;
	}

	public void setTidtype(String tidtype) {
		this.tidtype = tidtype;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getLevel() {
		return this.level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

}
