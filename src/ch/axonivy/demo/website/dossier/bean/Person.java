package ch.axonivy.demo.website.dossier.bean;

import java.io.Serializable;

public class Person implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Address address;
	private Contact contact;
	private String title;
	private String salutation;
	private String legalStatus;
	private String maritalStatusType;
	private String socialSecurityNumber;
	private String clientAdvisor;
	private String employeeType;
	private String personNumber;
	private String avaloqId;

	
	public Address getAddress() {
		return address;
	}
	

	public void setAddress(Address address) {
		this.address = address;
	}
	

	public Contact getContact() {
		return contact;
	}
	

	public void setContact(Contact contact) {
		this.contact = contact;
	}
	

	public String getTitle() {
		return title;
	}
	

	public void setTitle(String title) {
		this.title = title;
	}
	

	public String getSalutation() {
		return salutation;
	}
	

	public void setSalutation(String salutation) {
		this.salutation = salutation;
	}
	

	public String getLegalStatus() {
		return legalStatus;
	}
	

	public void setLegalStatus(String legalStatus) {
		this.legalStatus = legalStatus;
	}
	

	public String getMaritalStatusType() {
		return maritalStatusType;
	}
	

	public void setMaritalStatusType(String maritalStatusType) {
		this.maritalStatusType = maritalStatusType;
	}
	

	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}
	

	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}
	

	public String getClientAdvisor() {
		return clientAdvisor;
	}

	public void setClientAdvisor(String clientAdvisor) {
		this.clientAdvisor = clientAdvisor;
	}

	public String getEmployeeType() {
		return employeeType;
	}

	public void setEmployeeType(String employeeType) {
		this.employeeType = employeeType;
	}

	public String getPersonNumber() {
		return personNumber;
	}

	public void setPersonNumber(String personNumber) {
		this.personNumber = personNumber;
	}

	public String getAvaloqId() {
		return avaloqId;
	}

	public void setAvaloqId(String avaloqId) {
		this.avaloqId = avaloqId;
	}
	
	
	
	
	
	
}
