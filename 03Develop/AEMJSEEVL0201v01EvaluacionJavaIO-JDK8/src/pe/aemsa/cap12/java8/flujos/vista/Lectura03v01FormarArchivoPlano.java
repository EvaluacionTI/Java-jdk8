package pe.aemsa.cap12.java8.flujos.vista;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import pe.aemsa.cap12.java8.flujos.entidad.CECruceCuenta;

public class Lectura03v01FormarArchivoPlano {

    private static File moArchivoTextoEntrada = null;
    private static FileReader moFr = null;
    private static BufferedReader moBr = null;
    
    private static FileWriter moArchivoTextoSalida = null;
    private static PrintWriter moPw = null;
    
    private static CECruceCuenta moCECruceCuenta;
    
    public static void main(String[] args)  {
        String lsArchivoEntrada = "D:\\CuentaContableCruzado.txt";
        String lsArchivoSalida = "D:\\ResultadoCruzado.txt";
        
        String lsLinea = "", lsLineaSalida = "";
        String lsEvaluaCadena = "";
        int liContadorFila = 1;
        
        try{
            // 1. Información de entrada
            moArchivoTextoEntrada = new File(lsArchivoEntrada);
            moFr = new FileReader(moArchivoTextoEntrada);
            moBr = new BufferedReader(moFr);

            // 2. Información de salida
            moArchivoTextoSalida = new FileWriter(lsArchivoSalida);
            moPw = new PrintWriter(moArchivoTextoSalida);

            moCECruceCuenta = new CECruceCuenta();
            
            lsLinea = moBr.readLine();
            
            System.out.println(moFr);
            System.out.println(moBr);
            System.out.println(lsLinea);
            lsEvaluaCadena = lsLinea.substring(0, 9);
            System.out.println(lsEvaluaCadena);
// FECHA ==> [0,5]
// HORA ==> [0,4]
// PROCESO ==> [49,56]
// TIPO ==> [0,3]
// CLASE ==> [2,7]
// ---------- == [0,9]
            
            while((lsLinea=moBr.readLine())!=null){
                System.out.println(" Contador = " + liContadorFila);
                
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
                }else{
                    moCECruceCuenta.setTipo(lsLinea.substring(1, 4));
                    moCECruceCuenta.setCodigoTipo(lsLinea);
                    moCECruceCuenta.setCodigoMoneda(lsLinea);
                    moCECruceCuenta.setNumeroCuentaContable(lsLinea);
                    moCECruceCuenta.setDescripcionCuenta(lsLinea);
                    moCECruceCuenta.setDescripcionCruzada(lsLinea);
                    moCECruceCuenta.setNumeroCuentaContablecruzada(lsLinea);
                    moCECruceCuenta.setCodigoCruzada(lsLinea);
                    moCECruceCuenta.setDescripcionCuentacruzada(lsLinea);
                    
                    moPw.println(moCECruceCuenta);
                }
                liContadorFila ++;
                moCECruceCuenta = new CECruceCuenta();
            }
            moFr.close();
        }catch(IOException ex){
            ex.printStackTrace();
        }

    }
    
}
