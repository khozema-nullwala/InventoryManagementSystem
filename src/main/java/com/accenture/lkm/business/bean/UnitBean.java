package com.accenture.lkm.business.bean;

public class UnitBean {

	private String unitId;
	private String unitName;
	private String categoryName;
	public UnitBean() {
		super();
	}
	public String getCategoryName() {
		return categoryName;
	}
	public String getUnitId() {
		return unitId;
	}
	public String getUnitName() {
		return unitName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public void setUnitId(String unitId) {
		this.unitId = unitId;
	}
	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}
	@Override
	public String toString() {
		return "UnitBean [unitId=" + unitId + ", unitName=" + unitName + ", categoryName=" + categoryName + "]";
	}	
}
