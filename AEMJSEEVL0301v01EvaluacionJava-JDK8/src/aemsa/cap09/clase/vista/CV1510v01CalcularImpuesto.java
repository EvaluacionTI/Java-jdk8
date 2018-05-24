package aemsa.cap09.clase.vista;

class ParametoValor{
    void valor(int i, int j){
        i *= 2;
        j /= 2;
    }
}

public class CV1510v01CalcularImpuesto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ParametoValor oArgumentoValor = new ParametoValor();

        int a=15, b = 20;

        System.out.println("a y b antes de llamar al metodo: " + a + " " + b);

        oArgumentoValor.valor(a, b);

        System.out.println("a y b despues de llamar al metodo: " + a + " " + b);
    }

}
