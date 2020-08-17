package pe.unjfsc.ads.java8.entity;

public class CENumberPrimo {
    private int primo1;
    private int primo2;
    private int primo3;

    public int getPrimo1() {
        return primo1;
    }

    public void setPrimo1(int primo1) {
        this.primo1 = primo1;
    }

    public int getPrimo2() {
        return primo2;
    }

    public void setPrimo2(int primo2) {
        this.primo2 = primo2;
    }

    public int getPrimo3() {
        return primo3;
    }

    public void setPrimo3(int primo3) {
        this.primo3 = primo3;
    }

    @Override
    public String toString() {
        return "CENumberPrimo{" + "primo1=" + primo1 + ", primo2=" + primo2 + ", primo3=" + primo3 + '}';
    }
}
