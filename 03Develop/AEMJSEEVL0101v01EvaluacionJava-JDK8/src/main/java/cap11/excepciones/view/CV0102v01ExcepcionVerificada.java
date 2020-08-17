package pe.aemsa.evalua.java.cap11.excepciones.view;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
Cambiamos el nombre del archivo de texto y revissamos la excepción verificada
*/
public class CV0102v01ExcepcionVerificada {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        String sPathArchivo = "F:\\01NetBeans8.2\\02Terminado\\AEMJSEEVL0301v01EvaluacionJava-JDK8\\src\\resources\\pe\\aemsa\\evalua\\java\\cap11\\excepciones\\view\\CV0102v01ExcepcionVerificada.txt";
        String sLinea;
        
        FileReader oFileBuscado = new FileReader(sPathArchivo);
        BufferedReader oBR = new BufferedReader(oFileBuscado);
        
        while((sLinea=oBR.readLine())!=null){
            System.out.println(sLinea);
        }
    }
}
