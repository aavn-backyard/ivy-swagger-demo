package ch.axonivy.demo.website.dossier.api.exception;

public enum DossierCreationServiceExceptionType{
	INTERNAL_SERVER_ERROR(500),
	BAD_REQUEST(400)
	;
	private int code;
	
	private DossierCreationServiceExceptionType(int code){
		this.code =code;
	}

	public int getCode() {
		return code;
	}
	
}
