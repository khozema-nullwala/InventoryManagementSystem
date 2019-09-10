package com.accenture.lkm.business.bean;

import javax.validation.constraints.NotBlank;

public class PurchaseBean {

	private Integer purchaseId;
	private String transactionId;
	@NotBlank
	private String vendorName;
	public Integer getPurchaseId() {
		return purchaseId;
	}
	public void setPurchaseId(Integer purchaseId) {
		this.purchaseId = purchaseId;
	}
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public String getVendorName() {
		return vendorName;
	}
	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}	
}
