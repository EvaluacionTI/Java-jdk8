package aemsa.cap09.clase.vista;

class Caja2{
        double mDblAncho;
        double mDblAltura;
        double mDblLargo;
}

public class CV1003v01DefinirDosObjetos {

    public static void main(String[] args) {

        Caja2 oMiCaja = new Caja2();
        Caja2 oMiCaja1 = new Caja2();

        double lDblVolumen;

        oMiCaja.mDblAltura = 10;
        oMiCaja.mDblAncho = 20;
        oMiCaja.mDblLargo = 15;

        lDblVolumen = oMiCaja.mDblAltura * oMiCaja.mDblAncho * oMiCaja.mDblLargo;

        System.out.println("El Volumen es = " + lDblVolumen);

        oMiCaja1.mDblAltura = 3;
        oMiCaja1.mDblAncho = 6;
        oMiCaja1.mDblLargo = 9;

        lDblVolumen = oMiCaja1.mDblAltura * oMiCaja1.mDblAncho * oMiCaja1.mDblLargo;

        System.out.println("El Volumen es = " + lDblVolumen);


    }

}
