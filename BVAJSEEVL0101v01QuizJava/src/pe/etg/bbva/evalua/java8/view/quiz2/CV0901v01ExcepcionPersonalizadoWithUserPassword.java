package pe.etg.bbva.evalua.java8.view.quiz2;

import pe.etg.bbva.evalua.java8.utility.quiz2.CU0901v01CustomException;
import pe.etg.bbva.evalua.java8.utility.quiz2.CU0901v01ValidarExcepcion;

public class CV0901v01ExcepcionPersonalizadoWithUserPassword {

    public static void main(String[] args) {
        String sUsuario, sPassword, sRePassword;
        
        sUsuario = "Illari";
        sPassword = "22082014";
        sRePassword = "220814";
        
        CU0901v01ValidarExcepcion  oCUExcepcion = new CU0901v01ValidarExcepcion();
        
        try{
            System.out.println("Usuario : " + sUsuario);
            oCUExcepcion.validarPassword(sPassword, sRePassword);
        }catch(CU0901v01CustomException ex){
            //ex.printStackTrace();
            System.out.println("No se puede registrar un usuario debido a : " + ex.getMessage());
        }finally{
            System.out.println("Terminado satisfactoriamente");
        }
    }
}
