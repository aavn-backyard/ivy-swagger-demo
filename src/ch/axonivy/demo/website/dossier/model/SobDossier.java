package ch.axonivy.demo.website.dossier.model;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;

public class SobDossier implements Serializable {
	private static final long serialVersionUID = 1L;
	private Person person;
	private Address address;
	private Account account;

	public SobDossier person(Person person) {
		this.person = person;
		return this;
	}

	@ApiModelProperty(value = "")
	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public SobDossier address(Address address) {
		this.address = address;
		return this;
	}

	@ApiModelProperty(value = "")
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public SobDossier account(Account account) {
		this.account = account;
		return this;
	}

	@ApiModelProperty(value = "")
	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

}
