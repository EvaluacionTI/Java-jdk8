/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aemsa.cap12.flujos.entidad.vista;

import java.io.FileWriter;
import java.io.PrintWriter;


/**
 *
 * @author ALEDIA
 */
public class Lectura03v01EscribirArchivoTexto {

    private static FileWriter moArchivoTexto = null;
    private static PrintWriter moPw = null;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        String lsArchivoSalida = "D:\\ArchivoTextoSalida.txt";
        try{
            moArchivoTexto = new FileWriter(lsArchivoSalida);
            moPw = new PrintWriter(moArchivoTexto);
            
            for (int i=0;i <=100; i++){
                moPw.println("Línea N°  = " + i);
            }
            System.out.println(moArchivoTexto);
            moPw.close();
        }catch(Exception ex){
            
        }

    }
    
}
