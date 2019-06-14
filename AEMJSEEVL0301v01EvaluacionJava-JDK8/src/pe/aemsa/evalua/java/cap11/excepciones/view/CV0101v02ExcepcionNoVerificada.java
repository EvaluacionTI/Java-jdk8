package pe.aemsa.evalua.java.cap11.excepciones.view;

/*
    Excepciones no verificadas bajo el runtimexception
*/
public class CV0101v02ExcepcionNoVerificada {

    public static void main(String[] args) {
        int iNumeroA, iNumeroB, iResult=0;
        
        iNumeroA = 5;
        iNumeroB = 0;
        iResult = iNumeroA / iNumeroB;
        
        System.out.println(iResult);
    }
}
