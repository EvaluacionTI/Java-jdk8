
package pe.unjfsc.fsi.java8.entity;

public class CESaldoAfiliado {
    private int id;
    private String codigoAfiliado;
    private double saldoCIC;
    
    public CESaldoAfiliado(){}
    
    public CESaldoAfiliado(int pId, String psCodigoAfiliado, double pdSaldoCIC){
        this.id = pId;
        this.codigoAfiliado = psCodigoAfiliado;
        this.saldoCIC = pdSaldoCIC;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigoAfiliado() {
        return codigoAfiliado;
    }

    public void setCodigoAfiliado(String codigoAfiliado) {
        this.codigoAfiliado = codigoAfiliado;
    }

    public double getSaldoCIC() {
        return saldoCIC;
    }

    public void setSaldoCIC(double saldoCIC) {
        this.saldoCIC = saldoCIC;
    }

    @Override
    public String toString() {
        return "CESaldoAfiliado{" + "id=" + id + ", codigoAfiliado=" + codigoAfiliado + ", saldoCIC=" + saldoCIC + '}';
    }

}
