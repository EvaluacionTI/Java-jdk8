package pe.aemsa.evalua.java8.view;

import pe.aemsa.evalua.java8.entity.CEAlumno;
import pe.aemsa.evalua.java8.logical.CLHashAbierto;
import pe.aemsa.evalua.java8.logical.impl.CL0102v01LeerTipoDato;
import java.io.IOException;
import java.io.PrintStream;

//////////////////////////////////////////////////////////////////
// Aplicaci�n para trabajar con una matriz hash
//
public class CV0601v02TestHashAbiertoMatricula {

    public static void main(String[] args) throws IOException {
        // Definici�n de variables
        PrintStream flujoS = System.out;
        int n_elementos; // n�mero de elementos de la matriz hash
        int i;
        String nombre;
        int matricula;
        CEAlumno x;

        // Crear un objeto HashAbierto (encapsula la matriz hash)
        System.out.println("numero de elementos:  ");
        n_elementos = CL0102v01LeerTipoDato.datoInt();
        CLHashAbierto m = new CLHashAbierto(n_elementos) {
            @Override
            public int fa(Object obj) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public int comparar(Object obj1, Object obj2) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        flujoS.println("Se construye una matriz de "
                + m.numeroDeElementos() + " elementos");

        // Introducir datos
        flujoS.println("Introducir datos. "
                + "Para finalizar, matricula = 0\n");
        flujoS.print("matricula:  ");
        matricula = CL0102v01LeerTipoDato.datoInt();
        while (matricula != 0) {
            flujoS.print("nombre:     ");
            nombre = CL0102v01LeerTipoDato.dato();
            m.hashIn(new CEAlumno(nombre, matricula));
            flujoS.print("matricula:  ");
            matricula = CL0102v01LeerTipoDato.datoInt();
        }

        // Buscar datos
        flujoS.println("Buscar datos. "
                + "Para finalizar, matricula = 0\n");
        flujoS.print("matricula:  ");
        matricula = CL0102v01LeerTipoDato.datoInt();
        while (matricula != 0) {
            x = (CEAlumno) m.hashOut(new CEAlumno("", matricula));
            if (x != null) {
                flujoS.println("nombre: " + x.obtenerNombre());
            } else {
                flujoS.println("No existe");
            }
            flujoS.print("matricula:  ");
            matricula = CL0102v01LeerTipoDato.datoInt();
        }

    }
}
