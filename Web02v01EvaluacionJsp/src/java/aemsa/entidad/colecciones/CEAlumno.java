
package aemsa.entidad.colecciones;

public class CEAlumno {
    private int miCodigo;
    private String msNombre;

    public CEAlumno(int piCodigo, String psNombre){
        this.miCodigo = piCodigo;
        this.msNombre = psNombre;
    }
    
    public CEAlumno(){
        miCodigo = 0;
        msNombre = "";
    }
    
    public String getNombre() {
        return msNombre;
    }

    public void setNombre(String mNombre) {
        this.msNombre = mNombre;
    }

    public int getCodigo() {
        return miCodigo;
    }

    public void setCodigo(int iCodigo) {
        this.miCodigo = iCodigo;
    }
    
    
}
