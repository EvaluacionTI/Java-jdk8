package pe.etg.bbva.evalua.java8.utility.quiz;

public class CU0202v01ValidarOperacionBasica {

    private final int VALOR_TOPE_POSITIVO = 2147483646;
    private final int VALOR_CERO = 0;
    private final String SUPERO_VALOR_POSITIVO = "Ha superado el valor positivo";
    private final String DIVIDENDO_CERO = "El dividendo no debe ser cero";

    public CU0202v01ValidarOperacionBasica() {
    }

    public boolean validarNumeros(int piNumero1, int piNumero2) throws CU0201v01OperacionBasicaExcepcion {
        if (piNumero1 > VALOR_TOPE_POSITIVO) {
            throw new CU0201v01OperacionBasicaExcepcion(SUPERO_VALOR_POSITIVO);
        }
        
        if (piNumero2 > VALOR_TOPE_POSITIVO) {
            throw new CU0201v01OperacionBasicaExcepcion(SUPERO_VALOR_POSITIVO);
        }
        
        if (piNumero2 == VALOR_CERO) {
            throw new CU0201v01OperacionBasicaExcepcion(DIVIDENDO_CERO);
        }
        return true;
    }
}
