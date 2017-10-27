package ch.axonivy.demo.website.dossier.service;

import java.util.Date;
import java.util.Objects;

import org.apache.commons.lang.StringUtils;

import com.google.common.base.Preconditions;

import ch.axonivy.demo.website.dossier.bean.Dossier;



public class DossierDataMappingUtil {
	private static final String SWITZERLAND_COUNTRY_CODE = "CH";
	private static final String PHONE_PATTERN = "((\\(\\+\\d+\\))|\\+)?[\\d ]+";
	private static final String CREATION_USER = "webpage";
	
	private DossierDataMappingUtil() {
	}

	public static Dossier toIndividualDossier(String provider, String externalId) throws IllegalArgumentException {
		Dossier dossier = new Dossier();
		
		return dossier;
	}

	
}
