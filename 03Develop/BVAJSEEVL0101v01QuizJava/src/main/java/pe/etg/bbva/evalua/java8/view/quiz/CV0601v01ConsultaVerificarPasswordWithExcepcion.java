package pe.etg.bbva.evalua.java8.view.quiz;

import pe.etg.bbva.evalua.java8.utility.quiz.CU0601v01PasswordExcepcion;
import pe.etg.bbva.evalua.java8.utility.quiz.CU0602v01ValidarPassword;

public class CV0601v01ConsultaVerificarPasswordWithExcepcion {

    public static void main(String[] args) {
        String sUsuario, sPassword, sRePassword;
        
        sUsuario = "Illari";
        sPassword = "22082014";
        sRePassword = "220814";
        
        CU0602v01ValidarPassword  oCUValidar= new CU0602v01ValidarPassword();
        
        try{
            System.out.println("Usuario : " + sUsuario);
            oCUValidar.validarPassword(sPassword, sRePassword);
        }catch(CU0601v01PasswordExcepcion ex){
            //ex.printStackTrace();
            System.out.println("No se puede registrar un usuario debido a : " + ex.getMessage());
        }finally{
            System.out.println("Terminado satisfactoriamente");
        }
    }
}
