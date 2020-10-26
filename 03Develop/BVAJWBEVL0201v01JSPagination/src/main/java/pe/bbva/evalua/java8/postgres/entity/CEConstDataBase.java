
package pe.ias.bbva.evalua.java8.postgres.entity;

public class CEConstDataBase {
    public static final Long DF_RECORD_PAGE = 15L;
    public static final Long DF_CURRENT_PAGE = 1L;
    
    public static final String DB_POSTGRES_CONTROLER = "org.postgresql.Driver";
    public static final String DB_POSTGRES_TYPE_DRIVER = "jdbc:postgresql:";
    public static final String DB_POSTGRES_SERVER_DF = "//10.17.205.49:";
    public static final String DB_POSTGRES_PORT_DF = "5432";
    public static final String DB_POSTGRES_DF = "/AEMSADesarrollo";
    public static final String DB_POSTGRES_USER = "postgres";
    public static final String DB_POSTGRES_KEY = "aemsa152027";
        
    public static final String DB_POSTGRES_URL = DB_POSTGRES_TYPE_DRIVER + DB_POSTGRES_SERVER_DF + DB_POSTGRES_PORT_DF + DB_POSTGRES_DF;

    public static final String SQL_COUNT_CANAL = "SELECT COUNT(cod_canal) FROM APXt01_canal WHERE fec_anu IS NULL";
    public static final String SQL_SELECT_ALL_CANAL  = "SELECT cod_canal, txt_desc FROM APXt01_canal  ORDER BY txt_desc";
    public static final String SQL_SELECT_CANAL_PAGINATION  = "SELECT cod_canal, txt_desc FROM APXt01_canal ORDER BY txt_desc LIMIT ? OFFSET ?";    
}
