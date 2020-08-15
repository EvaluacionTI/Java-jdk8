package pe.unjfsc.fsi.java8.entity;

public class CEDatos {
    private int a;
    private int b;
    private int c;
    
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "CEDatos{" + "a=" + a + ", b=" + b + ", c=" + c + '}';
    }
}
