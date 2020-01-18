package org.itstep.controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;

import org.itstep.facade.ClienteFacade;
import org.itstep.model.Cliente;
@Path("/cliente")
public class ClienteController {
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/listaTudo")
	
	public List<Cliente> buscaCliente (@Context HttpHeaders httpHeaders) throws SQLException {
		
		List<Cliente> clientes = new ArrayList();
		
		ClienteFacade clienteFacade = new ClienteFacade();
		
		clientes = clienteFacade.buscaTodos();
		
		return clientes;
	}

}
