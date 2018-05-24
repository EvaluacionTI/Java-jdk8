
package aemsa.cap09.clase.vista;

class SobreCargaMetodos{
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
public class CV1004v01SobrecargaMetodos {


    public static void main(String[] args) {
        // TODO code application logic here
        SobreCargaMetodos oSobreCarga = new SobreCargaMetodos();
        double Resultado;

        oSobreCarga.test();
        oSobreCarga.test(10);
        oSobreCarga.test(10,20);
        Resultado = oSobreCarga.test(123.25);

        System.out.println("Resultado de Tes(123.25) :" + Resultado);

    }

}
