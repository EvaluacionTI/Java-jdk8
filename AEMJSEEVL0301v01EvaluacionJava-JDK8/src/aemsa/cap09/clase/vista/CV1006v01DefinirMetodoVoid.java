package aemsa.cap09.clase.vista;

class Box{
        double mDblAncho;
        double mDblAltura;
        double mDblLargo;

        void volumen(){
            System.out.println(" Volumen es =" + mDblAncho *mDblAltura * mDblLargo);
        }
}

public class CV1006v01DefinirMetodoVoid {

    public static void main(String[] args) {
        try{
            Box oMiCaja = new Box();
            Box oMiCaja1 = new Box();

            oMiCaja.mDblAltura = 10;
            oMiCaja.mDblAncho = 20;
            oMiCaja.mDblLargo = 15;

            oMiCaja.volumen();


            oMiCaja1.mDblAltura = 3;
            oMiCaja1.mDblAncho = 6;
            oMiCaja1.mDblLargo = 9;

            oMiCaja1.volumen();

        }catch(Exception ex){
            ex.printStackTrace();
        }


    }

}
