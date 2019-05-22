package pe.aemsa.cap01.introduccion;

public class CV05v01IteracionFor {

    public static void main(String[] args) {
         // 1.0 Declarando variables miembro, estas se expresaran con el prefijo m.
        String mCadena;
        int mPrimerNumero;
        int mSegundoNumero;
        int mValorTope;
        int mResultado;
        
          // 2.0 Asignado valores a las variables
        mCadena = "Tabla de Multiplicar del 7";
        mPrimerNumero = 7;
        mSegundoNumero = 0;
        mValorTope = 12;
        
        System.out.println(mCadena);
        System.out.println("\n");
        for (mSegundoNumero = 1; mSegundoNumero < mValorTope; mSegundoNumero++){
            mResultado = mPrimerNumero * mSegundoNumero;
            System.out.println("El valor " + mPrimerNumero + " * " +  mSegundoNumero + " = " + mResultado);
        }
    }
}
