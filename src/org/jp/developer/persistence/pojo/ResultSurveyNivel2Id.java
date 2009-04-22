package org.jp.developer.persistence.pojo;

// Generated 01-17-2009 11:50:28 AM by Hibernate Tools 3.2.2.GA

/**
 * ResultSurveyNivel2Id generated by hbm2java
 */
public class ResultSurveyNivel2Id implements java.io.Serializable {

	private long rid;
	private long ridN1;
	private long ridN2;

	public ResultSurveyNivel2Id() {
	}

	public ResultSurveyNivel2Id(long rid, long ridN1, long ridN2) {
		this.rid = rid;
		this.ridN1 = ridN1;
		this.ridN2 = ridN2;
	}

	public long getRid() {
		return this.rid;
	}

	public void setRid(long rid) {
		this.rid = rid;
	}

	public long getRidN1() {
		return this.ridN1;
	}

	public void setRidN1(long ridN1) {
		this.ridN1 = ridN1;
	}

	public long getRidN2() {
		return this.ridN2;
	}

	public void setRidN2(long ridN2) {
		this.ridN2 = ridN2;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ResultSurveyNivel2Id))
			return false;
		ResultSurveyNivel2Id castOther = (ResultSurveyNivel2Id) other;

		return (this.getRid() == castOther.getRid())
				&& (this.getRidN1() == castOther.getRidN1())
				&& (this.getRidN2() == castOther.getRidN2());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (int) this.getRid();
		result = 37 * result + (int) this.getRidN1();
		result = 37 * result + (int) this.getRidN2();
		return result;
	}

}
