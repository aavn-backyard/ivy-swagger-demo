package ch.axonivy.demo.website.dossier.model;
import java.io.Serializable;


public class ResponseExceptionMessage implements Serializable{
	private static final long serialVersionUID = 1L;
	private String errorCode;
	private String message;

	public ResponseExceptionMessage errorCode(String errorCode) {
		this.errorCode = errorCode;
		return this;
	}
	
	public ResponseExceptionMessage message(String message) {
		this.message = message;
		return this;
	}
	
	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
