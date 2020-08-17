package pe.aemsa.evalua.java.cap11.excepciones.entity;

public class CV01v01EvaluaExcepcion {

    public static void main(String[] args) {
        int x = 0;
        CO01v02ClaseExcepcion obj = new CO01v02ClaseExcepcion();
        try {
            obj.m(x);
        } catch (CO01v01EValorNoValido e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Contin�a la ejecuci�n");
    }
}
