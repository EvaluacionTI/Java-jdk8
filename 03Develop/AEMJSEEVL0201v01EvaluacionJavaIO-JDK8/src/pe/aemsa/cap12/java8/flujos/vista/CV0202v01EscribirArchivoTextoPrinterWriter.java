package pe.aemsa.cap12.java8.flujos.vista;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CV0202v01EscribirArchivoTextoPrinterWriter {
 private static final Logger MOLOG = Logger.getLogger("CV0202v01EscribirArchivoTextoPrinterWriter");
    private static FileWriter moArchivoTexto = null;
    private static PrintWriter moPWriter = null;

    public static void main(String[] args)  {
        String lsPath = "F:\\01Java8\\03Develop\\AEMJSEEVL0201v01EvaluacionJavaIO-JDK8\\src\\resources\\data\\output\\";
        String lsArchivoSalida = "CrearTextoSalida.txt";
        
        try{
            moArchivoTexto = new FileWriter(lsPath + lsArchivoSalida);
            moPWriter = new PrintWriter(moArchivoTexto);
            
            for (int i=0;i <=100; i++){
                moPWriter.println("Línea N°  = " + i);
            }
            System.out.println(moArchivoTexto);
            moPWriter.close();
        }catch (IOException ex) {
            MOLOG.log(Level.SEVERE, lsPath);
            MOLOG.log(Level.SEVERE, ex.getMessage());
        }
    }
}
