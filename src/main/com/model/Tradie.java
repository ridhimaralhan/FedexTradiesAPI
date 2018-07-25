package main.com.model;

import java.io.Serializable;


//@JsonIgnoreProperties(ignoreUnknown = true)
public class Tradie implements Serializable {
	

	private static final long serialVersionUID = 1L;
	public String getLicenceID() {
		return licenceID;
	}
	public void setLicenceID(String licenceID) {
		this.licenceID = licenceID;
	}
	public String getLicensee() {
		return licensee;
	}
	public void setLicensee(String licensee) {
		this.licensee = licensee;
	}
	public String getLicenceName() {
		return licenceName;
	}
	public void setLicenceName(String licenceName) {
		this.licenceName = licenceName;
	}
	public String getLicenceNumber() {
		return licenceNumber;
	}
	public void setLicenceNumber(String licenceNumber) {
		this.licenceNumber = licenceNumber;
	}
	public String getLicenceType() {
		return licenceType;
	}
	public void setLicenceType(String licenceType) {
		this.licenceType = licenceType;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getSuburb() {
		return suburb;
	}
	public void setSuburb(String suburb) {
		this.suburb = suburb;
	}
	public String getPostcode() {
		return postcode;
	}
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	public String getBusinessNames() {
		return businessNames;
	}
	public void setBusinessNames(String businessNames) {
		this.businessNames = businessNames;
	}
	public String getCategories() {
		return categories;
	}
	public void setCategories(String categories) {
		this.categories = categories;
	}
	public String getClasses() {
		return classes;
	}
	public void setClasses(String classes) {
		this.classes = classes;
	}
	
	String licenceID;
	String licensee;
	String licenceName;
	String licenceNumber;
	String licenceType;
	String status;
	String suburb;
	String postcode;
	String businessNames;
	String categories;
	String classes;
}