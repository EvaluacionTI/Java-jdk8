package pe.bbva.evalua.swing.view.jframe;

public class CV0102v01JFrameLogin extends javax.swing.JFrame {

    public CV0102v01JFrameLogin() {
        initComponents();
        this.setSize(400,200);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtClave = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setText("Ingrese Usuario");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 30, 110, 14);

        jLabel2.setText("Ingrese Clave");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 80, 110, 14);
        getContentPane().add(txtUsuario);
        txtUsuario.setBounds(170, 30, 160, 20);
        getContentPane().add(txtClave);
        txtClave.setBounds(170, 80, 160, 20);

        btnAceptar.setText("EDITAR");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAceptar);
        btnAceptar.setBounds(70, 140, 110, 23);

        btnSalir.setText("SALIR");
        getContentPane().add(btnSalir);
        btnSalir.setBounds(230, 140, 110, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAceptarActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CV0102v01JFrameLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtClave;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

}
