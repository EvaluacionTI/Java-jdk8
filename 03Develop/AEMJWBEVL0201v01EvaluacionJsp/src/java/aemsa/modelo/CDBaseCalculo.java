/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aemsa.modelo;


import aemsa.modelo.mysq.CDConexionMySq;
import bco.credito.entidad.CEBaseCalculo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CDBaseCalculo {
    
       public static List<CEBaseCalculo> cargarTablaBaseCalculov1() {
        String lStrComandoSQL = "SELECT * FROM FNZt02_base_calculo";

        List<CEBaseCalculo> oLstCEBaseCalculo = new ArrayList<CEBaseCalculo>();

        Connection oCxnSQL = CDConexionMySq.getInstancia().getConexionMySql();

        try {
            PreparedStatement oPsSQL = oCxnSQL.prepareStatement(lStrComandoSQL);
            ResultSet oRsSQL = oPsSQL.executeQuery();

            if (oRsSQL != null) {
                while (oRsSQL.next()) {

                    CEBaseCalculo oCEBaseCalculo = new CEBaseCalculo();
                    oCEBaseCalculo.setMid_base_calculo(oRsSQL.getInt(1));
                    oCEBaseCalculo.setMtxt_abrv(oRsSQL.getNString(2));
                    oCEBaseCalculo.setMtxt_desc(oRsSQL.getNString(3));
                    oCEBaseCalculo.setMnro_dias_aaaa(oRsSQL.getInt(4));
                    oCEBaseCalculo.setMnro_dias_mes(oRsSQL.getInt(5));
                    oCEBaseCalculo.setMid_idioma(oRsSQL.getInt(6));

                    oLstCEBaseCalculo.add(oCEBaseCalculo);

                }
                return oLstCEBaseCalculo;

            }

        } catch (Exception ex) {
        }
        return null;
    }
}
