package mc.dba.modelo;

import mc.dba.entidad.CEDBAConexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CDDBAConexionMSQLServer {
    private Connection moCxn;
    private int POR_URL1 = 1;  // SOLO URL
    private int POR_URL2 = 2;  // URL, USUARIO Y CLAVE SEPARADOS
    
    public Connection conexionMSQLServer(){
        // jdbc:sqlserver://[serverName[\instanceName][:portNumber]][;property=value[;property=value]]
        
        String lstrDriver    = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        String lstrJDBC      = "jdbc:sqlserver://";
        String lstrServidor  = "localhost:";
        String lstrPuerto    = "1433;";
        String lstrBaseDatos = "database=MCDESARROLLO;";
        String lstrUsuario   = null;
        String lstrClave     = null;
        String lstrURL       = null;
        
        POR_URL1 = 1;
        
        if ( POR_URL1==1 ){
            lstrUsuario   = "user=sa;";
            lstrClave     = "password=Aemsac2027";            
            lstrURL = lstrJDBC + lstrServidor + lstrPuerto + lstrBaseDatos + lstrUsuario + lstrClave;
                        
        }else if ( POR_URL2==2 ){
            lstrUsuario   = "sa;";
            lstrClave     = "Aemsac2027";            
            
            lstrURL = lstrJDBC + lstrServidor + lstrPuerto + lstrBaseDatos;
        }
        
        try{
            Class.forName(lstrDriver);
            if ( POR_URL1==1 ){
                moCxn = DriverManager.getConnection( lstrURL );
            }else if ( POR_URL2==2 ){
                moCxn = DriverManager.getConnection( lstrURL, lstrUsuario, lstrClave );
            }
            
        }catch(ClassNotFoundException exCNFE){
            System.out.println( exCNFE.getMessage());
        }finally{
            return moCxn;
        }
    }

    public Connection conexionMSQLServer(String pstrBaseDato, String pstrUsuario, String pstrClave){
        String lstrDriver    = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        String lstrJDBC      = "jdbc:sqlserver://";
        String lstrServidor  = "localhost:";
        String lstrPuerto    = "1433;";
        String lstrBaseDatos = "database=MCDESARROLLO;";
        String lstrUsuario   = null;
        String lstrClave     = null;
        String lstrURL       = null;
        
        POR_URL1 = 1;

        if ( POR_URL1==1 ){
            lstrUsuario   = "user=" + pstrUsuario + ";";
            lstrClave     = "password=" + pstrClave + ";";            
            lstrURL = lstrJDBC + lstrServidor + lstrPuerto + lstrBaseDatos + lstrUsuario + lstrClave;
                        
        }else if ( POR_URL2==2 ){
            lstrUsuario   = pstrUsuario;
            lstrClave     = pstrClave;            
            
            lstrURL = lstrJDBC + lstrServidor + lstrPuerto + lstrBaseDatos;
        }
        
        try{
            Class.forName(lstrDriver);
            if ( POR_URL1==1 ){
                moCxn = DriverManager.getConnection( lstrURL );
            }else if ( POR_URL2==2 ){
                moCxn = DriverManager.getConnection( lstrURL, lstrUsuario, lstrClave );
            }
            
        }catch(ClassNotFoundException exCNFE){
            System.out.println( exCNFE.getMessage());
        }catch(SQLException exSQL){
            if (exSQL.getSQLState().equals("08001")){
                System.out.println("Verificar Conexión a Base Datos; Error N°: " + exSQL.getSQLState());
            }if(exSQL.getSQLState().equals("08004")){
                System.out.println("Verificar Usuario o Clave; Error N°: " + exSQL.getSQLState());
            }
            //System.out.println(exSQL.getSQLState());
            System.exit(0);
        }finally{
            System.out.println( "Conexion Realizada .....!" + moCxn);
            return moCxn;
        }
    }

    public Connection conexionMSQLServer(CEDBAConexion poCEDBAConexion){
        String lstrDriver    = poCEDBAConexion.getDriver();
        String lstrJDBC      = poCEDBAConexion.getJDBC() + "://";
        String lstrServidor  = poCEDBAConexion.getServidor();
        String lstrPuerto    = poCEDBAConexion.getPuerto()+ ";";
        String lstrBaseDatos = "database=" + poCEDBAConexion.getBaseDato() + ";";
        String lstrUsuario   = null;
        String lstrClave     = null;
        String lstrURL       = null;
        
        POR_URL1 = 1;

        if ( POR_URL1==1 ){
            lstrUsuario   = "user=" + poCEDBAConexion.getUsuario() + ";";
            lstrClave     = "password=" + poCEDBAConexion.getClave() + ";";            
            lstrURL = lstrJDBC + lstrServidor + lstrPuerto + lstrBaseDatos + lstrUsuario + lstrClave;
                        
        }else if ( POR_URL2==2 ){
            
            lstrURL = lstrJDBC + lstrServidor + lstrPuerto + lstrBaseDatos;
        }

        try{
            Class.forName(lstrDriver);
            moCxn = DriverManager.getConnection(lstrServidor, poCEDBAConexion.getUsuario(), poCEDBAConexion.getClave());
            
        }catch(ClassNotFoundException exCNFE){
            System.out.println( exCNFE.getMessage());
        }catch(SQLException exSQL){
            if (exSQL.getSQLState().equals("08001")){
                System.out.println("Verificar Conexión a Base Datos; Error N°: " + exSQL.getSQLState());
            }if(exSQL.getSQLState().equals("08004")){
                System.out.println("Verificar Usuario o Clave; Error N°: " + exSQL.getSQLState());
            }
            //System.out.println(exSQL.getSQLState());
            System.exit(0);
        }finally{
            System.out.println( "Conexion Realizada .....!" + moCxn);
            return moCxn;
        }
    }    
}
