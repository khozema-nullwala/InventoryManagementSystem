package com.accenture.lkm.business.bean;

public class VendorBean {
	private String vendorId;
	private String vendorName;
	private String vendorAddress;
	private String contactPerson;
	private long contactNumber;
	public VendorBean()
	{
		super();
	}
	
	public VendorBean(String vendorId, String vendorName, String vendorAddress, String contactPerson,
			long contactNumber) {
		super();
		this.vendorId = vendorId;
		this.vendorName = vendorName;
		this.vendorAddress = vendorAddress;
		this.contactPerson = contactPerson;
		this.contactNumber = contactNumber;
	}

	public String getVendorId() {
		return vendorId;
	}
	public void setVendorId(String vendorId) {
		this.vendorId = vendorId;
	}
	public String getVendorName() {
		return vendorName;
	}
	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}
	public String getVendorAddress() {
		return vendorAddress;
	}
	public void setVendorAddress(String vendorAddress) {
		this.vendorAddress = vendorAddress;
	}
	public String getContactPerson() {
		return contactPerson;
	}
	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}
	public long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}

	@Override
	public String toString() {
		return "VendorBean [vendorId=" + vendorId + ", vendorName=" + vendorName + ", vendorAddress=" + vendorAddress
				+ ", contactPerson=" + contactPerson + ", contactNumber=" + contactNumber + "]";
	}
	

}
