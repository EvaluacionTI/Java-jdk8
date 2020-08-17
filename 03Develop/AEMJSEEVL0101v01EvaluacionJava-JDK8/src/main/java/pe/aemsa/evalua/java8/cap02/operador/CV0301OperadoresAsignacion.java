package aemsa.cap02.operador;

public class CV0301OperadoresAsignacion {

    public static void main(String[] args) {

        // 1. Declaracion e inicializacion de variables
        int mValorUno = 1;
        int mValorDos = 2;
        int mValorTres = 3;
        double mValorCuatro = 7;
        double mValorCinco = 7;
        double mValorSeis = 180;
        
        // 2. Operaciones con los Operadores de Asignacion 
        mValorUno += 5;  // mValorUno = mValorUno + 5
        mValorDos -= 4; // mValorDos = mValorDos - 4
        mValorTres *= 8; // mValorTres = mValorTres * 8
        mValorCuatro /= 3; // mValorCuatro = mValorCuatro / 3
        
        // mValorCinco = mValorCinco + (mValorUno * mValorDos)
        mValorCinco += mValorUno * mValorDos; 
        
        // mValorSeis = mValorSeis / 6 es una division que obtiene el resto
        mValorSeis %= 6;  // mValorSeis = mValorSeis % 6
        
        // 3. Impresiones de valores de los Operadores
        System.out.println("Operador += " + mValorUno);
        System.out.println("Operador - = " + mValorDos);
        System.out.println("Operador *= " + mValorTres);
        System.out.println("Operador /= " + mValorCuatro);
        System.out.println("Operador += " + mValorCinco);
        System.out.println("Operador %= " + mValorSeis);
    }

}
