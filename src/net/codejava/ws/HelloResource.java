package net.codejava.ws;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/Hello")
public class HelloResource {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String getIt() {
		return "GOT IT";
	}
		
		@GET
		@Produces(MediaType.TEXT_HTML)
		public String sayHTMLHello(){
			return "<html><title>Hello REST</title><body>"
					+"<h1>Hello, GOT IT</h1></body><html>";
		}
		
	}



