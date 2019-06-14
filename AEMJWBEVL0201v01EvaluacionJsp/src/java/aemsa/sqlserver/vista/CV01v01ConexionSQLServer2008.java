/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aemsa.sqlserver.vista;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * Conexión SQL Server con driver jdbc4
 * 
 */
public class CV01v01ConexionSQLServer2008 {

    private static Connection moCxn;
    private static String msDriver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static String msServidor = "jdbc:sqlserver://INVERTEC:";
    private static String msBaseDatos = "AEMSADESARROLLO;";
    private static String msUsuario = "sa";
    private static String msClave = "aemsa152027";
    private static String mStrPuerto = "1433;";


    private static String msUrl = msServidor + mStrPuerto + " database = " + msBaseDatos + "user = " + msUsuario + "; password = " + msClave;
                                              
    public static void main(String[] args) {
        try{
            Class.forName(msDriver);
            //System.out.println(msDriver);
            
            // System.out.println(Class.forName(msDriver));
            
            moCxn = DriverManager.getConnection(msUrl, msUsuario, msClave);
            
            System.out.println(moCxn);
            moCxn.close();
        }catch(ClassNotFoundException oCNFE){
            System.out.println("Error Class : " + oCNFE.getStackTrace());
            
            System.out.println(oCNFE.getMessage());
        }catch(SQLException oSQL){
            System.out.println("Error SQL :" + oSQL.getMessage());
        }
    }

    
}
