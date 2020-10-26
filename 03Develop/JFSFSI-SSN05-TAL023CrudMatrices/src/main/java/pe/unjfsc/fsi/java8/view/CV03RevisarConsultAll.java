
package pe.unjfsc.fsi.java8.view;

import javax.swing.JFrame;
import javax.swing.JTable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pe.unjfsc.fsi.java8.model.CIRetiroAfp25;
import pe.unjfsc.fsi.java8.model.impl.CDRetiroAFP25Matrices;

public class CV03RevisarConsultAll {
    private static final Logger LOG = LoggerFactory.getLogger("CV03RevisarConsultAll");
    private final JFrame oFrame;

    CV03RevisarConsultAll(){
        oFrame = new JFrame();
        CIRetiroAfp25 oCrudMatrices = new CDRetiroAFP25Matrices();
        
        Object[][] oResult = oCrudMatrices.consultAllRetiroDimensional();
         
        LOG.info("[EVL] Datos : {}", oResult.length);
        String aTitulo[] = {"Id", "Codigo", "Saldo CIC"};
        
        JTable oTabla = new JTable(oResult, aTitulo);
        
        oFrame.add(oTabla);
        oFrame.setTitle("Evaluacion de CRUD Matrices");
        oFrame.setResizable(false);
        oFrame.setSize(800, 600);
        oFrame.setVisible(true);
    }

    public static void main(String[] args) {
        CV03RevisarConsultAll oCVMain = new CV03RevisarConsultAll();
    }
}
