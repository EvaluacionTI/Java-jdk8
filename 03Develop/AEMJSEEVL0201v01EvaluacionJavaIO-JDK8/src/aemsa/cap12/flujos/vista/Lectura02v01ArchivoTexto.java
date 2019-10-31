/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aemsa.cap12.flujos.entidad.vista;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 *
 * @author ALEDIA
 */
public class Lectura02v01ArchivoTexto {

    private static File moArchivoTexto = null;
    private static FileReader moFr = null;
    private static BufferedReader moBr = null;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        String lsArchivoEntrada = "D:\\CuentaContableCruzado.txt";
        String lsLinea = "";
        String lsEvaluaCadena = "";
        try{
            moArchivoTexto = new File(lsArchivoEntrada);
            moFr = new FileReader(moArchivoTexto);
            moBr = new BufferedReader(moFr);

            lsLinea = moBr.readLine();
            
            System.out.println(moArchivoTexto);
            System.out.println(moFr);
            System.out.println(moBr);
            System.out.println(lsLinea);
            lsEvaluaCadena = lsLinea.substring(0, 9);
            System.out.println(lsEvaluaCadena);
//            while((lsLinea=oBr.readLine())!=null)
// FECHA ==> [0,5]
// HORA ==> [0,4]
// PROCESO ==> [49,56]
// TIPO ==> [0,3]
// CLASE ==> [2,7]
// ---------- == [0,9]
                if (lsEvaluaCadena.equals("FECHA")){
                    System.out.println(lsEvaluaCadena);
                }else if(lsEvaluaCadena.equals("HORA")){
                    System.out.println(lsEvaluaCadena);
                }else if(lsEvaluaCadena.equals("PROCESO")){
                    System.out.println(lsEvaluaCadena);
                }else if(lsEvaluaCadena.equals("TIPO")){
                    System.out.println(lsEvaluaCadena);
                }else if(lsEvaluaCadena.equals("CLASE")){
                    System.out.println(lsEvaluaCadena);
                }else if(lsEvaluaCadena.equals("----------")){
                    System.out.println(lsEvaluaCadena);
                }
            moFr.close();
        }catch(Exception ex){
            
        }

    }
    
}
