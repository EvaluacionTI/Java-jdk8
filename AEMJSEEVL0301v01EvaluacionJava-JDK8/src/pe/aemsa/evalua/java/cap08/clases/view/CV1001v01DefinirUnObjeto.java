package pe.aemsa.evalua.java.cap08.clases.view;


class Caja{
        double mDblAncho;
        double mDblAltura;
        double mDblLargo;
}

public class CV1001v01DefinirUnObjeto {

    public static void main(String[] args) {
        Caja oMiCaja = new Caja();

        double lDblVolumen = 0;

        oMiCaja.mDblAltura = 10;
        oMiCaja.mDblAncho = 20;
        oMiCaja.mDblLargo = 15;

        lDblVolumen = oMiCaja.mDblAltura * oMiCaja.mDblAncho * oMiCaja.mDblLargo;

        System.out.println("El Volumen es = " + lDblVolumen);
    }

}
