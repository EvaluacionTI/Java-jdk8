package pe.aemsa.evalua.java.cap08.clases.view;

import pe.aemsa.evalua.java.cap08.clases.logical.impl.CM0101v01PerroExtendsOfAnimalAbstract;
import pe.aemsa.evalua.java.cap08.clases.logical.impl.CM0102v01AveExtendsOfAnimalAbstract;

public class CV0101v01EvaluarAbstractAnimal {
    public static void main(String[] psArg){
        CM0101v01PerroExtendsOfAnimalAbstract oCLPerro = new CM0101v01PerroExtendsOfAnimalAbstract();
        CM0102v01AveExtendsOfAnimalAbstract oCLAve = new CM0102v01AveExtendsOfAnimalAbstract();
        oCLPerro.comer();
        oCLPerro.moverse();
        
        oCLAve.comer();
        oCLAve.moverse();
    }
}
