/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aemsa.cap12.flujos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CV0803v01FileInputOutputStream {

    public static void main(String[] args) {
        FileInputStream oFISArchivoEntrada = null;
        FileOutputStream oFOSArchivoSalida = null;
        File oArchivo;
        String sDatoMensaje = "Lectura de Stress a tramas";
        String sArchivoEntrada = "FileFIS.txt";
        String sArchivoSalida = "FileFOS.txt";
        String sRuta = "D:\\2017\\04-LanguajeProgram\\Java\\JSE01EvaluacionJavaJSE\\src\\aemsa\\cap12\\flujos\\datos\\";
        
        try{
            // 1.0 Evaluar archivo de entrada
           oArchivo = new File(sRuta + sArchivoEntrada);
           oFISArchivoEntrada = new FileInputStream(oArchivo);
           if (!oArchivo.exists()){
               oArchivo.createNewFile();
               System.out.println("Archivo no existe .....");
           }
              
            // 2.0 Evaluar archivo de salida
            oArchivo = new File(sRuta + sArchivoSalida);
            oFOSArchivoSalida = new FileOutputStream(oArchivo);
            if (!oArchivo.exists()){
                oArchivo.createNewFile();
            }

            byte[] buffer = new byte[1024];
            int bytesRead;
            //read from is to buffer
            while((bytesRead = oFISArchivoEntrada.read(buffer)) !=-1){
                oFOSArchivoSalida.write(buffer, 0, bytesRead);
            }
            oFISArchivoEntrada.close();
            //flush OutputStream to write any buffered data to file
            oFOSArchivoSalida.flush();
            oFOSArchivoSalida.close();
           
           
        }catch(IOException ex){
            ex.printStackTrace();
        }finally{
            try{
                if (oFOSArchivoSalida != null){
                    oFOSArchivoSalida.close();
                }
            }catch(Exception ex){
                ex.printStackTrace();
            }
        }
    }
}
