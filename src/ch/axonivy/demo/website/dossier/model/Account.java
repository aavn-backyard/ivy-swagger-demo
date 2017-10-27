package ch.axonivy.demo.website.dossier.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

public class Account implements Serializable {
	private static final long serialVersionUID = 1L;

	public enum AccountTypeEnum {
		@JsonProperty("3A")
		_3A,
		@JsonProperty("WS3A")
		WS3A;

		AccountTypeEnum() {
		}
		
		@JsonCreator
		public static AccountTypeEnum fromValue(String v) {
			for (AccountTypeEnum b : AccountTypeEnum.values()) {
				if (b.name().equals(v)) {
					return b;
				}
			}
			return null;
		}
		
	}

	private AccountTypeEnum accountType;
	private String fundId1;
	private String fundPercent1;
	private String fundId2;
	private String fundPercent2;
	private String fundId3;
	private String fundPercent3;
	private String fundId4;
	private String fundPercent4;
	private String fundId5;
	private String fundPercent5;
	private String amount;
	private String amountRegular;

	public enum AmountFrequencyEnum {

		MONTHLY(String.valueOf("MONTHLY")), QUARTERLY(String.valueOf("QUARTERLY"));

		private String value;

		AmountFrequencyEnum(String v) {
			value = v;
		}

		public String value() {
			return value;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}

		public static AmountFrequencyEnum fromValue(String v) {
			for (AmountFrequencyEnum b : AmountFrequencyEnum.values()) {
				if (String.valueOf(b.value).equals(v)) {
					return b;
				}
			}
			return null;
		}
	}

	private AmountFrequencyEnum amountFrequency;

	/**
   **/
	public Account accountType(AccountTypeEnum accountType) {
		this.accountType = accountType;
		return this;
	}

	@ApiModelProperty(value = "")
	public AccountTypeEnum getAccountType() {
		return accountType;
	}

	public void setAccountType(AccountTypeEnum accountType) {
		this.accountType = accountType;
	}

	/**
   **/
	public Account fundId1(String fundId1) {
		this.fundId1 = fundId1;
		return this;
	}

	@ApiModelProperty(value = "")
	public String getFundId1() {
		return fundId1;
	}

	public void setFundId1(String fundId1) {
		this.fundId1 = fundId1;
	}

	/**
   **/
	public Account fundPercent1(String fundPercent1) {
		this.fundPercent1 = fundPercent1;
		return this;
	}

	@ApiModelProperty(value = "")
	public String getFundPercent1() {
		return fundPercent1;
	}

	public void setFundPercent1(String fundPercent1) {
		this.fundPercent1 = fundPercent1;
	}

	/**
   **/
	public Account fundId2(String fundId2) {
		this.fundId2 = fundId2;
		return this;
	}

	@ApiModelProperty(value = "")
	public String getFundId2() {
		return fundId2;
	}

	public void setFundId2(String fundId2) {
		this.fundId2 = fundId2;
	}

	/**
   **/
	public Account fundPercent2(String fundPercent2) {
		this.fundPercent2 = fundPercent2;
		return this;
	}

	@ApiModelProperty(value = "")
	public String getFundPercent2() {
		return fundPercent2;
	}

	public void setFundPercent2(String fundPercent2) {
		this.fundPercent2 = fundPercent2;
	}

	/**
   **/
	public Account fundId3(String fundId3) {
		this.fundId3 = fundId3;
		return this;
	}

	@ApiModelProperty(value = "")
	public String getFundId3() {
		return fundId3;
	}

	public void setFundId3(String fundId3) {
		this.fundId3 = fundId3;
	}

	/**
   **/
	public Account fundPercent3(String fundPercent3) {
		this.fundPercent3 = fundPercent3;
		return this;
	}

	@ApiModelProperty(value = "")
	public String getFundPercent3() {
		return fundPercent3;
	}

	public void setFundPercent3(String fundPercent3) {
		this.fundPercent3 = fundPercent3;
	}

	/**
   **/
	public Account fundId4(String fundId4) {
		this.fundId4 = fundId4;
		return this;
	}

	@ApiModelProperty(value = "")
	public String getFundId4() {
		return fundId4;
	}

	public void setFundId4(String fundId4) {
		this.fundId4 = fundId4;
	}

	/**
   **/
	public Account fundPercent4(String fundPercent4) {
		this.fundPercent4 = fundPercent4;
		return this;
	}

	@ApiModelProperty(value = "")
	public String getFundPercent4() {
		return fundPercent4;
	}

	public void setFundPercent4(String fundPercent4) {
		this.fundPercent4 = fundPercent4;
	}

	/**
   **/
	public Account fundId5(String fundId5) {
		this.fundId5 = fundId5;
		return this;
	}

	@ApiModelProperty(value = "")
	public String getFundId5() {
		return fundId5;
	}

	public void setFundId5(String fundId5) {
		this.fundId5 = fundId5;
	}

	/**
   **/
	public Account fundPercent5(String fundPercent5) {
		this.fundPercent5 = fundPercent5;
		return this;
	}

	@ApiModelProperty(value = "")
	public String getFundPercent5() {
		return fundPercent5;
	}

	public void setFundPercent5(String fundPercent5) {
		this.fundPercent5 = fundPercent5;
	}

	/**
	 * amount of the initial payment
	 **/
	public Account amount(String amount) {
		this.amount = amount;
		return this;
	}

	@ApiModelProperty(value = "amount of the initial payment")
	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	/**
	 * amount for regular payments
	 **/
	public Account amountRegular(String amountRegular) {
		this.amountRegular = amountRegular;
		return this;
	}

	@ApiModelProperty(value = "amount for regular payments")
	public String getAmountRegular() {
		return amountRegular;
	}

	public void setAmountRegular(String amountRegular) {
		this.amountRegular = amountRegular;
	}

	/**
   **/
	public Account amountFrequency(AmountFrequencyEnum amountFrequency) {
		this.amountFrequency = amountFrequency;
		return this;
	}

	@ApiModelProperty(value = "")
	public AmountFrequencyEnum getAmountFrequency() {
		return amountFrequency;
	}

	public void setAmountFrequency(AmountFrequencyEnum amountFrequency) {
		this.amountFrequency = amountFrequency;
	}

}
