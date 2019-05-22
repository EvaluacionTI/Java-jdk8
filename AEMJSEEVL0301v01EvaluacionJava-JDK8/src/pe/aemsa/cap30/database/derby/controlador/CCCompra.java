package pe.aemsa.cap30.database.derby.controlador;

import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import pe.aemsa.cap30.database.derby.entidad.CECompra;
import pe.aemsa.cap30.database.derby.modelo.CICompra;
import pe.aemsa.cap30.database.derby.modelo.impl.CDCompra;


public class CCCompra {
    private static final Logger MOLOG = LogManager.getLogger(CCCompra.class);
    private CICompra oCICompra = null;
    private CECompra oCECompra = null;
    private List<CECompra> oLista = null;
        
    public CCCompra(){
        // Instancia de la clase implementación de la interface
        oCICompra = new CDCompra();
        oCECompra = new CECompra();
    }
    
    public void registrar(CECompra poCECompra){
        MOLOG.info("=====> [FCS] Start method : registrar(CECompra poCECompra)");

        MOLOG.info("=> CECompra : {} " + poCECompra.toString());
        oCICompra.saveCompra(poCECompra);
        
        MOLOG.info("=====>[FCS] End method : registrar(CECompra poCECompra)");
    }
    
    public void modificar(CECompra poCECompra){
        oCICompra = new CDCompra();
        oCICompra.updateCompra(poCECompra);
    }
    
    public void eliminar(int piId){
        oCICompra = new CDCompra();
        oCICompra.deleteCompra(piId);
    }
    
    public List<CECompra> listarTodosRegistros(){
        MOLOG.info("=====> [FCS] Start method : listarTodosRegistros()");

        oLista=new ArrayList<>();
        MOLOG.info("=> Lista instanciada : {} " + oLista);
                
        oLista = oCICompra.listAllCompra();
        MOLOG.info("=> Lista resultado : {} " + oLista);
        
        MOLOG.info("=====>[FCS] End method : listarTodosRegistros()");
        return oLista;
    }
    
    public CECompra listarUnRegistro(int piId){
        MOLOG.info("=====> [FCS] Start method : listarUnRegistro(int piId)");
        
        MOLOG.info("=> Identificador : {} " + piId);
        oCECompra = oCICompra.listByIdCompra(piId);
        MOLOG.info("=> CECompra : {} " + oCECompra.toString());

        MOLOG.info("=====>[FCS] End method : listarUnRegistro(int piId)");
        return oCECompra;
    }
}
