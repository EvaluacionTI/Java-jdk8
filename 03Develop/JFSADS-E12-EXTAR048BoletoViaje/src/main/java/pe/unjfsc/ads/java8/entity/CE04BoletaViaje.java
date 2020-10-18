package pe.unjfsc.ads.java8.entity;

public class CE04BoletaViaje {
    private String serie;
    private String numero;
    private CE03Pasajero oCEPasajero;
    private String fechaViaje;
    private String horaViaje;
    private String numeroAsiento;
    private double importe;

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public CE03Pasajero getoCEPasajero() {
        return oCEPasajero;
    }

    public void setoCEPasajero(CE03Pasajero oCEPasajero) {
        this.oCEPasajero = oCEPasajero;
    }

    public String getFechaViaje() {
        return fechaViaje;
    }

    public void setFechaViaje(String fechaViaje) {
        this.fechaViaje = fechaViaje;
    }

    public String getHoraViaje() {
        return horaViaje;
    }

    public void setHoraViaje(String horaViaje) {
        this.horaViaje = horaViaje;
    }

    public String getNumeroAsiento() {
        return numeroAsiento;
    }

    public void setNumeroAsiento(String numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    @Override
    public String toString() {
        return "CE04BoletaViaje{" + "serie=" + serie + ", numero=" + numero + ", oCEPasajero=" + oCEPasajero + ", fechaViaje=" + fechaViaje + ", horaViaje=" + horaViaje + ", numeroAsiento=" + numeroAsiento + ", importe=" + importe + '}';
    }

}
