
package aemsa.cap09.clase.vista;

class COSobreCargaMetodos{
    void test(){
        System.out.println("No hay parametros");
    }

   /* Sobrecarga el metodo test con dos parametros enteros */
    void test(int a, int b){
        System.out.println("a y b " + a + "" + b);
    }

    double test(double a){
        System.out.println(" double a: " + a);
        return a*a;
    }
}

public class CV1004v02SobreCargaMetodoConversion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        COSobreCargaMetodos oSobreCarga = new COSobreCargaMetodos();
        int i = 88;
        double Resultado;

        oSobreCarga.test();
        oSobreCarga.test(10);
        oSobreCarga.test(10,20);
        /*
         * Estoy enviando un un valor entero pero existe una conversion automatica por el metodo sobrecargado
         * que recibe un valor double
         */
        System.out.println("Resultado de Tes(88) :" + oSobreCarga.test(i));
        Resultado = oSobreCarga.test(123.25);

        System.out.println("Resultado de Tes(123.25) :" + Resultado);
    }

}
