/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aemsa.cap12.flujos;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class CV0801v01FileOutputStream {

    public static void main(String[] args) {
        FileOutputStream oFOSArchivoTexto = null;
        File oArchivo;
        String sDatoMensaje = "Lectura de Stress a tramas";
        String sNombreArchivo = "tramaIOS.txt";
        String sRuta = "D:\\2017\\04-LanguajeProgram\\Java\\JSE01EvaluacionJavaJSE\\src\\aemsa\\cap12\\flujos\\datos\\";
        
        try{

            oArchivo = new File(sRuta + sNombreArchivo);
            oFOSArchivoTexto = new FileOutputStream(oArchivo);
            if (!oArchivo.exists()){
                oArchivo.createNewFile();
            }
            
            byte[] bContenidoByte = sDatoMensaje.getBytes();

            oFOSArchivoTexto.write(bContenidoByte);
            oFOSArchivoTexto.flush();
            oFOSArchivoTexto.close();
            
        }catch(IOException ex){
            ex.printStackTrace();
        }finally{
            try{
                if (oFOSArchivoTexto != null){
                    oFOSArchivoTexto.close();
                }
            }catch(Exception ex){
                ex.printStackTrace();
            }
        }
    }
}
