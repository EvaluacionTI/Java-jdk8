/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aemsa.cap03.condicional;

import java.io.IOException;

import aemsa.cap09.clase.CO06v01LeerTipoDato;

public class CP0606Calculadora {

  // Simulación de una calculadora 
  static int menu() throws IOException {
      try{
        int op;

        do{
          System.out.println("\t1. sumar");
          System.out.println("\t2. restar");
          System.out.println("\t3. multiplicar");
          System.out.println("\t4. dividir");
          System.out.println("\t5. salir");
          System.out.print("\nSeleccione la operación deseada: ");
          op = CO06v01LeerTipoDato.datoInt();
        }
        while (op < 1 || op > 5);
        return op;          
      }catch(IOException ex){
          throw ex;
      }
  }
    
    public static void main(String[] args) throws IOException {
        double ldDato1 = 0, ldDato2 = 0, ldResultado = 0;
        int liOperacion = 0;

        try{
            while(true){
                liOperacion = menu();
                if (liOperacion != 5){
                  // Leer datos
                  System.out.print("Dato 1: "); ldDato1 = CO06v01LeerTipoDato.datoDouble();
                  System.out.print("Dato 2: "); ldDato2 = CO06v01LeerTipoDato.datoDouble();
                  
                  // Limpiar el buffer del flujo de entrada
                  System.in.skip(System.in.available());
                  
                  // Realizar la operación
                  switch (liOperacion)
                  {
                    case 1:
                      ldResultado = ldDato1 + ldDato2;
                      break;
                    case 2:
                      ldResultado = ldDato1 - ldDato2;
                      break;
                    case 3:
                      ldResultado = ldDato1 * ldDato2;
                      break;
                    case 4:
                      ldResultado = ldDato1 / ldDato2;
                      break;
                  }
                  
                  // Escribir el resultado
                  System.out.println("Resultado = " + ldResultado);
                  // Hacer una pausa
                  System.out.println("Pulse [Entrar] para continuar");
                  System.in.read();
                  // Limpiar el buffer del flujo de entrada
                  System.in.skip(System.in.available());

                }
            }
        }catch(IOException ex){
            throw ex;
        }
    }
}
