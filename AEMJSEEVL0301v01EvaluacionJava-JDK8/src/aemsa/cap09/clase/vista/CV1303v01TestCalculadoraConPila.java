package aemsa.cap09.clase.vista;

//////////////////////////////////////////////////////////////////

import pe.aemsa.cap09.clase.CO16v03PilaCalculadoraConPila;
import javax.swing.JOptionPane;

// Calculadora utilizando una pila. Esta aplicaci�n, adem�s de las
// clases necesarias de la biblioteca de Java, utiliza las clases:
// CPila derivada de CListaCircularSE, CDatos y CLeer. 
//
public class CV1303v01TestCalculadoraConPila {

    private static CO16v03PilaCalculadoraConPila pila = new CO16v03PilaCalculadoraConPila();   // pila de operandos
    private static double[] operando = {0, 0}; // operando 0 y 1

    public static void obtenerOperandos() {
        if (pila.tamano() < 2) {
            operando[0] = ((Double) pila.sacarDePila()).doubleValue();
            operando[1] = ((Double) pila.sacarDePila()).doubleValue();
        }
        throw new NullPointerException();
    }

    public static void main(String[] args) {
        // oper almacena la entrada realizada desde el teclado
        String oper = null;

        System.out.println("Operaciones: + - * /\n");
        System.out.println("Forma de introducir los datos:");
        System.out.println(">primer operando [Entrar]");
        System.out.println(">segundo operando [Entrar]");
        System.out.println(">operador [Entrar]\n");
        System.out.println("Para salir pulse q\n");
        do {
            try {
                System.out.print("> ");
                //oper = Leer.dato();      // leer un operando o un operador
                oper = JOptionPane.showInputDialog("Ingrese Operador");
                switch (oper.charAt(0)) // verificar el primer car�cter
                {
                    case '+':
                        obtenerOperandos();
                        System.out.println(operando[0] + operando[1]);
                        pila.meterEnPila(new Double(operando[0] + operando[1]));
                        break;
                    case '-':
                        obtenerOperandos();
                        System.out.println(operando[0] - operando[1]);
                        pila.meterEnPila(new Double(operando[0] - operando[1]));
                        break;
                    case '*':
                        obtenerOperandos();
                        System.out.println(operando[0] * operando[1]);
                        pila.meterEnPila(new Double(operando[0] * operando[1]));
                        break;
                    case '/':
                        obtenerOperandos();
                        if (operando[1] == 0) {
                            System.out.println("\nError: divisi�n por cero");
                            break;
                        }
                        System.out.println(operando[0] / operando[1]);
                        pila.meterEnPila(new Double(operando[0] / operando[1]));
                        break;
                    case 'q':
                        // salir
                        break;
                    default:  // es un operando
                        pila.meterEnPila(new Double(oper));
                }
            } catch (NumberFormatException e) {
                System.out.print("Error: dato no es v�lido. Teclee otro: ");
            } catch (NullPointerException e) {
                System.out.print("Error: teclee " + (2 - pila.tamano())
                        + " operando(s) m�s");
            }
        } while (oper.charAt(0) != 'q');
    }
}
