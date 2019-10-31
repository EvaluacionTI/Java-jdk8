
package pe.aemsa.evalua.java8.entity;

public class CEPrestamo {
    private double mDblMontoPrestamo;
    private double mDblTasa;

    public CEPrestamo(double pDblMontoPrestamo, double pDblTasa){
        this.mDblMontoPrestamo = pDblMontoPrestamo;
        this.mDblTasa = pDblTasa;
    }
    
    public double getmDblMontoPrestamo() {
        return mDblMontoPrestamo;
    }

    public void setmDblMontoPrestamo(double mDblMontoPrestamo) {
        this.mDblMontoPrestamo = mDblMontoPrestamo;
    }

    public double getmDblTasa() {
        return mDblTasa;
    }

    public void setmDblTasa(double mDblTasa) {
        this.mDblTasa = mDblTasa;
    }

}
