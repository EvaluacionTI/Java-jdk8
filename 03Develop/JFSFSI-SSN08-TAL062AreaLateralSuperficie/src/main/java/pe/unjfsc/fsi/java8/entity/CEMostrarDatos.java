package pe.unjfsc.fsi.java8.entity;

public class CEMostrarDatos {
    private double valorPI;
    private CEAreaSuperficieLateral oCELsa;
    private CEAreaTotalSuperficie oCETsa;
    private String rotarIzquierdaDerecha;
    private String enMinuscula;
    private String enMayuscula;
    private String primerUltimoCaracter;

    public double getValorPI() {
        return valorPI;
    }

    public void setValorPI(double valorPI) {
        this.valorPI = valorPI;
    }

    public CEAreaSuperficieLateral getoCELsa() {
        return oCELsa;
    }

    public void setoCELsa(CEAreaSuperficieLateral oCELsa) {
        this.oCELsa = oCELsa;
    }

    public CEAreaTotalSuperficie getoCETsa() {
        return oCETsa;
    }

    public void setoCETsa(CEAreaTotalSuperficie oCETsa) {
        this.oCETsa = oCETsa;
    }

    public String getRotarIzquierdaDerecha() {
        return rotarIzquierdaDerecha;
    }

    public void setRotarIzquierdaDerecha(String rotarIzquierdaDerecha) {
        this.rotarIzquierdaDerecha = rotarIzquierdaDerecha;
    }

    public String getEnMinuscula() {
        return enMinuscula;
    }

    public void setEnMinuscula(String enMinuscula) {
        this.enMinuscula = enMinuscula;
    }

    public String getEnMayuscula() {
        return enMayuscula;
    }

    public void setEnMayuscula(String enMayuscula) {
        this.enMayuscula = enMayuscula;
    }

    public String getPrimerUltimoCaracter() {
        return primerUltimoCaracter;
    }

    public void setPrimerUltimoCaracter(String primerUltimoCaracter) {
        this.primerUltimoCaracter = primerUltimoCaracter;
    }

    @Override
    public String toString() {
        return "CEMostrarDatos{" + "valorPI=" + valorPI + ", oCELsa=" + oCELsa + ", oCETsa=" + oCETsa + ", rotarIzquierdaDerecha=" + rotarIzquierdaDerecha + ", enMinuscula=" + enMinuscula + ", enMayuscula=" + enMayuscula + ", primerUltimoCaracter=" + primerUltimoCaracter + '}';
    }
}
