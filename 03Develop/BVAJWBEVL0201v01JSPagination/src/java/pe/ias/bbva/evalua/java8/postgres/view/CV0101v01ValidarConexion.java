
package pe.ias.bbva.evalua.java8.postgres.view;

import pe.ias.bbva.evalua.java8.postgres.model.CDConexionPostgres;

import java.sql.Connection;

public class CV0101v01ValidarConexion {
    
    public static void main(String[] args){
        Connection oCxn;
    
        System.out.println("Declarando un objeto Conexion ");
        CDConexionPostgres oCxnSQL = new CDConexionPostgres();
        //System.out.println("Accediendo a la propiedad del Objeto ");
        //oCxnSQL.openSQLServerConsola();
        
        //System.out.println("Accediendo a la propiedad del Objeto ");
        oCxn = oCxnSQL.getConexion();
        if (oCxn == null){
            System.out.println("Conexion NO establecida : " + oCxn);
        }else{
            System.out.println("Conexion establecida : " + oCxn);
        }
        oCxnSQL.setCerrar(oCxn);
    }
}
