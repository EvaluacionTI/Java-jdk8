package pe.aemsa.evalua.swing.view.jtable;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class CV0103v01JTableMostrarListSelectionModel {
    private final JFrame oJFrameMain;
    
    CV0103v01JTableMostrarListSelectionModel(){
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
        oJTable.setCellSelectionEnabled(true);
        ListSelectionModel oListSelect = oJTable.getSelectionModel();
        oListSelect.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        oListSelect.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                String sData = null;
                int[] iRow = oJTable.getSelectedRows();
                int[] iColumns = oJTable.getSelectedColumns();
                
                for(int i=0; i < iRow.length;i++){
                    for(int j=0; j< iColumns.length;j++){
                        sData = (String) oJTable.getValueAt(iRow[i], iColumns[j]);
                    }
                }
                System.out.println("Table element selected is: " + sData); 
            }
        });
        
        JScrollPane oJScrollPane = new JScrollPane(oJTable);
        oJFrameMain.add(oJScrollPane);
        
        oJFrameMain.setTitle(".....[Evaluacion Swing - JTable].....");
        oJFrameMain.setResizable(false);
        oJFrameMain.setSize(800, 600);
        oJFrameMain.setVisible(true);
    }
    public static void main(String[] args) {
        CV0103v01JTableMostrarListSelectionModel oCVPrincipal = new CV0103v01JTableMostrarListSelectionModel();
    }
    
}
