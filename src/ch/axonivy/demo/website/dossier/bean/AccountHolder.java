package ch.axonivy.demo.website.dossier.bean;

import java.io.Serializable;

public class AccountHolder implements Serializable{
	private static final long serialVersionUID = 1144342709438913509L;
	
	private Person person;
	private Occupation occupation;
	private Identification identification;
	public Person getPerson() {
		return person;
	}
	
	public void setPerson(Person person) {
		this.person = person;
	}
	
	public Occupation getOccupation() {
		return occupation;
	}
	
	public void setOccupation(Occupation occupation) {
		this.occupation = occupation;
	}
	
	public Identification getIdentification() {
		return identification;
	}
	
	public void setIdentification(Identification identification) {
		this.identification = identification;
	}
	

	
}