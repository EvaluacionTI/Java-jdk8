/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.aemsa.evalua.swing.view;

/**
 *
 * @author Administrador
 */
public class JDialog0101v01ReservaUnaCancha extends javax.swing.JDialog {

    /**
     * Creates new form JDialog0101v01ReservaUnaCancha
     */
    public JDialog0101v01ReservaUnaCancha(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelTitleReserva = new javax.swing.JPanel();
        jLabelTitleReserva = new javax.swing.JLabel();
        jPanelBodyReserva = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelCanchaDeportiva = new javax.swing.JLabel();
        jButtonCancha01 = new javax.swing.JButton();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabelHorarioDeportivo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableHorarioDeportivo = new javax.swing.JTable();
        jPanelFootReserva = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(".....[ Módulo Deportivo ].....");
        setResizable(false);

        jPanelTitleReserva.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelTitleReserva.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabelTitleReserva.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitleReserva.setText("Reserva de cancha deportiva");

        javax.swing.GroupLayout jPanelTitleReservaLayout = new javax.swing.GroupLayout(jPanelTitleReserva);
        jPanelTitleReserva.setLayout(jPanelTitleReservaLayout);
        jPanelTitleReservaLayout.setHorizontalGroup(
            jPanelTitleReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelTitleReserva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelTitleReservaLayout.setVerticalGroup(
            jPanelTitleReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelTitleReserva, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel1.setText("Fecha de reserva : ");

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel2.setText("Tipo de deporte : ");

        jLabelCanchaDeportiva.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabelCanchaDeportiva.setText("Cancha deportiva");

        jButtonCancha01.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jButtonCancha01.setText("Cancha No - 01\nTierra batida");
        jButtonCancha01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancha01ActionPerformed(evt);
            }
        });

        jFormattedTextField1.setText("20 / 05 / 2019");
        jFormattedTextField1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        jComboBox1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabelHorarioDeportivo.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabelHorarioDeportivo.setText("Horario deportivo");

        jTableHorarioDeportivo.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jTableHorarioDeportivo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "No", "Hora Inicio", "Hora Término"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableHorarioDeportivo);
        if (jTableHorarioDeportivo.getColumnModel().getColumnCount() > 0) {
            jTableHorarioDeportivo.getColumnModel().getColumn(0).setResizable(false);
        }

        javax.swing.GroupLayout jPanelBodyReservaLayout = new javax.swing.GroupLayout(jPanelBodyReserva);
        jPanelBodyReserva.setLayout(jPanelBodyReservaLayout);
        jPanelBodyReservaLayout.setHorizontalGroup(
            jPanelBodyReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBodyReservaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBodyReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBodyReservaLayout.createSequentialGroup()
                        .addGroup(jPanelBodyReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelBodyReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelBodyReservaLayout.createSequentialGroup()
                        .addGroup(jPanelBodyReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelCanchaDeportiva)
                            .addComponent(jButtonCancha01, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanelBodyReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelHorarioDeportivo))))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        jPanelBodyReservaLayout.setVerticalGroup(
            jPanelBodyReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBodyReservaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBodyReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jFormattedTextField1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelBodyReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelBodyReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCanchaDeportiva)
                    .addComponent(jLabelHorarioDeportivo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelBodyReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCancha01, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(137, 137, 137))
        );

        javax.swing.GroupLayout jPanelFootReservaLayout = new javax.swing.GroupLayout(jPanelFootReserva);
        jPanelFootReserva.setLayout(jPanelFootReservaLayout);
        jPanelFootReservaLayout.setHorizontalGroup(
            jPanelFootReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanelFootReservaLayout.setVerticalGroup(
            jPanelFootReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelTitleReserva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelBodyReserva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelFootReserva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelTitleReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelBodyReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelFootReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancha01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancha01ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCancha01ActionPerformed

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
            java.util.logging.Logger.getLogger(JDialog0101v01ReservaUnaCancha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDialog0101v01ReservaUnaCancha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDialog0101v01ReservaUnaCancha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialog0101v01ReservaUnaCancha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDialog0101v01ReservaUnaCancha dialog = new JDialog0101v01ReservaUnaCancha(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButtonCancha01;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelCanchaDeportiva;
    private javax.swing.JLabel jLabelHorarioDeportivo;
    private javax.swing.JLabel jLabelTitleReserva;
    private javax.swing.JPanel jPanelBodyReserva;
    private javax.swing.JPanel jPanelFootReserva;
    private javax.swing.JPanel jPanelTitleReserva;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableHorarioDeportivo;
    // End of variables declaration//GEN-END:variables
}