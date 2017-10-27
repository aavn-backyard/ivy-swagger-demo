package ch.axonivy.demo.website.dossier.service;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import ch.axonivy.demo.website.dossier.model.ResponseMessage;
import ch.axonivy.demo.website.dossier.model.SobDossier;

public class CreateDossierHandlerService {
	public Response createIndividualCHDossier(String provider, String externalId, SobDossier sobDossier) {
		return Response.status(Status.CREATED).entity(new ResponseMessage().cobId("COB-001")).build();
	}
}