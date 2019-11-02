/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.aemsa.cap12.java8.flujos.vista;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class CV0701v01ReadWriteObject {

    public static void main(String[] args) {
        String sMensaje = "Stress a tramas";
        String sNombreArchivo = "trama.txt";
        String sRuta = "D:\\2017\\04-LanguajeProgram\\Java\\JSE01EvaluacionJavaJSE\\src\\aemsa\\cap12\\flujos\\datos\\";
        byte[] baLetra = {'e', 'x', 'a', 'm', 'p', 'l', 'e'};
        
        try{
            FileOutputStream oFOSArchivoTexto = new FileOutputStream(sRuta + sNombreArchivo);
            // Serializa datos de archivo de texto
            ObjectOutputStream oOOS = new ObjectOutputStream(oFOSArchivoTexto);
            System.out.println("FileOutputStream : " + oFOSArchivoTexto);

            oOOS.writeObject(sMensaje);
            oOOS.writeObject(baLetra);
            oOOS.flush();

            FileInputStream oFISArchivoTexto = new FileInputStream(sRuta + sNombreArchivo);
            // Deserializa datos de archivo texto
            ObjectInputStream oOIS = new ObjectInputStream(oFISArchivoTexto);
            
            System.out.println("readObject : " + oOIS.readObject());
            System.out.println("String : " + (String) oOIS.readObject());
            
            byte[] bReadByte = (byte[]) oOIS.readObject();
            
            String osLectura = new String(bReadByte);
            System.out.println("" + osLectura);
            
            oOOS.close();
            oOIS.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
