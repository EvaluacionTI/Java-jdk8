package pe.aemsa.evalua.java.cap11.excepciones.entity;

public class CO01v02ClaseExcepcion {
    // ...

    public void m(int a) throws CO01v01EValorNoValido {
        // ...
        if (a == 0) {
            throw new CO01v01EValorNoValido("Error: valor cero");
        }
        // ...
    }
    // ...
}
