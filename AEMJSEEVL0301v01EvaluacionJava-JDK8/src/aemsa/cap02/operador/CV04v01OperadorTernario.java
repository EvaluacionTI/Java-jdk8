package aemsa.cap02.operador;

public class CV04v01OperadorTernario {

    public static void main(String[] args) {
        
        int mExamenParcial, mExamenFinal;
        double mPromedio;

        mExamenParcial = 10;
        mExamenFinal = 18;
        mPromedio = (mExamenParcial < mExamenFinal) ? (mExamenParcial + mExamenFinal) / 2 : mExamenFinal;

        System.out.println("Promedio Final  " + "\n");
        System.out.println("De " + (mExamenParcial + mExamenFinal) + " es " + mPromedio);

    }
    
}
