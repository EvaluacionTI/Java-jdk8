package pe.aemsa.evalua.java.cap11.excepciones.view;

import javax.swing.JOptionPane;

/*
Description : 
    Generar la excepción de un error en un indx array

Solution:
    En esta situación el programador tiene la culpa pues debe controlar el máximo de datos en el array.
*/
public class CV0101v01GenerarExcepcionNoComprobada {

    public static void main(String[] args) {
        int[] aiNumeros=new int[5];
        
        aiNumeros[0]=5;
        aiNumeros[1]=22;
        aiNumeros[2]=30;
        aiNumeros[3]=9;
        aiNumeros[4]=29;
        // 1. Adiciona un item para provocar un error en el indice y observar
        aiNumeros[5]=26;
        
        for (int i=0;i<aiNumeros.length;i++){
            System.out.println("Posición [" + i + "]" + " = " + aiNumeros[i] );
        }
        
        // 2. Este código nunca se llegará a ejecutar
        String sNombre = JOptionPane.showInputDialog("Ingrese su nombre : ");
        int  iEdad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad : "));
        
        System.out.println(" Hola " + sNombre + " tu edad es " + iEdad + "anos");
        System.out.println("Registro terminado satisfactoriamente");
    }
    
}
