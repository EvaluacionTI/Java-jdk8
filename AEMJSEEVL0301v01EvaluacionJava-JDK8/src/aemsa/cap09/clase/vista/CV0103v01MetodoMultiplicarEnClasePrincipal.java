package aemsa.cap09.clase.vista;

public class CV0103v01MetodoMultiplicarEnClasePrincipal {

    public static void main(String[] args) {
           // 1.0 Declarando variables miembro, estas se expresaran con el prefijo m.
        String mCadena;
        int mPrimerNumero;
        int mSegundoNumero;
        int mResultado;
        
          // 2.0 Asignado valores a las variables
        mCadena = "Tabla de Multiplicar del 7";
        mPrimerNumero = 7;
        mSegundoNumero = 1;
        
        // 3.0 Llamando al metodo 
        mResultado = resultadoMultiplicar(mPrimerNumero, mSegundoNumero);
        System.out.println("El resultado de " + mPrimerNumero + " * " + mSegundoNumero + " = " + mResultado);

        mSegundoNumero = 2;
        mResultado = resultadoMultiplicar(mPrimerNumero, mSegundoNumero);
        System.out.println("El resultado de " + mPrimerNumero + " * " + mSegundoNumero + " = " + mResultado);

        mSegundoNumero = 3;
        mResultado = resultadoMultiplicar(mPrimerNumero, mSegundoNumero);
        System.out.println("El resultado de " + mPrimerNumero + " * " + mSegundoNumero + " = " + mResultado);

        mSegundoNumero = 4;
        mResultado = resultadoMultiplicar(mPrimerNumero, mSegundoNumero);
        System.out.println("El resultado de " + mPrimerNumero + " * " + mSegundoNumero + " = " + mResultado);

        mSegundoNumero = 5;
        mResultado = resultadoMultiplicar(mPrimerNumero, mSegundoNumero);
        System.out.println("El resultado de " + mPrimerNumero + " * " + mSegundoNumero + " = " + mResultado);        

        mSegundoNumero = 6;
        mResultado = resultadoMultiplicar(mPrimerNumero, mSegundoNumero);
        System.out.println("El resultado de " + mPrimerNumero + " * " + mSegundoNumero + " = " + mResultado);

        mSegundoNumero = 7;
        mResultado = resultadoMultiplicar(mPrimerNumero, mSegundoNumero);
        System.out.println("El resultado de " + mPrimerNumero + " * " + mSegundoNumero + " = " + mResultado);

        mSegundoNumero = 8;
        mResultado = resultadoMultiplicar(mPrimerNumero, mSegundoNumero);
        System.out.println("El resultado de " + mPrimerNumero + " * " + mSegundoNumero + " = " + mResultado);

        mSegundoNumero = 9;
        mResultado = resultadoMultiplicar(mPrimerNumero, mSegundoNumero);
        System.out.println("El resultado de " + mPrimerNumero + " * " + mSegundoNumero + " = " + mResultado);

        mSegundoNumero = 10;
        mResultado = resultadoMultiplicar(mPrimerNumero, mSegundoNumero);
        System.out.println("El resultado de " + mPrimerNumero + " * " + mSegundoNumero + " = " + mResultado);

        mSegundoNumero = 11;
        mResultado = resultadoMultiplicar(mPrimerNumero, mSegundoNumero);
        System.out.println("El resultado de " + mPrimerNumero + " * " + mSegundoNumero + " = " + mResultado);

        mSegundoNumero = 12;
        mResultado = resultadoMultiplicar(mPrimerNumero, mSegundoNumero);
        System.out.println("El resultado de " + mPrimerNumero + " * " + mSegundoNumero + " = " + mResultado);
    }

    // 4.0 Creando el metodo     
    static int resultadoMultiplicar(int pValor1, int pValor2){
        return pValor1 * pValor2;
    }
    
}
