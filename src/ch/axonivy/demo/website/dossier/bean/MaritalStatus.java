package ch.axonivy.demo.website.dossier.bean;

import java.util.EnumSet;

import org.apache.commons.lang3.StringUtils;

import com.fasterxml.jackson.annotation.JsonCreator;

import ch.ivyteam.ivy.environment.Ivy;

public enum MaritalStatus {
	SINGLE("SINGLE", "single"), 
	MARRIED("MARRIED", "married"), 
	DIVORCED("DIVORCED", "divorced"), 
	WIDOWED("WIDOWED", "widowed"), 
	REGISTERED_PARTNERSHIP("REGISTERED_PARTNERSHIP", "registeredPartnership");
	
	private static final String CMS_FOLDER  = "/ch/axonivy/fintech/cicbank/Cob/Enum/MaritalStatus/";
	private String id;
	private String label;
	
	MaritalStatus(String id, String label) {
		this.id = id;
		this.label = label;
	}
	

	public String getLabel() {
		return Ivy.cms().co(StringUtils.appendIfMissing(CMS_FOLDER, this.label));
	}
	
	
	public String getId() {
		return id;
	}
	
	public static MaritalStatus parse(String id) {
		return EnumSet.allOf(MaritalStatus.class).stream().filter(item -> item.getId().equals(id)).findFirst().orElse(null);
	}
	
	@JsonCreator
	public static MaritalStatus fromValue(String v) {
		for (MaritalStatus b : MaritalStatus.values()) {
			if (String.valueOf(b.getId()).equals(v)) {
				return b;
			}
		}
		return null;
	}
}
