package aemsa.cap09.clase.vista;

import pe.aemsa.cap09.clase.CO1901v01DeclararVariable;


public class CV0202v03DeclararVariable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     CO1901v01DeclararVariable oVariable = new CO1901v01DeclararVariable();

     oVariable.mShrAno=100;
     oVariable.mShrDia=31;
     oVariable.mShrMes=7;

     oVariable.test();

     System.out.print(" Año " + oVariable.mShrAno);
     System.out.print(" Mes " + oVariable.mShrMes);
     System.out.print(" Dia " + oVariable.mShrDia);
    }

}
