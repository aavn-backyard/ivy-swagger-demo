package ch.axonivy.demo.website.dossier.bean;

import java.io.Serializable;

public class Identification implements Serializable{
	private static final long serialVersionUID = 965400504394803614L;
	
	private String identificationType;
	private String issuingCountry;
	private String issuingCity;

	public String getIdentificationType() {
		return identificationType;
	}

	public void setIdentificationType(String identificationType) {
		this.identificationType = identificationType;
	}

	public String getIssuingCountry() {
		return issuingCountry;
	}

	public void setIssuingCountry(String issuingCountry) {
		this.issuingCountry = issuingCountry;
	}

	public String getIssuingCity() {
		return issuingCity;
	}

	public void setIssuingCity(String issuingCity) {
		this.issuingCity = issuingCity;
	}
}