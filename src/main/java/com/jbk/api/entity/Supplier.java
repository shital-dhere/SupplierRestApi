package com.jbk.api.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Supplier {
     @Id
	private int sId;
	private String sName;
	private String sCountry;
	private String sMail;
	private int sPhone;

	public Supplier() {
		super();
		
	}

	public Supplier(int sId, String sName, String sCountry, String sMail, int sPhone) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.sCountry = sCountry;
		this.sMail = sMail;
		this.sPhone = sPhone;
	}

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getsCountry() {
		return sCountry;
	}

	public void setsCountry(String sCountry) {
		this.sCountry = sCountry;
	}

	public String getsMail() {
		return sMail;
	}

	public void setsMail(String sMail) {
		this.sMail = sMail;
	}

	public int getsPhone() {
		return sPhone;
	}

	public void setsPhone(int sPhone) {
		this.sPhone = sPhone;
	}

	@Override
	public String toString() {
		return "Supplier [sId=" + sId + ", sName=" + sName + ", sCountry=" + sCountry + ", sMail=" + sMail + ", sPhone="
				+ sPhone + "]";
	}

}
