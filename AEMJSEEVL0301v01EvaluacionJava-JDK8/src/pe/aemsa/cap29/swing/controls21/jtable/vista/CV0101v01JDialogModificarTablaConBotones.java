
package pe.aemsa.cap29.swing.controls21.jtable.vista;

import javax.swing.JButton;
import pe.aemsa.cap29.swing.controls21.jtable.modelo.CD0101v01ModeloBaseTabla;

public class CV0101v01JDialogModificarTablaConBotones extends javax.swing.JDialog {

    CD0101v01ModeloBaseTabla oTabla = new CD0101v01ModeloBaseTabla();
    

    public CV0101v01JDialogModificarTablaConBotones(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
         this.setLocationRelativeTo(null);
        oTabla.mostrarTabla(jTableMantenimiento);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMantenimiento = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTableMantenimiento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableMantenimiento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMantenimientoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableMantenimiento);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 25, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTableMantenimientoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMantenimientoMouseClicked
        
int column = jTableMantenimiento.getColumnModel().getColumnIndexAtX(evt.getX());
        int row = evt.getY()/jTableMantenimiento.getRowHeight();
        
        if (row < jTableMantenimiento.getRowCount() && row > 0 && column < jTableMantenimiento.getColumnCount() && column >= 0){
            Object value = jTableMantenimiento.getValueAt(row, column);
            
            if (value instanceof JButton){
                ((JButton) value).doClick();
                JButton oBoton = (JButton) value;
                
                System.out.println("Objeto value " + value);
                System.out.println("Click en el boton " + oBoton);
                
                if (oBoton.getName().equals("m")){
                    System.out.println("Click en Modificar " + oBoton);
                }
                if (oBoton.getName().equals("e")){
                    System.out.println("Click en Eliminar " + oBoton);
                }
            }
        }
        
    }//GEN-LAST:event_jTableMantenimientoMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CV0101v01JDialogModificarTablaConBotones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CV0101v01JDialogModificarTablaConBotones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CV0101v01JDialogModificarTablaConBotones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CV0101v01JDialogModificarTablaConBotones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CV0101v01JDialogModificarTablaConBotones dialog = new CV0101v01JDialogModificarTablaConBotones(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableMantenimiento;
    // End of variables declaration//GEN-END:variables
}
