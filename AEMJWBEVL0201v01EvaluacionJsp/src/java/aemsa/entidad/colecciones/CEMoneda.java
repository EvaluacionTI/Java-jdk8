
package aemsa.entidad.colecciones;

public class CEMoneda {
    private int miId ;
    private String msAbreviatura;
    private String msCodigoNumero;
    private String msCodigoLetra;
    private String msDescripcion;

    public CEMoneda(int piId, String psAbreviatura, String psCodigoNumero, String psCodigoLetra, String psDescripcion){
        this.miId = piId ;
        this.msAbreviatura = psAbreviatura;
        this.msCodigoNumero = psCodigoNumero;
        this.msCodigoLetra = psCodigoLetra;
        this.msDescripcion = psDescripcion;
    }

    public CEMoneda(){
        this.miId = 0;
        this.msAbreviatura="";
        this.msCodigoNumero="";
        this.msCodigoLetra="";
        this.msDescripcion="";
    }

    public int getId() {
        return miId;
    }

    public void setId(int miId) {
        this.miId = miId;
    }

    public String getAbreviatura() {
        return msAbreviatura;
    }

    public void setAbreviatura(String msAbreviatura) {
        this.msAbreviatura = msAbreviatura;
    }

    public String getCodigoNumero() {
        return msCodigoNumero;
    }

    public void setCodigoNumero(String msCodigoNumero) {
        this.msCodigoNumero = msCodigoNumero;
    }

    public String getCodigoLetra() {
        return msCodigoLetra;
    }

    public void setCodigoLetra(String msCodigoLetra) {
        this.msCodigoLetra = msCodigoLetra;
    }

    public String getDescripcion() {
        return msDescripcion;
    }

    public void setDescripcion(String msDescripcion) {
        this.msDescripcion = msDescripcion;
    }
    
}
