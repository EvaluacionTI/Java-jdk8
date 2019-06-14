package aemsa.cap09.clase;

public class CO01v01VisualizarImpuesto {
    // Variables que son miembros de la clase
    public int miTipoOperacion;  //Por default es public
    public double mdResultadoTotal;
    public double mdResultadoMultiplicacion;
    public double mdResultadoDivision;
    public double mdResultadoFormula;

    public void suma(){
        // Variable del metodo, su ambito solo es para el metodo.
        int iTipoConsulta;
        double dResultado = 0;
        double dValorInicial = 100;
        double dValorFinal = 45.95;

        dResultado = dValorInicial + dValorFinal;

        System.out.print("Resultado de la Suma =" + dResultado);
        // Para cambiar linea pordemo utilizar
        System.out.print("\n");

    }

    public void resta(){
        //Al declarar una variable igual al de otro metodo son diferentes
        // Porque su accion de la variables solo es en el metodo que se utilida
        double dResultado = 0;
        double dValorInicial = 400;
        double dValorFinal = 4.95;

        dResultado = dValorInicial - dValorFinal;

        System.out.print("Resultado de la Resta =" + dResultado);
    }

    public double multiplicacion(){
        double dResultado = 0;
        double dValorInicial = 80;
        double dValorFinal = 5.95;

        return mdResultadoMultiplicacion = dValorInicial * dValorFinal;
    }

    public double division(){
        double dResultado = 0;
        double dValorInicial = 9100;
        double dValorFinal = 645.95;

        return mdResultadoDivision = dValorInicial / dValorFinal;
    }

    private void integrar(){

    }

    public double calcularFormula(){
        double iBaseImponible = 4566.96;
        mdResultadoFormula = ((((iBaseImponible * 19)/100) - 4) + 10);
        return mdResultadoFormula;
    }

}
