
package mc.dba.entidad;

public class CEDBAConexion {
    private String mstrDriver;
    private String mstrJDBC;
    private String mstrServidor;
    private String mstrPuerto;
    private String mstrInstancia;    
    private String mstrBaseDato;
    private String mstrUsuario;
    private String mstrClave;

    public String getDriver() {
        return mstrDriver;
    }

    public void setDriver(String mstrDriver) {
        this.mstrDriver = mstrDriver;
    }

    public String getJDBC() {
        return mstrJDBC;
    }

    public void setJDBC(String mstrJDBC) {
        this.mstrJDBC = mstrJDBC;
    }

    public String getServidor() {
        return mstrServidor;
    }

    public void setServidor(String mstrServidor) {
        this.mstrServidor = mstrServidor;
    }

    public String getPuerto() {
        return mstrPuerto;
    }

    public void setPuerto(String mstrPuerto) {
        this.mstrPuerto = mstrPuerto;
    }

    public String getInstancia() {
        return mstrInstancia;
    }

    public void setInstancia(String mstrInstancia) {
        this.mstrInstancia = mstrInstancia;
    }

    public String getBaseDato() {
        return mstrBaseDato;
    }

    public void setBaseDato(String mstrBaseDato) {
        this.mstrBaseDato = mstrBaseDato;
    }

    public String getUsuario() {
        return mstrUsuario;
    }

    public void setUsuario(String mstrUsuario) {
        this.mstrUsuario = mstrUsuario;
    }

    public String getClave() {
        return mstrClave;
    }

    public void setClave(String mstrClave) {
        this.mstrClave = mstrClave;
    }
}
