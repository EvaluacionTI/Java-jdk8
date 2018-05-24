package mc.dba.modelo;

import mc.dba.entidad.CEDBAConexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CDDBAConexionAS400 {
    private Connection moCxn;
    
    public Connection conexionAS400(){
        String lstrDriver = "com.ibm.as400.access.AS400JDBCDriver";
        String lstrJDBC = "jdbc:as400://";
        String lstrBaseDatos = "BETA";
        String lstrServidor = lstrJDBC + lstrBaseDatos;
        String lstrUsuario = "MC0930";
        String lstrClave = "MC152027";
        
        try{
            Class.forName(lstrDriver);
            moCxn = DriverManager.getConnection( lstrServidor, lstrUsuario, lstrClave);
            
        }catch(ClassNotFoundException exCNFE){
            System.out.println( exCNFE.getMessage());
        }finally{
            return moCxn;
        }
    }

    public Connection conexionAS400(String pstrBaseDato, String pstrUsuario, String pstrClave){
        String lstrDriver = "com.ibm.as400.access.AS400JDBCDriver";
        String lstrJDBC = "jdbc:as400://";
        String lstrServidor = lstrJDBC + pstrBaseDato;
        
        try{
            Class.forName(lstrDriver);
            moCxn = DriverManager.getConnection(lstrServidor, pstrUsuario, pstrClave);
            
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

    public Connection conexionAS400(CEDBAConexion poCEDBAConexion){
        String lstrDriver = poCEDBAConexion.getDriver();
        String lstrJDBC = poCEDBAConexion.getJDBC() + "://";
        String lstrServidor = lstrJDBC + poCEDBAConexion.getBaseDato();
        
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
