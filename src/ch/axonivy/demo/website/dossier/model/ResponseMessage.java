package ch.axonivy.demo.website.dossier.model;

import java.io.Serializable;

public class ResponseMessage implements Serializable {
	private static final long serialVersionUID = 1L;
	private String cobId = null;

	public ResponseMessage cobId(String cobId) {
		this.cobId = cobId;
		return this;
	}

	public String getCobId() {
		return cobId;
	}

	public void setCobId(String cobId) {
		this.cobId = cobId;
	}

}
