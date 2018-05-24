
package aemsa.entidad.servlet;

public class CEProducto {
    private int id;
    private String concepto;
    private double importe;

    public CEProducto(){
        super();
    }
    
    public CEProducto(int pid, String pconcepto, double pimporte){
        super();
        this.id = pid;
        this.concepto = pconcepto;
        this.importe = pimporte;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }
    
}
