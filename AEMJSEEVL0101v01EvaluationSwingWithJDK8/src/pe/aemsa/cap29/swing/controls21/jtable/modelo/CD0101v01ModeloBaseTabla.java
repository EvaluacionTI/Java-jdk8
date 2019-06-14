
package pe.aemsa.cap29.swing.controls21.jtable.modelo;

import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class CD0101v01ModeloBaseTabla {
    
    public void mostrarTabla(JTable poTabla){
        
        JButton oBtnModificar = new JButton("Modificar");
        oBtnModificar.setName("m");
        JButton oBtnEliminar = new JButton("Eliminar");
        oBtnEliminar.setName("e");
        
        poTabla.setDefaultRenderer(Object.class, new CD0102v01ModeloRender());
        
        DefaultTableModel oModelo = new DefaultTableModel(
                new Object[][]{{1, "Ilari", oBtnModificar, oBtnEliminar},{2, "Laskhmi", oBtnModificar, oBtnEliminar},{3, "Isabel", oBtnModificar, oBtnEliminar},{4, "Alex", oBtnModificar, oBtnEliminar},{5, "Luis", oBtnModificar, oBtnEliminar}, {6,"Isabella", oBtnModificar, oBtnEliminar},{7,"Asiri", oBtnModificar, oBtnEliminar},{8,"Cixi", oBtnModificar, oBtnEliminar}},
                new Object[]{"Código", "Nombre", "M", "E"}
        ){
            // Inhabilita la edición de las celdas
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        
       poTabla.setModel(oModelo);
       // Cambiar el tamano de las rilas
       poTabla.setRowHeight(30);
    }
}
