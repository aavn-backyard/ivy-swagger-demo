package ch.axonivy.demo.website.dossier.api;

import javax.validation.constraints.NotNull;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.apache.commons.lang3.StringUtils;

import ch.axonivy.demo.website.dossier.api.exception.DossierCreationServiceExceptionType;
import ch.axonivy.demo.website.dossier.model.ResponseExceptionMessage;
import ch.axonivy.demo.website.dossier.model.ResponseMessage;
import ch.axonivy.demo.website.dossier.model.SobDossier;
import ch.axonivy.demo.website.dossier.service.CreateDossierHandlerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.Authorization;
import io.swagger.annotations.Info;
import io.swagger.annotations.SwaggerDefinition;

@Path("{applicationName}/individualch")

@Api(value="individualch", description = "the individualch API", authorizations={
		@Authorization(value="basicAuth")
})
@SwaggerDefinition(info= @Info(description="The individualch API", version="v1", title="External Dossier Service"))
@Produces(MediaType.APPLICATION_JSON)
public class IndividualchApi  {
	
	/**
	 * This API is used by third party application when it want to call
	 * to create dossier Response message is cobId
	 * @param provider
	 * @param externalId
	 * @param sobDossier
	 * @return
	 */
    @POST
    @Path("/dossiers")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @ApiOperation(value = "new client onboarding dossier (COB)", 
    	notes = "Creates a new client onboarding (COB) dossier for swiss individuals.", 
    	response = ResponseMessage.class, tags={ "dossier" })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "dossier creation response with the individual client onboarding identifier of the new dossier. Only valid data will be mapped. For some invalid data will be map as null.", response = ResponseMessage.class),
        @ApiResponse(code = 500, message = "exception on server side when create new dossier, for some required field when invalid data it will throw mapping exception and dossier will not be created.", response = ResponseExceptionMessage.class),
        @ApiResponse(code = 400, message = "missing param for request", response = ResponseExceptionMessage.class)})
    public Response createIndividualCHDossier( @ApiParam(value = "the provider which is requesting the new COB dossier.", required = true) @QueryParam("provider") @NotNull  String provider, 
    					@ApiParam(value = "the external identification key as used by the provider.", required = true) @QueryParam("externalId") @NotNull  String externalId, 
    					@ApiParam(value = "data to use for the new dossier, such as personal details and adress", required = true)  SobDossier sobDossier) {
    	if (StringUtils.isBlank(provider) || StringUtils.isBlank(externalId) || sobDossier == null) {
  	      return Response.status(Status.BAD_REQUEST).entity(new ResponseExceptionMessage()
	  			.errorCode(DossierCreationServiceExceptionType.BAD_REQUEST.getCode() +"")
	  			.message("Invalid params")).build();
  	  }
        return new CreateDossierHandlerService().createIndividualCHDossier(provider, externalId, sobDossier);
    }
}

