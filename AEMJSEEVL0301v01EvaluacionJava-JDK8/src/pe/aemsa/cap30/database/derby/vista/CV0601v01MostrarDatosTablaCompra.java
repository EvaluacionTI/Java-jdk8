
package pe.aemsa.cap30.database.derby.vista;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import pe.aemsa.cap30.database.derby.entidad.CECompra;
import pe.aemsa.cap30.database.derby.modelo.CDConexionDerby;

public class CV0601v01MostrarDatosTablaCompra {
    private static final Logger MOLOG = LogManager.getLogger(CV0601v01MostrarDatosTablaCompra.class);
    
    private static CDConexionDerby oCDConexion;
    private static Connection moCxn;
    
    public static void main(String[] args) {
        MOLOG.info("=====> [FCS] Start method : main(String[] args) " + args.length);
        
        try{
            BasicConfigurator.configure();

            oCDConexion = new CDConexionDerby();
            
            MOLOG.info("=> [FCS] Intancia de conexión : " + oCDConexion);
            
            moCxn = oCDConexion.getOpenSQLDerby();
            
            if (moCxn!=null) {
                MOLOG.info("=> [FCS] objecto conexión : " + moCxn);                
                String lsComandoSQL = "SELECT * FROM FCSt01_compra";
                
                CECompra oCECompra = new CECompra();
                
                PreparedStatement oPs = moCxn.prepareStatement(lsComandoSQL);
                ResultSet oRs = oPs.executeQuery();
                while (oRs.next()){
                    oCECompra.setIdCompra(oRs.getInt("id_compra"));
                    oCECompra.setNombreProducto(oRs.getString("txt_nom"));
                    oCECompra.setCantidad(oRs.getDouble("mto_qt"));
                    oCECompra.setPrecio(oRs.getDouble("mto_pre"));
                    oCECompra.setSiNoActivo(oRs.getBoolean("sn_activo"));
                    oCECompra.setFechaSistema(oRs.getDate("fec_sis"));
                    
                    MOLOG.info("=> [FCS] objecto CECompra : " + oCECompra.toString());                
                }
                
                moCxn.close();
            }
        }catch(SQLException oSQL){
            MOLOG.info("=> [FCS] Error SQL :" + oSQL.getMessage());
        }        
        MOLOG.info("=====> [FCS] End method : main(String[] args) " + args.length);
    }
    
}
