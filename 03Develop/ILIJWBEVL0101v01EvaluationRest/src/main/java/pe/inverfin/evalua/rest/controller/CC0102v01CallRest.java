
package pe.inverfin.evalua.rest.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/javaxwsrs")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CC0102v01CallRest {
    @GET
    public Response sayRestJava(){
        String lsMensaje = "Welcome Java Rest";
        return Response.ok(lsMensaje, MediaType.APPLICATION_JSON).build();
    }
}
