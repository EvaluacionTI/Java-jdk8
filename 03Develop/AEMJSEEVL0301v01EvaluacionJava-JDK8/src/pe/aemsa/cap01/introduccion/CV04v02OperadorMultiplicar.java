package pe.aemsa.cap01.introduccion;

public class CV04v02OperadorMultiplicar {
    
    public static void main(String[] args) {

        // La forma Numero 01
        System.out.println("Tabla Forma No 01");
        System.out.println("\n");
        System.out.println("Tabla del Siete");
        System.out.println("\n");
        System.out.println("7 * 1 = 7");
        System.out.println("7 * 2 = 14");
        System.out.println("7 * 3 = 21");
        System.out.println("7 * 4 = 28");
    
    
        // La forma Numero 02
        System.out.println("Tabla Forma No 02");
        System.out.println("\n");
        int mPrimerNumero = 7; // Inicializar variable
        int mSegundoNumero = 1;
        int mResultado = mPrimerNumero * mSegundoNumero;

        System.out.println("El valor " + mPrimerNumero + " * " + mSegundoNumero + " = " + mResultado);

        mSegundoNumero = 2;
        mResultado = mPrimerNumero * mSegundoNumero;
        System.out.println("El valor " + mPrimerNumero + " * " +
                                         mSegundoNumero + " = " + mResultado);

        mSegundoNumero = 3;
        mResultado = mPrimerNumero * mSegundoNumero;
        System.out.println("El valor " + mPrimerNumero + " * " + mSegundoNumero + " = " + mResultado);        
    
        mSegundoNumero = 4;
        mResultado = mPrimerNumero * mSegundoNumero;
        System.out.println("El valor " + mPrimerNumero + " * " + mSegundoNumero + " = " + mResultado);

        mSegundoNumero = 5;
        mResultado = mPrimerNumero * mSegundoNumero;
        System.out.println("El valor " + mPrimerNumero + " * " + mSegundoNumero + " = " + mResultado);                

        mSegundoNumero = 6;
        mResultado = mPrimerNumero * mSegundoNumero;
        System.out.println("El valor " + mPrimerNumero + " * " + mSegundoNumero + " = " + mResultado);

        mSegundoNumero = 7;
        mResultado = mPrimerNumero * mSegundoNumero;
        System.out.println("El valor " + mPrimerNumero + " * " + mSegundoNumero + " = " + mResultado);                

        mSegundoNumero = 8;
        mResultado = mPrimerNumero * mSegundoNumero;
        System.out.println("El valor " + mPrimerNumero + " * " + mSegundoNumero + " = " + mResultado);        
    
        mSegundoNumero = 9;
        mResultado = mPrimerNumero * mSegundoNumero;
        System.out.println("El valor " + mPrimerNumero + " * " + mSegundoNumero + " = " + mResultado);

        mSegundoNumero = 10;
        mResultado = mPrimerNumero * mSegundoNumero;
        System.out.println("El valor " + mPrimerNumero + " * " + mSegundoNumero + " = " + mResultado);                

        mSegundoNumero = 11;
        mResultado = mPrimerNumero * mSegundoNumero;
        System.out.println("El valor " + mPrimerNumero + " * " + mSegundoNumero + " = " + mResultado);

        mSegundoNumero = 12;
        mResultado = mPrimerNumero * mSegundoNumero;
        System.out.println("El valor " + mPrimerNumero + " * " + mSegundoNumero + " = " + mResultado);        
        

        // La forma Numero 03
        System.out.println("Tabla Forma No 03");
        System.out.println("\n");

        mPrimerNumero = 7;
        mSegundoNumero = 1;
        mResultado = resultadoCalculado(mPrimerNumero,mSegundoNumero);
        System.out.println("El valor " + mPrimerNumero + " * " +
                                         mSegundoNumero + " = " + mResultado);
        
        mSegundoNumero = 2;
        mResultado = resultadoCalculado(mPrimerNumero,mSegundoNumero);
        System.out.println("El valor " + mPrimerNumero + " * " + mSegundoNumero + " = " + mResultado);

        mSegundoNumero = 3;
        mResultado = resultadoCalculado(mPrimerNumero,mSegundoNumero);
        System.out.println("El valor " + mPrimerNumero + " * " + mSegundoNumero + " = " + mResultado);
    
        // La forma Numero 04
        System.out.println("Tabla Forma No 04");
        System.out.println("\n");
        
        int mMultiplicando = 7;
        int lTope = 12;
        for (int mMultiplicador=1;mMultiplicador<=lTope;mMultiplicador++){
            System.out.println("El valor " + mMultiplicando + " * " 
                                           + mMultiplicador + " = " 
                                           + mMultiplicando * mMultiplicador);
        }
        
        
    }
    
    static int resultadoCalculado(int pValor1, int pValor2){
        return pValor1 * pValor2;
    }

    
}
