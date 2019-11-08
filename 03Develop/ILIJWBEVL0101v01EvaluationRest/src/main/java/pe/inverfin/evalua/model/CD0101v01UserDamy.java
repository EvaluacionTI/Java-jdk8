package pe.inverfin.evalua.model;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import pe.inverfin.evalua.entity.CE0101v01User;

public class CD0101v01UserDamy {

    private static final Logger MOLOG = Logger.getLogger("CD0101v01UserDamy");

    private Map<Long, CE0101v01User> oMapResult = new HashMap<>();
    private CE0101v01User oCEUser;
    private Long currentId = (long) 100;

    // 1. Return all collections
    public Collection<CE0101v01User> findAll() {
        MOLOG.log(Level.INFO, "findAll : {0}", oMapResult.size());
        return oMapResult.values();
    }

    // 2. Find the usuario with this id
    public Optional<CE0101v01User> findById(Long pId) {
        oCEUser = new CE0101v01User();

        MOLOG.log(Level.INFO, "Before - CE0101v01User : {0}", oCEUser.toString());

        if (oMapResult.containsKey(pId)) {
            oCEUser = oMapResult.get(pId);
        }
        MOLOG.log(Level.INFO, "Afther - CE0101v01User : {0}", oCEUser.toString());

        return Optional.ofNullable(oCEUser);
    }

    // 3. Save new usuario
    public CE0101v01User saveUser(CE0101v01User poCEUser) {
        oCEUser = new CE0101v01User();

        MOLOG.log(Level.INFO, "Before - CE0101v01User : {0}", poCEUser.toString());

        oCEUser.setId(poCEUser.getId() + currentId++);
        oCEUser.setUsername(poCEUser.getUsername());
        oCEUser.setPassword(poCEUser.getPassword());
        oMapResult.put(oCEUser.getId(), oCEUser);

        MOLOG.log(Level.INFO, "Afther - CE0101v01User : {0}", oCEUser.toString());

        return oCEUser;
    }
    
    // 4. Update usuario
    public Optional<CE0101v01User> updateUser(CE0101v01User poCEUser){
         oCEUser = new CE0101v01User();

        MOLOG.log(Level.INFO, "Before - CE0101v01User : {0}", poCEUser.toString());
        oCEUser = oMapResult.get(poCEUser.getId());
        
        if (oCEUser != null){
            oMapResult.put(poCEUser.getId(), oCEUser);
            
        }
        return Optional.ofNullable(oCEUser);
    }
    
    // 5. Delete usuario
    public Optional<CE0101v01User> updateUser(Long piId){
         oCEUser = new CE0101v01User();

        MOLOG.log(Level.INFO, "Before - Id: {0}", piId);
        oCEUser = oMapResult.get(piId);
        
        if (oCEUser != null){
            oMapResult.remove(piId);
        }
        return Optional.ofNullable(oCEUser);
    }
}
