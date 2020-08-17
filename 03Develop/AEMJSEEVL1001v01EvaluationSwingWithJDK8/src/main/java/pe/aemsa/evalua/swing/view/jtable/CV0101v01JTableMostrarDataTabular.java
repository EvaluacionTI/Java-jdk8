package pe.aemsa.evalua.swing.view.jtable;

import javax.swing.JFrame;
import javax.swing.JTable;

public class CV0101v01JTableMostrarDataTabular {
    private final JFrame oJFrameMain;
    
    CV0101v01JTableMostrarDataTabular(){
        oJFrameMain = new JFrame();
        
        String aData[][] = {
            {"105", "Esteban", "200205"},
            {"122", "Illari", "201422"},
            {"109", "Alexei", "201709"},
            {"130", "Sayril", "201830"}
        };
        
        String aTitulo[] = {"Código", "Nombre ", "Importe"};
        
        JTable oTabla = new JTable(aData, aTitulo);
        
        oJFrameMain.add(oTabla);
        oJFrameMain.setTitle(".....[Evaluacion Swing - JTable].....");
        oJFrameMain.setResizable(false);
        oJFrameMain.setSize(800, 600);
        oJFrameMain.setVisible(true);
    }
    public static void main(String[] args) {
        CV0101v01JTableMostrarDataTabular oCVPrincipal = new CV0101v01JTableMostrarDataTabular();
    }
    
}
