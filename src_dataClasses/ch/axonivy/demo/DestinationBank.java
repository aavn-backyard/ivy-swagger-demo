package ch.axonivy.demo;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class DestinationBank", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class DestinationBank extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = 2343150768954744582L;

  private transient java.lang.String bankId;

  /**
   * Gets the field bankId.
   * @return the value of the field bankId; may be null.
   */
  public java.lang.String getBankId()
  {
    return bankId;
  }

  /**
   * Sets the field bankId.
   * @param _bankId the new value of the field bankId.
   */
  public void setBankId(java.lang.String _bankId)
  {
    bankId = _bankId;
  }

  @io.swagger.annotations.ApiModelProperty(value="Name of bank", required = true)
  private transient java.lang.String bankName;

  /**
   * Gets the field bankName.
   * @return the value of the field bankName; may be null.
   */
  public java.lang.String getBankName()
  {
    return bankName;
  }

  /**
   * Sets the field bankName.
   * @param _bankName the new value of the field bankName.
   */
  public void setBankName(java.lang.String _bankName)
  {
    bankName = _bankName;
  }

  private transient ch.axonivy.demo.website.dossier.bean.Address address;

  /**
   * Gets the field address.
   * @return the value of the field address; may be null.
   */
  public ch.axonivy.demo.website.dossier.bean.Address getAddress()
  {
    return address;
  }

  /**
   * Sets the field address.
   * @param _address the new value of the field address.
   */
  public void setAddress(ch.axonivy.demo.website.dossier.bean.Address _address)
  {
    address = _address;
  }

}
