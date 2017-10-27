package ch.axonivy.demo.website.dossier.bean;

import java.io.Serializable;

public class Address implements Serializable{
	private static final long serialVersionUID = 1L;
	private String kanton;
	private String temporaryCountry;



	public String getTemporaryCountry() {
		return temporaryCountry;
	}
	


	public void setTemporaryCountry(String temporaryCountry) {
		this.temporaryCountry = temporaryCountry;
	}



	/**
	 * @return the kanton
	 */
	public String getKanton() {
		return kanton;
	}



	/**
	 * @param kanton the kanton to set
	 */
	public void setKanton(String kanton) {
		this.kanton = kanton;
	}
	
	
	
	
}
