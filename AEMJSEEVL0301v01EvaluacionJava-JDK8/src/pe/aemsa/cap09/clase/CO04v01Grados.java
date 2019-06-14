
package pe.aemsa.cap09.clase;

public class CO04v01Grados {
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
