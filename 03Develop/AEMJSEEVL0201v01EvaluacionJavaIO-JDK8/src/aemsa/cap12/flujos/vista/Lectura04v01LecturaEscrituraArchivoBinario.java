/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aemsa.cap12.flujos.entidad.vista;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;



/**
 *
 * @author ALDV
 */
public class Lectura04v01LecturaEscrituraArchivoBinario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        String lsArchivOrigen = "D:\\CuentaContableCruzado.txt";
        String lsArchivoDestino = "D:\\BinarioContableCruzado.txt";
        copiArchivo(lsArchivOrigen, lsArchivoDestino);
        
    }
    
    public static void copiArchivo(String psArchivOrigen, String psArchivoDestino){
        try{
            // Se abre el fichero original para lectura
            FileInputStream oFI = new FileInputStream(psArchivOrigen);
            BufferedInputStream oBIS = new BufferedInputStream(oFI);
			
            // Se abre el fichero donde se hará la copia
            FileOutputStream oFO = new FileOutputStream (psArchivoDestino);
            BufferedOutputStream oBOS = new BufferedOutputStream(oFO);
			
            // Bucle para leer de un fichero y escribir en el otro.
            byte [] array = new byte[1000];
            int leidos = oBIS.read(array);
            while (leidos > 0)
            {
                    oBOS.write(array,0,leidos);
                    leidos=oBIS.read(array);
            }

			// Cierre de los ficheros
            oBIS.close();
            oBOS.close();
            System.out.println("Proceso Terminado");
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }
    
}
