package pe.inverfin.evalua.entity;

public class CE0101v01User {

    private Long id;
    private String username;
    private String password;

    public CE0101v01User() {
    }

    public CE0101v01User(Long piId, String psUserName, String psPassWord) {
        this.id = piId;
        this.username = psUserName;
        this.password = psPassWord;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "CE0101v01User{" + "id=" + id + ", username=" + username + ", password=" + password + '}';
    }

}
