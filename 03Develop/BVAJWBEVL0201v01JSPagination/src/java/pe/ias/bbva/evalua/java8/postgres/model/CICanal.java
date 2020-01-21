
package pe.ias.bbva.evalua.java8.postgres.model;

import java.util.ArrayList;
import java.util.List;
import pe.ias.bbva.evalua.java8.postgres.entity.CECanal;

public interface CICanal {
    
    ArrayList<CECanal> queryChanelsByPaginationWithArrayList(Long pageSize, Long paginationKey);
    List<CECanal> queryChanelsByPaginationWithList(Long pageSize, Long paginationKey);
}
