package mc.dba.vista;

import mc.dba.modelo.CDDBAConexionAS400;
import mc.dba.modelo.CDDBAConexionMSQLServer;

public class CVDBA01v01VerificarConexion {

    public static void main(String[] args) {
        // TODO code application logic here
        
        CDDBAConexionAS400 oCxnAS400 = new CDDBAConexionAS400();
        
        //System.out.println("Conexion a Beta :" + oCxnAS400.conexionAS400());
        
        //System.out.println("Conexion a Alfa3 :" + oCxnAS400.conexionAS400("ALFA3", "MC0930", "MC152027"));
        
        CDDBAConexionMSQLServer oCxnSQLServer = new CDDBAConexionMSQLServer();
        System.out.println("Conexion a SQL Server :" + oCxnSQLServer.conexionMSQLServer());
        
    }
    
}
