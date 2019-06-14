package aemsa.cap09.clase.vista;

import pe.aemsa.cap09.clase.CO01v01VisualizarImpuesto;
import pe.aemsa.cap09.clase.CO05v01CalcularFormula;

public class CV1510v02CalcularImpuesto {

    public static void main(String[] args) {
        //Vamos ha definir un objeto para tener acceso a los metodo de suma y resta.
        CO01v01VisualizarImpuesto oCalcular = new CO01v01VisualizarImpuesto();

        //Con el objeto referenciado solo puedo visualizar los metodos publicos y
        // sus miembros declarados.
        // Los metod privados no pueden ser visualizados.

        //Estoy asignando un valor a la variable miembro de otra clase.
        oCalcular.miTipoOperacion = 1;

        //Estoy accediendo a los metodos de otra clase
        oCalcular.suma();
        oCalcular.resta();
        
        // Las variables public aun no tiene valores
        System.out.println("Resultado de la Multiplicacion" +
                    oCalcular.mdResultadoMultiplicacion);

        System.out.println("Resultado de la Division" +
                    oCalcular.mdResultadoDivision);

       // Asignado un metodo a las variable miembro
        oCalcular.mdResultadoMultiplicacion = oCalcular.multiplicacion();
        System.out.println("Resultado de la Multiplicacion" +
                    oCalcular.mdResultadoMultiplicacion);

        oCalcular.mdResultadoDivision = oCalcular.division();
        System.out.println("Resultado de la Division" +
                    oCalcular.mdResultadoDivision);

        oCalcular.mdResultadoFormula=oCalcular.calcularFormula();
        System.out.println("============================================") ;
        System.out.println("Formula Directa"+oCalcular.mdResultadoFormula) ;

        System.out.println("============================================") ;
        CO05v01CalcularFormula oImpuesto = new CO05v01CalcularFormula();

        oImpuesto.mdResultadoMultiplicacion=oImpuesto.multiplicacion();
        oImpuesto.mdResultadoDivision=oImpuesto.division();
        oImpuesto.mdResultadoResta=oImpuesto.resta();
        oImpuesto.mdResultadoSuma=oImpuesto.sumatoria();

        System.out.println("Formular Acumulativa = " +oImpuesto.mdResultadoSuma);
        
    }

}
