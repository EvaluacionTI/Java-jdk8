package pe.aemsa.cap12.java8.flujos.entidad;

public class CECruceCuenta {

    private String tipo;
    private String codigoTipo;
    private String codigoMoneda;
    private String numeroCuentaContable;
    private String descripcionCuenta;
    private String descripcionCruzada;
    private String numeroCuentaContablecruzada;
    private String codigoCruzada;
    private String descripcionCuentacruzada;
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCodigoTipo() {
        return codigoTipo;
    }

    public void setCodigoTipo(String codigoTipo) {
        this.codigoTipo = codigoTipo;
    }

    public String getCodigoMoneda() {
        return codigoMoneda;
    }

    public void setCodigoMoneda(String codigoMoneda) {
        this.codigoMoneda = codigoMoneda;
    }

    public String getNumeroCuentaContable() {
        return numeroCuentaContable;
    }

    public void setNumeroCuentaContable(String numeroCuentaContable) {
        this.numeroCuentaContable = numeroCuentaContable;
    }

    public String getDescripcionCuenta() {
        return descripcionCuenta;
    }

    public void setDescripcionCuenta(String descripcionCuenta) {
        this.descripcionCuenta = descripcionCuenta;
    }

    public String getDescripcionCruzada() {
        return descripcionCruzada;
    }

    public void setDescripcionCruzada(String descripcionCruzada) {
        this.descripcionCruzada = descripcionCruzada;
    }

    public String getNumeroCuentaContablecruzada() {
        return numeroCuentaContablecruzada;
    }

    public void setNumeroCuentaContablecruzada(String numeroCuentaContablecruzada) {
        this.numeroCuentaContablecruzada = numeroCuentaContablecruzada;
    }

    public String getCodigoCruzada() {
        return codigoCruzada;
    }

    public void setCodigoCruzada(String codigoCruzada) {
        this.codigoCruzada = codigoCruzada;
    }

    public String getDescripcionCuentacruzada() {
        return descripcionCuentacruzada;
    }

    public void setDescripcionCuentacruzada(String descripcionCuentacruzada) {
        this.descripcionCuentacruzada = descripcionCuentacruzada;
    }

    @Override
    public String toString() {
        return "CECruceCuenta{" + "tipo=" + tipo + ", codigoTipo=" + codigoTipo + ", codigoMoneda=" + codigoMoneda + ", numeroCuentaContable=" + numeroCuentaContable + ", descripcionCuenta=" + descripcionCuenta + ", descripcionCruzada=" + descripcionCruzada + ", numeroCuentaContablecruzada=" + numeroCuentaContablecruzada + ", codigoCruzada=" + codigoCruzada + ", descripcionCuentacruzada=" + descripcionCuentacruzada + '}';
    }

}
