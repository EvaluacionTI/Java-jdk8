package mc.dba.vista;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CVDBA02v01RevisarDriverManager {
    Connection moCxn = null;
    static String lstrRpta;
    
    public static void main(String[] args) {
        String lstrDriver = "com.ibm.as400.access.AS400JDBCDriver";
        String lstrJDBC = "jdbc:as400://";
        String lstrBaseDatos = "BETA";
        String lstrServidor = lstrJDBC + lstrBaseDatos;
        String lstrUsuario = "MC0930";
        String lstrClave = "MC152027";
        
        try{
            Class.forName(lstrDriver);
            Connection moCxn = DriverManager.getConnection(lstrServidor, lstrUsuario, lstrClave);
            lstrRpta = moCxn.getCatalog();
            
        }catch(ClassNotFoundException exCNFE){
            System.out.println( "Verificar Driver de Clases : " + exCNFE.getMessage());
//            System.out.println( exCNFE.getMessage());
            System.exit(0);
        }catch(SQLException exSQL){
            if (exSQL.getSQLState().equals("08001")){
                System.out.println("Verificar Conexión a Base Datos; Error N°: " + exSQL.getSQLState());
            }if(exSQL.getSQLState().equals("08004")){
                System.out.println("Verificar Usuario o Clave; Error N°: " + exSQL.getSQLState());
            }
            //System.out.println(exSQL.getSQLState());
            System.exit(0);
        }finally{
            System.out.println( "Conexion Realizada .....!" + lstrRpta);
        }
    }
}
