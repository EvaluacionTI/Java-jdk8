package pe.aemsa.evalua.java.cap08.clases.view;

class Cubo{
    double mDblAncho;
    double mDblAlto;
    double mDblLargo;

    double volumen(){
        return this.mDblAlto * this.mDblAncho * this.mDblLargo;
    }

    // Constructor que se utiliza cuando no se especifican todas las dimensiones
    Cubo(){
        this.mDblAlto=-1;
        this.mDblAncho=-1;
        this.mDblLargo=-1;
    }

    // Constructor cuando se utiliza para crear un cubo
    Cubo(double pDblLongitud){
        this.mDblAlto=this.mDblAncho=this.mDblLargo=pDblLongitud;
    }

    // Constructor que se utiliza cuando se especifican todas las dimensiones
    Cubo(double pDblAncho, double pDblAlto, double pDblLargo){
        this.mDblAncho=pDblAncho;
        this.mDblLargo=pDblLargo;
        this.mDblAlto=pDblAlto;
    }

    // Constructor que crea una copia identica a un objeto
    Cubo(Cubo poCubo){
        this.mDblAlto=poCubo.mDblAlto;
        this.mDblAncho=poCubo.mDblAncho;
        this.mDblLargo=poCubo.mDblLargo;
    }

}

public class CV1102v01ObjetoParametro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Cubo oCaja1 = new Cubo(10, 20, 25);
        Cubo oCaja2 = new Cubo(7);
        Cubo oCaja3 = new Cubo();
        Cubo oCajaObjeto = new Cubo(oCaja2);

        double lDblResultado;

        lDblResultado = oCaja2.volumen();
        System.out.println("Volumen del Cubo = " + lDblResultado);

        //Se objetiene el volumen del objeto
        lDblResultado = oCajaObjeto.volumen();
        System.out.println("Volumen del Objeto Cubo = " + lDblResultado);
        
    }

}
