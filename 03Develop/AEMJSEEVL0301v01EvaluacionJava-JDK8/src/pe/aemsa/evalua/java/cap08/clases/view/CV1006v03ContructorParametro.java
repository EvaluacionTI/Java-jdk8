package pe.aemsa.evalua.java.cap08.clases.view;

class Caja4{
        double mDblAncho;
        double mDblAltura;
        double mDblLargo;

        Caja4(double pDblAncho, double pDblAltura, double pDblLargo){
            this.mDblAncho = pDblAncho;
            this.mDblAltura = pDblAltura;
            this.mDblLargo = pDblLargo;
        }

         double volumen(){
            return this.mDblAncho * this.mDblAltura * this.mDblLargo;
        }
}

public class CV1006v03ContructorParametro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
        Caja4 oMiCaja = new Caja4(10, 20, 15);
        Caja4 oMiCaja1 = new Caja4(3, 6, 9);

        System.out.println("Volumen de Caja = " + oMiCaja.volumen());

        System.out.println("Volumen de Caja = " + oMiCaja1.volumen());

        }catch(Exception ex){
            ex.printStackTrace();
        }

    }

}
