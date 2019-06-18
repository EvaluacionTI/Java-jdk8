package pe.aemsa.evalua.java.cap08.clases.view;

//////////////////////////////////////////////////////////////////
// Pila: lista en la que todas las inserciones y supresiones se
// hacen en un extremo de la misma.
//
public class CO16v03PilaCalculadoraConPila extends CO16v02ListaCircularSE {

    public CO16v03PilaCalculadoraConPila() {
    }

    public void meterEnPila(Object obj) {
        anadirAlPrincipio(obj);
    }

    public Object sacarDePila() {
        return borrar();
    }
}
//////////////////////////////////////////////////////////////////
