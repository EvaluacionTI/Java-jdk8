/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aemsa.cap12.flujos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CV06v01CopiaInputFileAnOutputFile {

    public static void main(String[] args) throws IOException {
        FileInputStream oFI= null;
        FileOutputStream oFO = null;
        
        String lsFileInput, lsFileOutput;
        lsFileInput = "cuentaEntrada";
        lsFileOutput = "cuentaSalida";
        
        try{
            oFI = new FileInputStream("D:\\2017\\04-LanguajeProgram\\Java\\JSE01EvaluacionJavaJSE\\src\\aemsa\\cap12\\flujos\\" + lsFileInput);
            oFO = new FileOutputStream("D:\\2017\\04-LanguajeProgram\\Java\\JSE01EvaluacionJavaJSE\\src\\aemsa\\cap12\\flujos\\" + lsFileOutput);
            int c;
            while ((c=oFI.read())!=-1){
                oFO.write(c);
            }
        }catch(IOException exIO ){

        }finally{
            if (oFI!=null){
                oFI.close();
            }
            if (oFO!=null){
                oFO.close();
            }
        }
        
    }
    
}
