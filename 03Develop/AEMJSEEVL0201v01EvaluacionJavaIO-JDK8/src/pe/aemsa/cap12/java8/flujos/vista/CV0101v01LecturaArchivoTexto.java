package pe.aemsa.cap12.java8.flujos.vista;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CV0101v01LecturaArchivoTexto {
    private static final Logger MOLOG = Logger.getLogger("CV0101v01LecturaArchivoTexto");
    
    private static File moArchivoTexto = null;
    private static FileReader moFReader = null;
    private static BufferedReader moBReader = null;

    public static void main(String[] args)  {
        String lsPath = "F:\\01Java8\\03Develop\\AEMJSEEVL0201v01EvaluacionJavaIO-JDK8\\src\\resources\\data\\input\\";
        String lsArchivo = "CuentaContableCruzado.txt";
        String lsPrimeraLinea;
        try{
            moArchivoTexto = new File(lsPath + lsArchivo);
            moFReader = new FileReader(moArchivoTexto);
            moBReader = new BufferedReader(moFReader);

            lsPrimeraLinea = moBReader.readLine();
            
            MOLOG.log(Level.INFO, "File : {0}", moArchivoTexto);
            MOLOG.log(Level.INFO, "FileReader : {0}", moFReader);
            MOLOG.log(Level.INFO, "BufferedReader : {0}", moBReader);
            System.out.println(lsPrimeraLinea);
            moBReader.close();
            moFReader.close();
        }catch(IOException ex){
            MOLOG.log(Level.SEVERE, lsPath);
            MOLOG.log(Level.SEVERE, ex.getMessage());
        }
    }
}
