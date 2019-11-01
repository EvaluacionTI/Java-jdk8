/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.aemsa.cap12.flujos.vista;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 *
 * @author ALEDIA
 */
public class Lectura01v01ArchivoTexto {

    private static File moArchivoTexto = null;
    private static FileReader moFr = null;
    private static BufferedReader moBr = null;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        String lsArchivo = "D:\\CuentaContableCruzado.txt";
        String lsLinea = "";
        try{
            moArchivoTexto = new File(lsArchivo);
            FileReader  oFr = new FileReader(moArchivoTexto);
            BufferedReader oBr = new BufferedReader(oFr);

            lsLinea = oBr.readLine();
            
            System.out.println(moArchivoTexto);
            System.out.println(oFr);
            System.out.println(oBr);
            System.out.println(lsLinea);
            
        }catch(Exception ex){
            
        }
        

        
    }
    
}
