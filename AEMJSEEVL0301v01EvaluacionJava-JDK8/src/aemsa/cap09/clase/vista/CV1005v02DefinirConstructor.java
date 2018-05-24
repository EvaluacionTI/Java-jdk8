package aemsa.cap09.clase.vista;

class Caja3{
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

        Caja3(){
            System.out.println("Construyendo un Constructor");
            mDblAncho = 10;
            mDblAltura = 10;
            mDblLargo = 20;

        }
}

public class CV1005v02DefinirConstructor {

    public static void main(String[] args) {
        try{
            Caja3 oMiCaja = new Caja3();
            Caja3 oMiCaja1 = new Caja3();

            System.out.println("El Volumen es = " + oMiCaja.getVolumen());

            System.out.println("El Volumen es = " +  oMiCaja1.getVolumen());

        }catch(Exception ex){
            ex.printStackTrace();
        }

    }

}
