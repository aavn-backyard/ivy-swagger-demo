package ch.axonivy.demo.website.dossier.model;

import java.io.Serializable;

import ch.axonivy.demo.DestinationBank;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@ApiModel(description="Contain data of dossier")
public class SobDossier implements Serializable {
	private static final long serialVersionUID = 1L;
	@ApiModelProperty(required=true, value="Basic information of Person")
	private Person person;
	@ApiModelProperty(required=true, value="Basic information of Address")
	private Address address;
	private Account account;
	@ApiModelProperty(required=true, value="Bank that account will be created")
	private DestinationBank destinationBank;
	
	
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

	public DestinationBank getDestinationBank() {
		return destinationBank;
	}

	public void setDestinationBank(DestinationBank destinationBank) {
		this.destinationBank = destinationBank;
	}

	/*public DestinationBank getDestinationBank() {
		return destinationBank;
	}

	public void setDestinationBank(DestinationBank destinationBank) {
		this.destinationBank = destinationBank;
	}*/

}
