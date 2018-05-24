package aemsa.entidad.bean;

public class CEUsuarioBean {
    
    private String loginBD = "Mery";
    private String passwordBD = "15172027";
    private String login = "";
    private String password = "";

    public String getLogin() {
      return login;
    }

    public String getPassword() {
      return password;
    }

    public void setLogin(String str) {
      login = str;
    }

    public void setColumnas(String str) {
      password = str;
    }

    public boolean validar() {
      if (login.equals(loginBD) == true && password.equals(passwordBD) == true)
        return true;

      return false;
    }
    public boolean validar(String log, String pass) {
      login = log;
      password = pass;
      if (login.equals(loginBD) == true && password.equals(passwordBD) == true)
        return true;

      return false;
    }
}
