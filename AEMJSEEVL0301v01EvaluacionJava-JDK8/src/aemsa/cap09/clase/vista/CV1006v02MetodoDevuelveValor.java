package aemsa.cap09.clase.vista;

class Box3{
        double mDblAncho;
        double mDblAltura;
        double mDblLargo;

        double getVolumen(){
            return mDblAncho * mDblAltura * mDblLargo;
        }

        void setDimension(double pDblAncho, double pDblAltura, double pDblLargo){
            mDblAncho = pDblAncho;
            mDblAltura = pDblAltura;
            mDblLargo = pDblLargo;
        }
}

public class CV1006v02MetodoDevuelveValor {

    public static void main(String[] args) {
        try{
        Box3 oMiCaja = new Box3();
        Box3 oMiCaja1 = new Box3();

        double lDblVolumen;

        oMiCaja.setDimension(10, 20, 15);

        lDblVolumen = oMiCaja.getVolumen();

        System.out.println("El Volumen es = " + lDblVolumen);

        oMiCaja1.setDimension(3, 6, 9);

        lDblVolumen = oMiCaja1.getVolumen();

        System.out.println("El Volumen es = " + lDblVolumen);

        }catch(Exception ex){
            ex.printStackTrace();
        }
    }

}
