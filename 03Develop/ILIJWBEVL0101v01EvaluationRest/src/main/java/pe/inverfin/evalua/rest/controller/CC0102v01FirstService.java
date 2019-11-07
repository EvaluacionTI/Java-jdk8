package pe.inverfin.evalua.rest.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Path("/message")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CC0102v01FirstService {
    private static final Logger MOLOG = LoggerFactory.getLogger(CC0102v01FirstService.class);
    
    @GET
    public Response showMessage(){
        String lsMessage = "Show evaluation Rest using Java 8";
    
        MOLOG.info("[EVL] Show", lsMessage);

        return Response.ok(lsMessage, MediaType.APPLICATION_JSON).build();
    }
}
