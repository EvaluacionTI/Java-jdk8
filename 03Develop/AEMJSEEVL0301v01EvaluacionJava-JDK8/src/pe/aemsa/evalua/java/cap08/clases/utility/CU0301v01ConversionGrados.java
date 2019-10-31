
package pe.aemsa.evalua.java.cap08.clases.utility;

public class CU0301v01ConversionGrados {
    private float mFltGradosCentigrado;

    public void asignarGradosCentigrados(float pFltGrados){
        this.mFltGradosCentigrado = pFltGrados;
    }

    public float obtenerGradosFahrenheit(){
        return ((9 * this.mFltGradosCentigrado) / 5 + 32);
    }

    public float obtenerGradosCentrigrados(){
        return this.mFltGradosCentigrado;
    }

}
