package com.superweb.superwebapp.beans;

public class SubCategoryBean {
	
	String subname;
	long catid;
	public String getSubname() {
		return subname;
	}
	public void setSubname(String subname) {
		this.subname = subname;
	}
	public long getCatid() {
		return catid;
	}
	public void setCatid(long catid) {
		this.catid = catid;
	}
	@Override
	public String toString() {
		return "SubCategoryBean [subname=" + subname + ", catid=" + catid + "]";
	}
	
	
}
