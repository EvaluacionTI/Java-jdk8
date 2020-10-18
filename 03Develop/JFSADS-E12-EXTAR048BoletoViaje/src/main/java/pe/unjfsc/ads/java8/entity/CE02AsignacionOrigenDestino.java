package pe.unjfsc.ads.java8.entity;

public class CE02AsignacionOrigenDestino {
    private CE01Ciudad oCEOrigen;
    private CE01Ciudad oCEDestino;
    private double importe;

    public CE02AsignacionOrigenDestino(CE01Ciudad oCEOrigen, CE01Ciudad oCEDestino, double importe) {
        this.oCEOrigen = oCEOrigen;
        this.oCEDestino = oCEDestino;
        this.importe = importe;
    }

    public CE01Ciudad getoCEOrigen() {
        return oCEOrigen;
    }

    public void setoCEOrigen(CE01Ciudad oCEOrigen) {
        this.oCEOrigen = oCEOrigen;
    }

    public CE01Ciudad getoCEDestino() {
        return oCEDestino;
    }

    public void setoCEDestino(CE01Ciudad oCEDestino) {
        this.oCEDestino = oCEDestino;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }
    
    
}
