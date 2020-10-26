
package pe.ias.bbva.evalua.java8.postgres.model;

import java.util.ArrayList;
import java.util.List;
import pe.ias.bbva.evalua.java8.postgres.entity.CECanal;

public interface CICanal {
    
    public boolean saveChannel(CECanal poCanal);
    public boolean updateChannel(CECanal poCanal);
    public boolean deleteChannel(CECanal poCanal);
    public List<CECanal> listAllChannel();
    public CECanal getChannelByCode(String psCodigo);
    
    public ArrayList<CECanal> getChannelByPaginationWithArrayList(Long numberRecordPerPage, Long currentPage);
    public List<CECanal> getChannelByPaginationWithList(Long numberRecordPerPage, Long currentPage);
    public Long getNumberOfRecord();
}
