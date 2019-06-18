
package pe.aemsa.evalua.java.cap08.clases.view;

public class CV1005v01SobreCargaConstructor {

    public static void main(String[] args) {
        // Crea los cubos utilizando los distintos constructores

        Cubo oCaja1 = new Cubo(10, 20, 25);
        Cubo oCaja2 = new Cubo(7);
        Cubo oCaja3 = new Cubo();

        double lDblVolumen;

        lDblVolumen = oCaja1.volumen();
        System.out.println("Volumen de la caja1 = " + lDblVolumen);

        lDblVolumen = oCaja2.volumen();
        System.out.println("Volumen de la caja2 = " + lDblVolumen);

        lDblVolumen = oCaja3.volumen();
        System.out.println("Volumen de la caja3 = " + lDblVolumen);
    }

}
