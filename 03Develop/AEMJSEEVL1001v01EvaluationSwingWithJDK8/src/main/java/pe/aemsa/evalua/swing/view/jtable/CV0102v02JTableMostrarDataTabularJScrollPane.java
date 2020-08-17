package pe.aemsa.evalua.swing.view.jtable;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class CV0102v02JTableMostrarDataTabularJScrollPane {
    private final JFrame oJFrameMain;
    
    CV0102v02JTableMostrarDataTabularJScrollPane(){
        oJFrameMain = new JFrame();
        
        String aData[][] = {
            {"105", "Esteban", "200205"},
            {"122", "Illari", "201422"},
            {"109", "Alexei", "201709"},
            {"130", "Sayril", "201830"}
        };
        
        String aTitulo[] = {"Código", "Nombre ", "Importe"};
        
        JTable oJTable = new JTable(aData, aTitulo);
        oJTable.setBounds(30, 40, 200, 300);
        
        JScrollPane oJScrollPane = new JScrollPane(oJTable);
        oJFrameMain.add(oJScrollPane);
        
        oJFrameMain.setTitle(".....[Evaluacion Swing - JTable].....");
        oJFrameMain.setResizable(false);
        oJFrameMain.setSize(800, 600);
        oJFrameMain.setVisible(true);
    }
    public static void main(String[] args) {
        CV0102v02JTableMostrarDataTabularJScrollPane oCVPrincipal = new CV0102v02JTableMostrarDataTabularJScrollPane();
    }
    
}
