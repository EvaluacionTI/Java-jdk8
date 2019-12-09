package pe.aemsa.evalua.java.cap11.excepciones.view;

import java.util.Scanner;
import pe.aemsa.evalua.java.cap11.excepciones.utility.CU0901v01CustomException;
import pe.aemsa.evalua.java.cap11.excepciones.utility.CU0902v01EdadExcepcion;

public class CV0902v01ExcepcionEdadPersonalizado {

    public static void main(String[] args) throws CU0901v01CustomException {
        CU0902v01EdadExcepcion oEdadException = new CU0902v01EdadExcepcion();
        
        Scanner oScanner = new Scanner(System.in);
        int iEdad;

        System.out.println("Ingrese su edad : ");
        try {
            iEdad = oScanner.nextInt();
            oEdadException.validarEdad(iEdad);
        }catch(CU0901v01CustomException ex){
            System.out.println("Es incorrecta : " + ex.getMessage());
        }finally{
            System.out.println("Terminado satisfactoriamente");
        }

    }

}
