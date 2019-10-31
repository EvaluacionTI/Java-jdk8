
package aemsa.mysql.dba.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

import aemsa.mysql.dba.entidad.CEConexion;

public class CDConexionMySql {

    public static CDConexionMySql oCDInstancia = null;
    public Connection oSQLCxn = null;
    
    /*
     * Constructor por DEFAULT sera el acceso a la base de datos MYSQL
     */
    
    public CDConexionMySql(){
        String lStrControlador = "com.mysql.jdbc.Driver";
        String lStrTipoDriver = "jdbc:mysql:";
        String lStrServidor = "//localhost:";
        String lStrPuerto = "3306";
        String lStrBaseDatos = "/aemsaprueba";

        String lStrUrl = lStrTipoDriver + lStrServidor + lStrPuerto + lStrBaseDatos;
        String lStrUsuario="root";
        String lStrClave = "aemsa152027";
        
        try{
            Class.forName(lStrControlador);

            oSQLCxn = DriverManager.getConnection(lStrUrl, lStrUsuario, lStrClave);

        }catch(ClassNotFoundException ex){
            // Controlador no instalado
            System.out.println("Controlador de MySql no instalado .....!"+ex.getMessage());

        }catch(SQLException ex){
            switch ( ex.getErrorCode() ){
                case 0:
                    // Comunicacion no disponible
                    System.out.println("Comunicacion no dispobible .....!, ERROR = " + ex.getErrorCode());
                    break;
                case 1049:
                    // Base de datos no existe
                    System.out.println("Base de Datos no existe .....!, ERROR = " + ex.getErrorCode());
                    break;
            }

        }catch(Exception ex){
            // error en conexion
            System.out.println("Error de Conexion .....!");

            throw new RuntimeException(ex.getLocalizedMessage());
        }
    }
    
    /*
     * Metodos de acceso a base de datos MYSQL
     */
    
    public static CDConexionMySql getInstancia(){
        
        if (oCDInstancia==null){
            oCDInstancia=new CDConexionMySql();
        }
        
        return oCDInstancia;
    }
    
    public Connection getConexionMySql(){
        return oSQLCxn;
    }

    @Override
    protected void finalize() throws SQLException, Throwable {
        if (!this.oSQLCxn.isClosed()){
            try{
                this.oSQLCxn.close();
                this.oSQLCxn=null;
            }catch (Exception ex){
                
            }
            super.finalize();
        }
    }
    
   

    public Connection abrirBDMySQL(){
        String lStrControlador = "com.mysql.jdbc.Driver";
        String lStrTipoDriver = "jdbc:mysql:";
        String lStrServidor = "//localhost:";
        String lStrPuerto = "3306";
        String lStrBaseDatos = "/aemsaprueba";

        String lStrUrl = lStrTipoDriver + lStrServidor + lStrPuerto + lStrBaseDatos;
        String lStrUsuario="root";
        String lStrClave = "aemsa152027";
        
        Connection oCxn = null;

        try{
            Class.forName(lStrControlador);

            oCxn = DriverManager.getConnection(lStrUrl, lStrUsuario, lStrClave);

        }catch(ClassNotFoundException ex){
            ex.printStackTrace();
            // Controlador no instalado
            System.out.println("Controlador de MySql no instalado .....!");

        }catch(SQLException ex){
            ex.printStackTrace();
            switch ( ex.getErrorCode() ){
                case 0:
                    // Comunicacion no disponible
                    System.out.println("Comunicacion no dispobible .....!, ERROR = " + ex.getErrorCode());
                    break;
                case 1049:
                    // Base de datos no existe
                    System.out.println("Base de Datos no existe .....!, ERROR = " + ex.getErrorCode());
                    break;
            }

        }catch(Exception ex){
            ex.printStackTrace();
            // error en conexion
            System.out.println("Error de Conexion .....!");

            throw new RuntimeException(ex.getLocalizedMessage());
        }
        return oCxn;
    }
    

    public Connection abrirBDMySQLv1(){
        String lStrControlador = "com.mysql.jdbc.Driver";
        String lStrTipoDriver = "jdbc:mysql:";
        String lStrServidor = "//localhost:";
        String lStrPuerto = "3306";
        String lStrBaseDatos = "/aemsaprueba";

        String lStrUrl = lStrTipoDriver + lStrServidor + lStrPuerto + lStrBaseDatos;
        String lStrUsuario="root";
        String lStrClave = "aemsa152027";
        
        Connection oCxn = null;
        try{
            Class.forName(lStrControlador);

            oCxn = DriverManager.getConnection(lStrUrl, lStrUsuario, lStrClave);

        }catch(ClassNotFoundException ex){
            ex.printStackTrace();
            // Controlador no instalado
            JOptionPane.showMessageDialog(null,"Controlador de MySql no instalado .....!","Verificar",0);

        }catch(SQLException ex){
            ex.printStackTrace();
            switch ( ex.getErrorCode() ){
                case 0:
                    // Comunicacion no disponible
                    JOptionPane.showMessageDialog(null,"Comunicacion no dispobible .....!, ERROR = " + ex.getErrorCode(),"Verificar",0);
                    break;
                case 1049:
                    // Base de datos no existe
                    JOptionPane.showMessageDialog(null,"Base de Datos no existe .....!, ERROR = " + ex.getErrorCode(),"Verificar",0);
                    break;
          
            }

        }catch(Exception ex){
            ex.printStackTrace();
            // error en conexion
            JOptionPane.showMessageDialog(null,"Error de Conexion .....!","Verificar",0);

            throw new RuntimeException(ex.getLocalizedMessage());
        }
        return oCxn;
    }
    
    public Connection abrirBDMySQL(String pStrControlador, String pStrUrl, String pStrUsuario, String pStrClave){
        
        Connection oCxn = null;
        try{
            Class.forName(pStrControlador);

            oCxn = DriverManager.getConnection(pStrUrl, pStrUsuario, pStrClave);

        }catch(ClassNotFoundException ex){
            // Controlador no instalado
            System.out.println("Controlador de MySql no instalado .....! ");

        }catch(SQLException ex){
            switch ( ex.getErrorCode() ){
                case 0:
                    // Comunicacion no disponible
                    System.out.println("Comunicacion no dispobible .....!, ERROR = " + ex.getErrorCode());
                    break;
                case 1049:
                    // Base de datos no existe
                    System.out.println("Base de Datos no existe .....!, ERROR = " + ex.getErrorCode());
                    break;
            }

        }catch(Exception ex){
            // error en conexion
            System.out.println("Error de Conexion");

            throw new RuntimeException(ex.getLocalizedMessage());
        }
        return oCxn;
        
    }
        
    public Connection abrirBDMySQL(CEConexion poCEConexion){
        
        Connection oCxn = null;
        try{
            Class.forName(poCEConexion.getmStrControlador());

            oCxn = DriverManager.getConnection(poCEConexion.getmStrUrl(), poCEConexion.getmStrUsuario(), poCEConexion.getmStrClave());

        }catch(ClassNotFoundException ex){
            // Controlador no instalado
            System.out.println("Controlador de MySql no instalado .....! ");

        }catch(SQLException ex){
            switch ( ex.getErrorCode() ){
                case 0:
                    // Comunicacion no disponible
                    System.out.println("Comunicacion no dispobible .....!, ERROR = " + ex.getErrorCode());
                    break;
                case 1049:
                    // Base de datos no existe
                    System.out.println("Base de Datos no existe .....!, ERROR = " + ex.getErrorCode());
                    break;
            }

        }catch(Exception ex){
            // error en conexion
            System.out.println("Error de Conexion");

            throw new RuntimeException(ex.getLocalizedMessage());
        }
        return oCxn;
        
    }
    
    public Connection openSQLServer(){

        String lStrControlador = "com.mysql.jdbc.Driver";
        String lStrTipoDriver = "jdbc:mysql:";
        String lStrServidor = "//localhost:";
        String lStrPuerto = "1433";
        String lStrBaseDatos = "/aemsaprueba";

        String lStrUrl = lStrTipoDriver + lStrServidor + lStrPuerto + lStrBaseDatos;
        String lStrUsuario="sa";
        String lStrClave = "aemsa152027";

        try{
//            Class.forName(poCEConexion.getmStrControlador());
            Class.forName("com.microsoft.jdbc.sqlserver.SQLServerDriver");
         
            String url = "jdbc:microsoft:sqlserver://" + lStrServidor + ":" + lStrPuerto + "; DataBase = " + lStrBaseDatos + "; User = " + lStrUsuario + "; Password = " + lStrClave;
            Connection oCxn = DriverManager.getConnection(url);
            
            //oCxn = DriverManager.getConnection(poCEConexion.getmStrUrl(), poCEConexion.getmStrUsuario(), poCEConexion.getmStrClave());
            return oCxn;

        }catch(ClassNotFoundException ex){
            // Controlador no instalado
            System.out.println("Controlador de MySql no instalado .....! ");

        }catch(SQLException ex){
            switch ( ex.getErrorCode() ){
                case 0:
                    // Comunicacion no disponible
                    System.out.println("Comunicacion no dispobible .....!, ERROR = " + ex.getErrorCode());
                    break;
                case 1049:
                    // Base de datos no existe
                    System.out.println("Base de Datos no existe .....!, ERROR = " + ex.getErrorCode());
                    break;
            }

        }catch(Exception ex){
            // error en conexion
            System.out.println("Error de Conexion");

            throw new RuntimeException(ex.getLocalizedMessage());
        }
        return null;
    }
  /*
   *  try{
            Class.forName("com.microsoft.jdbc.sqlserver.SQLServerDriver");
            String url = "jdbc:microsoft:sqlserver://" + pServidor + ":" + pIntPuerto + "; DataBase = " + pBaseDatos + "; User = " + pUsuario + "; Password = " + pClave;
            Connection oCxn = DriverManager.getConnection(url);

            return oCxn;
            //return null;
        }catch(Exception ex){
            System.out.println(" Error de conexion " + ex);
            return null;
        }
   */
}
