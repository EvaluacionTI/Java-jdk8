package mc.dba.vista;

public class CVDBA01v01RevisarClassforName {

    public static void main(String[] args) {
        String lstrDriver = "com.ibm.as400.access.AS400JDBCDriver";

        try{
            Class oCObjetoCxn = Class.forName(lstrDriver);
            
            System.out.println( "Paquete = " + oCObjetoCxn.getPackage());
            System.out.println( "Clase   = " + oCObjetoCxn.getName());
            
        }catch(ClassNotFoundException exCNFE){
            System.out.println( "Cause " + exCNFE.getCause());
            System.out.println( "Class " + exCNFE.getClass());
            System.out.println( "Excep " + exCNFE.getException());
            System.out.println( "Local " + exCNFE.getLocalizedMessage());
            System.out.println( "Messa " + exCNFE.getMessage());
            System.out.println( "Stack " + exCNFE.getStackTrace());
            System.out.println( "Supre " + exCNFE.getSuppressed());            

        }finally{
        }
    }
}
