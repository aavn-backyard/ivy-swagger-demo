package ch.axonivy.demo.website.dossier.model;

import java.io.Serializable;
import java.util.Objects;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonCreator;

import ch.axonivy.demo.website.dossier.bean.MaritalStatus;
import io.swagger.annotations.ApiModelProperty;

public class Person implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private static final String TRUE_STRING = "TRUE";
	private static final String FALSE_STRING = "FALSE";

	public enum GenderCodeEnum {

		MALE("MALE"), FEMALE("FEMALE");

		private String value;

		GenderCodeEnum(String v) {
			value = v;
		}

		public String value() {
			return value;
		}

		@Override
		public String toString() {
			return value;
		}
		
		@JsonCreator
		public static GenderCodeEnum fromValue(String v) {
			for (GenderCodeEnum b : GenderCodeEnum.values()) {
				if (b.value.equals(v)) {
					return b;
				}
			}
			return null;
		}
	}

	private GenderCodeEnum genderCode = null;
	private String title = null;
	private String firstName = null;
	private String lastName = null;
	private String email = null;
	private String phone = null;
	private String countryOfBirth;
	
	public String getCountryOfBirth() {
		return countryOfBirth;
	}
	

	public void setCountryOfBirth(String countryOfBirth) {
		this.countryOfBirth = countryOfBirth;
	}
	
	private MaritalStatus maritalStatus;
	private String dateOfBirth = null;
	private String nationalityCountryCode = null;
	private String secondNationalityCountryCode = null;

	public enum LanguageEnum {

		DE(String.valueOf("DE")), FR(String.valueOf("FR"));

		private String value;

		LanguageEnum(String v) {
			value = v;
		}

		public String value() {
			return value;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}

		@JsonCreator
		public static LanguageEnum fromValue(String v) {
			for (LanguageEnum b : LanguageEnum.values()) {
				if (String.valueOf(b.value).equals(v)) {
					return b;
				}
			}
			return null;
		}
	}

	private LanguageEnum language = null;

	public enum IsSelfEmployedEnum {

		TRUE(TRUE_STRING), FALSE(FALSE_STRING);

		private String value;

		IsSelfEmployedEnum(String v) {
			value = v;
		}

		public String value() {
			return value;
		}

		@Override
		public String toString() {
			return value;
		}

		@JsonCreator
		public static IsSelfEmployedEnum fromValue(String v) {
			for (IsSelfEmployedEnum b : IsSelfEmployedEnum.values()) {
				if (b.value.equals(v)) {
					return b;
				}
			}
			return null;
		}
	}

	private IsSelfEmployedEnum isSelfEmployed = null;

	public enum HasRetirementFundEnum {

		TRUE(TRUE_STRING), FALSE(FALSE_STRING);

		private String value;

		HasRetirementFundEnum(String v) {
			value = v;
		}

		public String value() {
			return value;
		}

		@Override
		public String toString() {
			return value;
		}

		@JsonCreator
		public static HasRetirementFundEnum fromValue(String v) {
			for (HasRetirementFundEnum b : HasRetirementFundEnum.values()) {
				if (b.value.equals(v)) {
					return b;
				}
			}
			return null;
		}
	}

	private HasRetirementFundEnum hasRetirementFund = null;

	public enum HasManagementFundEnum {

		TRUE(TRUE_STRING), FALSE(FALSE_STRING);

		private String value;

		HasManagementFundEnum(String v) {
			value = v;
		}

		public String value() {
			return value;
		}

		@Override
		public String toString() {
			return value;
		}

		@JsonCreator
		public static HasManagementFundEnum fromValue(String v) {
			for (HasManagementFundEnum b : HasManagementFundEnum.values()) {
				if (b.value.equals(v)) {
					return b;
				}
			}
			return null;
		}
	}

	private HasManagementFundEnum hasManagementFund = null;

	public enum TransferFormEnum {

		TRUE(TRUE_STRING), FALSE(FALSE_STRING);

		private String value;

		TransferFormEnum(String v) {
			value = v;
		}

		public String value() {
			return value;
		}

		@Override
		public String toString() {
			return value;
		}

		@JsonCreator
		public static TransferFormEnum fromValue(String v) {
			for (TransferFormEnum b : TransferFormEnum.values()) {
				if (b.value.equals(v)) {
					return b;
				}
			}
			return null;
		}
		
	}

	private TransferFormEnum transferForm = null;
	private String profession = null;

	public enum IdTypeEnum {

		ID("ID"), 
		PASSPORT("PASSPORT");

		private String value;

		IdTypeEnum(String v) {
			value = v;
		}

		public String value() {
			return value;
		}

		@Override
		public String toString() {
			return value;
		}

		@JsonCreator
		public static IdTypeEnum fromValue(String v) {
			for (IdTypeEnum b : IdTypeEnum.values()) {
				if (b.value.equals(v)) {
					return b;
				}
			}
			return null;
		}
		
	}

	private IdTypeEnum idType = null;
	private String idNumber = null;
	private String idExpirydate = null;
	private String accountNo = null;
	private String accountNo3a = null;

	/**
	 * the gender of the person use MALE for male and FEMALE for female persons.
	 **/
	public Person genderCode(GenderCodeEnum genderCode) {
		this.genderCode = genderCode;
		return this;
	}

	@ApiModelProperty(value = "the gender of the person use MALE for male and FEMALE for female persons.")
	public GenderCodeEnum getGenderCode() {
		return genderCode;
	}

	public void setGenderCode(GenderCodeEnum genderCode) {
		this.genderCode = genderCode;
	}

	/**
   **/
	public Person title(String title) {
		this.title = title;
		return this;
	}

	@ApiModelProperty(value = "")
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	/**
   **/
	public Person firstName(String firstName) {
		this.firstName = firstName;
		return this;
	}

	@ApiModelProperty(required = true, value = "")
	@NotNull
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
   **/
	public Person lastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	@ApiModelProperty(required = true, value = "")
	@NotNull
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
   **/
	public Person email(String email) {
		this.email = email;
		return this;
	}

	@ApiModelProperty(value = "")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	/**
   **/
	public Person phone(String phone) {
		this.phone = phone;
		return this;
	}

	@ApiModelProperty(value = "")
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * the marital state of a person (SINGLE, MARRIED, WIDOWED, DIVORCED, REGISTERED_PARTNERSHIP)
	 **/
	public Person maritalStatus(MaritalStatus maritalStatus) {
		this.maritalStatus = maritalStatus;
		return this;
	}

	@ApiModelProperty(value = "the marital state of a person (SINGLE, MARRIED, WIDOWED, DIVORCED, REGISTERED_PARTNERSHIP)")
	public MaritalStatus getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(MaritalStatus maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	/**
   **/
	public Person dateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
		return this;
	}

	@ApiModelProperty(value = "")
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	/**
	 * the ISO 3166 alpha-2 country (https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) code of the person&#39;s nationality
	 **/
	public Person nationalityCountryCode(String nationalityCountryCode) {
		this.nationalityCountryCode = nationalityCountryCode;
		return this;
	}

	@ApiModelProperty(value = "the ISO 3166 alpha-2 country (https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) code of the person's nationality")
	public String getNationalityCountryCode() {
		return nationalityCountryCode;
	}

	public void setNationalityCountryCode(String nationalityCountryCode) {
		this.nationalityCountryCode = nationalityCountryCode;
	}

	/**
	 * the ISO 3166 alpha-2 country (https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) code of the person&#39;s second nationality
	 **/
	public Person secondNationalityCountryCode(String secondNationalityCountryCode) {
		this.secondNationalityCountryCode = secondNationalityCountryCode;
		return this;
	}

	@ApiModelProperty(value = "the ISO 3166 alpha-2 country (https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) code of the person's second nationality")
	public String getSecondNationalityCountryCode() {
		return secondNationalityCountryCode;
	}

	public void setSecondNationalityCountryCode(String secondNationalityCountryCode) {
		this.secondNationalityCountryCode = secondNationalityCountryCode;
	}

	/**
   **/
	public Person language(LanguageEnum language) {
		this.language = language;
		return this;
	}

	@ApiModelProperty(value = "")
	public LanguageEnum getLanguage() {
		return language;
	}

	public void setLanguage(LanguageEnum language) {
		this.language = language;
	}

	/**
   **/
	public Person isSelfEmployed(IsSelfEmployedEnum isSelfEmployed) {
		this.isSelfEmployed = isSelfEmployed;
		return this;
	}

	@ApiModelProperty(value = "")
	public IsSelfEmployedEnum getIsSelfEmployed() {
		return isSelfEmployed;
	}

	public void setIsSelfEmployed(IsSelfEmployedEnum isSelfEmployed) {
		this.isSelfEmployed = isSelfEmployed;
	}

	/**
   **/
	public Person hasRetirementFund(HasRetirementFundEnum hasRetirementFund) {
		this.hasRetirementFund = hasRetirementFund;
		return this;
	}

	@ApiModelProperty(value = "")
	public HasRetirementFundEnum getHasRetirementFund() {
		return hasRetirementFund;
	}

	public void setHasRetirementFund(HasRetirementFundEnum hasRetirementFund) {
		this.hasRetirementFund = hasRetirementFund;
	}

	/**
   **/
	public Person hasManagementFund(HasManagementFundEnum hasManagementFund) {
		this.hasManagementFund = hasManagementFund;
		return this;
	}

	@ApiModelProperty(value = "")
	public HasManagementFundEnum getHasManagementFund() {
		return hasManagementFund;
	}

	public void setHasManagementFund(HasManagementFundEnum hasManagementFund) {
		this.hasManagementFund = hasManagementFund;
	}

	/**
   **/
	public Person transferForm(TransferFormEnum transferForm) {
		this.transferForm = transferForm;
		return this;
	}

	@ApiModelProperty(value = "")
	public TransferFormEnum getTransferForm() {
		return transferForm;
	}

	public void setTransferForm(TransferFormEnum transferForm) {
		this.transferForm = transferForm;
	}

	/**
   **/
	public Person profession(String profession) {
		this.profession = profession;
		return this;
	}

	@ApiModelProperty(value = "")
	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	/**
   **/
	public Person idType(IdTypeEnum idType) {
		this.idType = idType;
		return this;
	}

	@ApiModelProperty(value = "")
	public IdTypeEnum getIdType() {
		return idType;
	}

	public void setIdType(IdTypeEnum idType) {
		this.idType = idType;
	}

	/**
   **/
	public Person idNumber(String idNumber) {
		this.idNumber = idNumber;
		return this;
	}

	@ApiModelProperty(value = "")
	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	/**
   **/
	public Person idExpirydate(String idExpirydate) {
		this.idExpirydate = idExpirydate;
		return this;
	}

	@ApiModelProperty(value = "")
	public String getIdExpirydate() {
		return idExpirydate;
	}

	public void setIdExpirydate(String idExpirydate) {
		this.idExpirydate = idExpirydate;
	}

	/**
   **/
	public Person accountNo(String accountNo) {
		this.accountNo = accountNo;
		return this;
	}

	@ApiModelProperty(value = "")
	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	/**
   **/
	public Person accountNo3a(String accountNo3a) {
		this.accountNo3a = accountNo3a;
		return this;
	}

	@ApiModelProperty(value = "")
	public String getAccountNo3a() {
		return accountNo3a;
	}

	public void setAccountNo3a(String accountNo3a) {
		this.accountNo3a = accountNo3a;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Person person = (Person) o;
		return Objects.equals(genderCode, person.genderCode) && Objects.equals(title, person.title)
				&& Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName)
				&& Objects.equals(email, person.email) && Objects.equals(phone, person.phone)
				&& Objects.equals(maritalStatus, person.maritalStatus) && Objects.equals(dateOfBirth, person.dateOfBirth)
				&& Objects.equals(nationalityCountryCode, person.nationalityCountryCode)
				&& Objects.equals(secondNationalityCountryCode, person.secondNationalityCountryCode)
				&& Objects.equals(language, person.language) && Objects.equals(isSelfEmployed, person.isSelfEmployed)
				&& Objects.equals(hasRetirementFund, person.hasRetirementFund)
				&& Objects.equals(hasManagementFund, person.hasManagementFund) && Objects.equals(transferForm, person.transferForm)
				&& Objects.equals(profession, person.profession) && Objects.equals(idType, person.idType)
				&& Objects.equals(idNumber, person.idNumber) && Objects.equals(idExpirydate, person.idExpirydate)
				&& Objects.equals(accountNo, person.accountNo) && Objects.equals(accountNo3a, person.accountNo3a);
	}

	@Override
	public int hashCode() {
		return Objects.hash(genderCode, title, firstName, lastName, email, phone, maritalStatus, dateOfBirth, nationalityCountryCode,
				secondNationalityCountryCode, language, isSelfEmployed, hasRetirementFund, hasManagementFund, transferForm, profession,
				idType, idNumber, idExpirydate, accountNo, accountNo3a);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Person {\n");

		sb.append("    genderCode: ").append(toIndentedString(genderCode)).append("\n");
		sb.append("    title: ").append(toIndentedString(title)).append("\n");
		sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
		sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
		sb.append("    email: ").append(toIndentedString(email)).append("\n");
		sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
		sb.append("    maritalStatus: ").append(toIndentedString(maritalStatus)).append("\n");
		sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
		sb.append("    nationalityCountryCode: ").append(toIndentedString(nationalityCountryCode)).append("\n");
		sb.append("    secondNationalityCountryCode: ").append(toIndentedString(secondNationalityCountryCode)).append("\n");
		sb.append("    language: ").append(toIndentedString(language)).append("\n");
		sb.append("    isSelfEmployed: ").append(toIndentedString(isSelfEmployed)).append("\n");
		sb.append("    hasRetirementFund: ").append(toIndentedString(hasRetirementFund)).append("\n");
		sb.append("    hasManagementFund: ").append(toIndentedString(hasManagementFund)).append("\n");
		sb.append("    transferForm: ").append(toIndentedString(transferForm)).append("\n");
		sb.append("    profession: ").append(toIndentedString(profession)).append("\n");
		sb.append("    idType: ").append(toIndentedString(idType)).append("\n");
		sb.append("    idNumber: ").append(toIndentedString(idNumber)).append("\n");
		sb.append("    idExpirydate: ").append(toIndentedString(idExpirydate)).append("\n");
		sb.append("    accountNo: ").append(toIndentedString(accountNo)).append("\n");
		sb.append("    accountNo3a: ").append(toIndentedString(accountNo3a)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces (except the first line).
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}
}
