package pe.aemsa.evalua.java.cap08.clases.logical.impl;

import pe.aemsa.evalua.java.cap08.clases.logical.CL0401v01AnimalAbstract;

public class CM0101v01PerroExtendsOfAnimalAbstract extends CL0401v01AnimalAbstract{

    // Al asignar super va ejecutar el constructor de la clase padre en este caso de la clase 
    public CM0101v01PerroExtendsOfAnimalAbstract(){
        super();
        setNombre("WAKAY");
    }
    
    @Override
    public void moverse() {
        System.out.println("El perro se está moviendo");
    }

}
