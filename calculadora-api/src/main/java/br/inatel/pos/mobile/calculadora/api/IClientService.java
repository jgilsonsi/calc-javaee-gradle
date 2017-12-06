package br.inatel.pos.mobile.calculadora.api;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/client")
public interface IClientService {

	@POST
	void add(@FormParam("name") String name, @FormParam("email") String email);

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	String[] list();

}
