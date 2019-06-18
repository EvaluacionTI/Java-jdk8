
package pe.aemsa.evalua.java.cap08.clases.view;

import pe.aemsa.evalua.java.cap08.clases.logical.CL0502Pila;


public class CV1201v01EvaluarPila {

    public static void main(String[] args) {
        CL0502Pila oPila1 = new CL0502Pila();
        CL0502Pila oPila2 = new CL0502Pila();

        for (int i=0;i<=10;i++) oPila1.Poner(i);
        for (int i=10;i<=20;i++) oPila2.Poner(i);

        System.out.println("Retiramos datos de la pila1");
        for (int i=0; i<10; i++)
            System.out.println(oPila1.Retira());

        System.out.println("Retiramos datos de la pila2");
            for (int i=0; i<10; i++)
                System.out.println(oPila2.Retira());
    }

}
