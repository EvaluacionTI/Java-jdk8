package pe.aemsa.evalua.java.cap08.clases.logical.impl;

import pe.aemsa.evalua.java.cap08.clases.logical.CL0401v01AnimalAbstract;

public class CM0102v01AveExtendsOfAnimalAbstract extends CL0401v01AnimalAbstract{

    public CM0102v01AveExtendsOfAnimalAbstract(){
        super();
        setNombre("LOKI");
    }
    
    @Override
    public void moverse() {
        System.out.println("El ave esta volando");
    }
    
}
