package pe.aemsa.evalua.java.cap11.excepciones.view;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/*
Description : 
    Generar la excepción comprobada

Solution:
    En esta situación el programador no tiene el alcance del error generado 
*/
public class CV0102v01GenerarExcepcionComprobada {

    public static void main(String[] args) {
        
        FileInputStream oFIS = null;
        
       try{
           File oArchivoText = new File("CV0201v01AberdeenAngusMacho.jpg");
           
            oFIS = new FileInputStream(oArchivoText);
            oFIS.read();
        }catch(IOException ex){
            ex.printStackTrace();
        }finally{
            try{
                if (oFIS != null){
                    oFIS.close();
                }
            }catch(IOException ex){
                ex.getMessage();
            }
        }
        System.out.println("Excepcion comprobada con IOException : " + oFIS);
        
    }
    

}
