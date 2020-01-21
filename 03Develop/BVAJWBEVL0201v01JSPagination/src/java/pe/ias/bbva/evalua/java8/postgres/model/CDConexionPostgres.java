package pe.ias.bbva.evalua.java8.postgres.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import pe.ias.bbva.evalua.java8.postgres.entity.CEConstDataBase;

public class CDConexionPostgres {

    public static CDConexionPostgres oCDInstancia = null;
    public Connection oSQLCxn = null;

    public CDConexionPostgres() {

        try {
            Class.forName(CEConstDataBase.DB_POSTGRES_CONTROLER);
            oSQLCxn = DriverManager.getConnection(CEConstDataBase.DB_POSTGRES_URL, CEConstDataBase.DB_POSTGRES_USER, CEConstDataBase.DB_POSTGRES_KEY);
            System.out.println("Iniciando conexion .....!" + oSQLCxn);

        } catch (ClassNotFoundException ex) {
            // Controlador no instalado
            System.out.println("Controlador no instalado .....!" + ex.getMessage());

        } catch (SQLException ex) {
            switch (ex.getErrorCode()) {
                case 0:
                    // Comunicacion no disponible
                    System.out.println("Comunicacion no dispobible .....!, ERROR = " + ex.getErrorCode());
                    break;
                case 1049:
                    // Base de datos no existe
                    System.out.println("Base de Datos no existe .....!, ERROR = " + ex.getErrorCode());
                    break;
            }

        } catch (Exception ex) {
            // error en conexion
            System.out.println("Error de Conexion .....!");

            throw new RuntimeException(ex.getLocalizedMessage());
        }
    }

    /*
     * Metodos de acceso a base de datos MYSQL
     */
    public static CDConexionPostgres getInstancia() {

        if (oCDInstancia == null) {
            oCDInstancia = new CDConexionPostgres();
        }

        return oCDInstancia;
    }

    public Connection getConexion() {
        return oSQLCxn;
    }

    @Override
    protected void finalize() throws SQLException, Throwable {
        if (!this.oSQLCxn.isClosed()) {
            try {
                this.oSQLCxn.close();
                this.oSQLCxn = null;
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            super.finalize();
        }
    }

    public void setCerrar(Connection poCxn) {
        try {
            poCxn.close();
        } catch (SQLException exSQL) {
            throw new RuntimeException(exSQL.getLocalizedMessage());
        }
    }
}
