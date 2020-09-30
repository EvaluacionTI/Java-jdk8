package pe.unjfsc.ads.java8.entity;

public class CEMostrarDatos {
    private double valorPI;
    private CEAreaSuperficieLateral oCELsa;
    private CEAreaTotalSuperficie oCETsa;
    private String rotarIzquiedaDerecha;
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

    public String getRotarIzquiedaDerecha() {
        return rotarIzquiedaDerecha;
    }

    public void setRotarIzquiedaDerecha(String rotarIzquiedaDerecha) {
        this.rotarIzquiedaDerecha = rotarIzquiedaDerecha;
    }

    public String getPrimerUltimoCaracter() {
        return primerUltimoCaracter;
    }

    public void setPrimerUltimoCaracter(String primerUltimoCaracter) {
        this.primerUltimoCaracter = primerUltimoCaracter;
    }

    @Override
    public String toString() {
        return "CEMostrarDatos{" + "valorPI=" + valorPI + ", oCELsa=" + oCELsa + ", oCETsa=" + oCETsa + ", rotarIzquiedaDerecha=" + rotarIzquiedaDerecha + ", primerUltimoCaracter=" + primerUltimoCaracter + '}';
    }

    
}
