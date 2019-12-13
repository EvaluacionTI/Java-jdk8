package pe.bbva.evalua.java8.anualidad.entity;

public class CEAnualidad {
    private double valor;
    private double tasAnual;
    private int periodoDias;
    private int frecuenciaDias;
    
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getTasAnual() {
        return tasAnual;
    }

    public void setTasAnual(double tasAnual) {
        this.tasAnual = tasAnual;
    }

    public int getPeriodoDias() {
        return periodoDias;
    }

    public void setPeriodoDias(int periodoDias) {
        this.periodoDias = periodoDias;
    }

    public int getFrecuenciaDias() {
        return frecuenciaDias;
    }

    public void setFrecuenciaDias(int frecuenciaDias) {
        this.frecuenciaDias = frecuenciaDias;
    }

    @Override
    public String toString() {
        return "CEAnualidad{" + "valor=" + valor + ", tasAnual=" + tasAnual + ", periodoDias=" + periodoDias + ", frecuenciaDias=" + frecuenciaDias + '}';
    }

    
}
