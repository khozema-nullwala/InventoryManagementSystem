package com.accenture.lkm.business.bean;

public class MaterialTypeBean {

	private String typeId;
	private String typeName;
	private String categoryName;
	public MaterialTypeBean() {
		super();
	}
	public String getCategoryName() {
		return categoryName;
	}
	public String getTypeId() {
		return typeId;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	@Override
	public String toString() {
		return "MaterialTypeBean [typeId=" + typeId + ", typeName=" + typeName + ", categoryName=" + categoryName + "]";
	}
	
	
}
