package pe.inverfin.evalua.rest.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.HEAD;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import pe.inverfin.evalua.rest.entity.CE0101v01User;

@Path("/users")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CC0103v01UserService {

    //User database pre-initialization
    private static final List<CE0101v01User> oListUser = new ArrayList<>();

    static {
        oListUser.add(new CE0101v01User(5L, "Esteban", "05012002"));
        oListUser.add(new CE0101v01User(22L, "Illari", "22082014"));
        oListUser.add(new CE0101v01User(30L, "Alexei", "30072017"));
        oListUser.add(new CE0101v01User(9L, "Cristóbal", "09112018"));
    }

    @GET
    public Response findAllUsers() {
        return Response.ok(oListUser).build();
    }

    @POST
    public Response createUser(CE0101v01User poCEUser) {
        poCEUser.setId(oListUser.size() + 30L);
        oListUser.add(poCEUser);
        return Response.ok(poCEUser).build();
    }

    @PUT
    public Response updateuser(CE0101v01User poCEUser) {
        List<CE0101v01User> found;
        found = oListUser.stream().filter(x -> poCEUser.getId() == x.getId()).collect(Collectors.toList());

        //Throws error in case of the user not found
        if (found.isEmpty()) {
            return Response.status(Status.BAD_REQUEST).entity("User not found").build();
        }

        CE0101v01User oCEUserUpdate = found.get(0);
        oCEUserUpdate.setPassword(poCEUser.getPassword());
        oCEUserUpdate.setUsername(poCEUser.getUsername());

        return Response.ok(oCEUserUpdate).build();
    }
    
    @DELETE
    @Path("{idUser}")
    public Response deleteuser(@PathParam("idUser") Long piIdUser){
        List<CE0101v01User> oListFound = oListUser.stream().filter(x->piIdUser == x.getId().longValue()).collect(Collectors.toList());
        
        if (oListFound.isEmpty()) return Response.status(Status.BAD_REQUEST).entity("User not found").build();
        
        CE0101v01User oCEUserDelete = oListFound.get(0);
        oListUser.remove(oCEUserDelete);
        return Response.noContent().build();
    }

    
    @HEAD
    public Response pingUserService(){
        return Response.noContent().header("running service Evaluation Rest", true).build();
    }
}
