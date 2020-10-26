package pe.ias.bbva.evalua.java8.postgres.controler;

import java.util.List;
import pe.ias.bbva.evalua.java8.postgres.entity.CECanal;
import pe.ias.bbva.evalua.java8.postgres.model.CICanal;
import pe.ias.bbva.evalua.java8.postgres.model.impl.CDCanalEmbebido;

public class CCCanal {

    private CICanal oCICanal = null;
    private CECanal oCECanal = null;
    private List<CECanal> oLista = null;

    public CCCanal() {
        // Instancia de la clase implementación de la interface
        oCICanal = new CDCanalEmbebido();
        oCECanal = new CECanal();
    }

    public List<CECanal> getChannelByPaginationWithList(Long pageSize, Long paginationKey) {
        return oCICanal.getChannelByPaginationWithList(pageSize, paginationKey);
    }
}
