/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aemsa.modelo;


import aemsa.modelo.mysq.CDConexionMySq;
import aemsa.entidad.CEFrecuencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CDFrecuencia {
    
       public static List<CEFrecuencia> cargarTablaFrecuenciav1() {
        String lStrComandoSQL = "SELECT * FROM FNZt03_frecuencia";

        List<CEFrecuencia> oLstCEFrecuencia = new ArrayList<CEFrecuencia>();

        Connection oCxnSQL = CDConexionMySq.getInstancia().getConexionMySql();

        try {
            PreparedStatement oPsSQL = oCxnSQL.prepareStatement(lStrComandoSQL);
            ResultSet oRsSQL = oPsSQL.executeQuery();

            if (oRsSQL != null) {
                while (oRsSQL.next()) {

                    CEFrecuencia oCEFrecuencia = new CEFrecuencia();
                    oCEFrecuencia.setMid_frecuencia(oRsSQL.getInt(1));
                    oCEFrecuencia.setMtxt_abrv(oRsSQL.getNString(2));
                    oCEFrecuencia.setMtxt_desc(oRsSQL.getNString(3));
                    oCEFrecuencia.setMnro_dias_mes(oRsSQL.getInt(4));
                    oCEFrecuencia.setMid_idioma(oRsSQL.getInt(5));

                    oLstCEFrecuencia.add(oCEFrecuencia);

                }
                return oLstCEFrecuencia;

            }

        } catch (Exception ex) {
        }
        return null;
    }
}
