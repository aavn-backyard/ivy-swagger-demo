package ch.axonivy.demo.website.dossier.bean;

public class Dossier extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = -4855610197876211331L;

  private java.lang.String cobId;

  /**
   * Gets the field cobId.
   * @return the value of the field cobId; may be null.
   */
  public java.lang.String getCobId()
  {
    return cobId;
  }

  /**
   * Sets the field cobId.
   * @param _cobId the new value of the field cobId.
   */
  public void setCobId(java.lang.String _cobId)
  {
    cobId = _cobId;
  }

 
  public AccountHolder getAccountHolderManagement() {
	return accountHolderManagement;
}

public void setAccountHolderManagement(AccountHolder accountHolderManagement) {
	this.accountHolderManagement = accountHolderManagement;
}


private AccountHolder accountHolderManagement;

 
  
}
