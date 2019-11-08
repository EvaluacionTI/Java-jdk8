package pe.inverfin.evalua.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import pe.inverfin.evalua.entity.CE0101v01User;
import pe.inverfin.evalua.model.CD0101v01UserDamy;

@Path("/users/")
public class CS0103v01RestFulUser {
    private CD0101v01UserDamy oCDUser;
    private Collection<CE0101v01User> oResultList;
    
    @GET
    public Collection<CE0101v01User> getUserAll(){
        oCDUser = new CD0101v01UserDamy();
        
        oResultList = oCDUser.findAll();
        
        return oResultList;
    }
}
