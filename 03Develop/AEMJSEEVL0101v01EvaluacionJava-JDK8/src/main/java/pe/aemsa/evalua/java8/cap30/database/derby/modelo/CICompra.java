package pe.aemsa.cap30.database.derby.modelo;

import java.util.List;
import pe.aemsa.cap30.database.derby.entidad.CECompra;

public interface CICompra {
    public void saveCompra(CECompra poCECompra);
    public boolean updateCompra(CECompra poCECompra);
    public boolean deleteCompra(int piIdCompra);
    public List<CECompra> listAllCompra();
    public CECompra listByIdCompra(int piIdCompra);
}
