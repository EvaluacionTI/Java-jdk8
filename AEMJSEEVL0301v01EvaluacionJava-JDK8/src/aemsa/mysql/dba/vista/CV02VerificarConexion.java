/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aemsa.mysql.dba.vista;

import aemsa.mysql.dba.modelo.CDConexionMySql;

public class CV02VerificarConexion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        CDConexionMySql oConexion = new CDConexionMySql();
        
        oConexion.openSQLServer();
        
    }
    
}
