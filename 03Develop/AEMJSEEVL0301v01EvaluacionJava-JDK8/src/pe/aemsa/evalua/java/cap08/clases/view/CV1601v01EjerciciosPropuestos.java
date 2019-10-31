
package pe.aemsa.evalua.java.cap08.clases.view;


public class CV1601v01EjerciciosPropuestos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        CPreguntaUno oPregunta = new CPreguntaUno();
        
        oPregunta.msgBienvenida();

        COperacionError oError = new COperacionError();
        oError.evaluarOperaciones();

        CPreguntaTres oPreguntaTres = new CPreguntaTres();

        oPreguntaTres.asignarCoeficientes(5, -1.7, 2);
        System.out.println("Resultado 3 = " + oPreguntaTres.evaluarEcuacion(10.5));

        CPreguntaCuatro oPreguntaCuatro = new CPreguntaCuatro();
        
        oPreguntaCuatro.letraQmayuscula();
        oPreguntaCuatro.letraQminuscula();
        
        CPreguntaCinco oPreguntaCinco = new  CPreguntaCinco();
        oPreguntaCinco.asignarValores(15, 17, 20, 27);
        System.out.println("Resultado sumatoria = " + oPreguntaCinco.calcularSumatoria());
        System.out.println("Resultado promedio = " + oPreguntaCinco.calcularPromedio(4));


        CPreguntaSeis oPreguntaSeis = new  CPreguntaSeis();
        oPreguntaSeis.asignarCoeficientes(1, 5, 2);
        System.out.println("Resultado 6 = " + oPreguntaSeis.evaluarEcuacion());

    }
}

class CPreguntaSeis{
    double mDblCoeficiente1, mDblCoeficiente2, mDblCoeficiente3;

    public void asignarCoeficientes(double pDblCoeficiente1,double pDblCoeficiente2, double pDblCoeficiente3){
        this.mDblCoeficiente1=pDblCoeficiente1;
        this.mDblCoeficiente2=pDblCoeficiente2;
        this.mDblCoeficiente3=pDblCoeficiente3;
    }

    public double evaluarEcuacion(){
        double lDblResultado;

        lDblResultado = (mDblCoeficiente2 * mDblCoeficiente2 - 4 * mDblCoeficiente1 * mDblCoeficiente3) / (2 * mDblCoeficiente1);
        return lDblResultado;
    }
}

class CPreguntaCinco{
    int mIntvalor1, mIntvalor2, mIntvalor3, mIntvalor4;

    public void asignarValores(int pIntnumero1, int pIntnumero2, int pIntnumero3, int pIntnumero4){
        this.mIntvalor1=pIntnumero1;
        this.mIntvalor2=pIntnumero2;
        this.mIntvalor3=pIntnumero3;
        this.mIntvalor4=pIntnumero4;
    }

    public double calcularSumatoria(){
        return this.mIntvalor1+this.mIntvalor2+this.mIntvalor3+this.mIntvalor4;
    }

    public double calcularPromedio(int pIntCantidadValores){
        double lDblResultado;

        lDblResultado = (this.mIntvalor1+this.mIntvalor2+this.mIntvalor3+this.mIntvalor4)/pIntCantidadValores;

        return lDblResultado;
    }
}
class CPreguntaCuatro{
    public void letraQminuscula(){
        char mChrletra = 'q';

        System.out.println("Minuscula q = " + mChrletra);
        System.out.println("Conversion " + (int)mChrletra);
    }

    public void letraQmayuscula(){
        char mChrletra = 'Q';

        System.out.println("Mayuscula Q = " + mChrletra);
        System.out.println("Conversion " + (int)mChrletra);
    }

}
class CPreguntaTres{
    double mDblCoeficiente1, mDblCoeficiente2, mDblCoeficiente3;

    public void asignarCoeficientes(double pDblCoeficiente1,double pDblCoeficiente2, double pDblCoeficiente3){
        this.mDblCoeficiente1=pDblCoeficiente1;
        this.mDblCoeficiente2=pDblCoeficiente2;
        this.mDblCoeficiente3=pDblCoeficiente3;
    }

    public double evaluarEcuacion(double pDblvariable){
        double lDblRespuesta;

        lDblRespuesta = mDblCoeficiente1 * pDblvariable * pDblvariable * pDblvariable + mDblCoeficiente2 * pDblvariable * pDblvariable + mDblCoeficiente3 * pDblvariable + 3;
        return lDblRespuesta;
    }
}

class COperacionError{
    public void evaluarOperaciones(){
        int a=10, b=3, c=1, d, e;
        float x, y;
        
        x = a/b;
        //c = (a<b) && c;
        d = a + b++;
        System.out.println(" b++ =" + b++);
        e= ++a - b;
        System.out.println(" ++a =" + ++a);
        y = (float)a/b;

        System.out.println(" a/ b =" + x);
        System.out.println(" a+ b++ =" + d);
        System.out.println(" ++a - b =" + e);
        System.out.println(" (float) a/ b = " + y);

    }
}

class CPreguntaUno{

    public void msgBienvenida(){
        String cStrMsg1 = "Bienvenido al mundo de Java";
        String cStrMsg2 = "Podrás dar solución a muchos problemas";

        System.out.println(cStrMsg1);
        System.out.print("");
        System.out.println(cStrMsg2);
    }

}
