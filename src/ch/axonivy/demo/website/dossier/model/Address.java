package ch.axonivy.demo.website.dossier.model;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;

public class Address implements Serializable {
	private static final long serialVersionUID = 1L;
	private String street;
	private String houseNo;
	private String additionalAdress;
	private String zipCode;
	private String city;
	private String addressCountryCode;

	/**
   **/
	public Address street(String street) {
		this.street = street;
		return this;
	}

	@ApiModelProperty(value = "")
	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	/**
   **/
	public Address houseNo(String houseNo) {
		this.houseNo = houseNo;
		return this;
	}

	@ApiModelProperty(value = "")
	public String getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}

	/**
   **/
	public Address additionalAdress(String additionalAdress) {
		this.additionalAdress = additionalAdress;
		return this;
	}

	@ApiModelProperty(value = "")
	public String getAdditionalAdress() {
		return additionalAdress;
	}

	public void setAdditionalAdress(String additionalAdress) {
		this.additionalAdress = additionalAdress;
	}

	/**
   **/
	public Address zipCode(String zipCode) {
		this.zipCode = zipCode;
		return this;
	}

	@ApiModelProperty(value = "")
	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	/**
   **/
	public Address city(String city) {
		this.city = city;
		return this;
	}

	@ApiModelProperty(value = "")
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * the ISO 3166 alpha-2 country (https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) code of the adress
	 **/
	public Address addressCountryCode(String addressCountryCode) {
		this.addressCountryCode = addressCountryCode;
		return this;
	}

	@ApiModelProperty(value = "the ISO 3166 alpha-2 country (https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) code of the adress")
	public String getAddressCountryCode() {
		return addressCountryCode;
	}

	public void setAddressCountryCode(String addressCountryCode) {
		this.addressCountryCode = addressCountryCode;
	}

}
