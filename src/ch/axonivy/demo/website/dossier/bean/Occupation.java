package ch.axonivy.demo.website.dossier.bean;

import java.io.Serializable;

public class Occupation implements Serializable {
	private static final long serialVersionUID = 486548389531805907L;

	private String occupationType;

	public String getOccupationType() {
		return occupationType;
	}
	

	public void setOccupationType(String occupationType) {
		this.occupationType = occupationType;
	}
	

	
}