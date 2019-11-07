package pe.inverfin.evalua.rest.entity;

public class CE0101v01User {
    private Long id;
    private String username;
    private String password;
    
    public CE0101v01User(){}
    
    public CE0101v01User(Long piId, String psUserName, String psPassword){
        this.id = piId;
        this.username = psUserName;
        this.password = psPassword;
    }
    
    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
