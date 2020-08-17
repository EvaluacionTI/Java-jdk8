package pe.bbva.evalua.swing.view.jframe;

import java.awt.Color;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CV0203v01JFrameLogin extends javax.swing.JFrame {

    private static final Logger LOG = LoggerFactory.getLogger("CV0203v01JFrameLogin");

    public CV0203v01JFrameLogin() {
        initComponents();
        setLocationRelativeTo(null);
        this.setSize(400, 200);
        this.txtUsuario.setText("");
        this.jPasswordField.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        btnAcceder = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jPasswordField = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setText("Usuario : ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 30, 110, 14);

        jLabel2.setText("Clave : ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 80, 110, 14);
        getContentPane().add(txtUsuario);
        txtUsuario.setBounds(170, 30, 160, 20);

        btnAcceder.setText("Acceder");
        btnAcceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccederActionPerformed(evt);
            }
        });
        getContentPane().add(btnAcceder);
        btnAcceder.setBounds(70, 140, 110, 23);

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir);
        btnSalir.setBounds(230, 140, 110, 23);

        jPasswordField.setText("jPasswordField1");
        getContentPane().add(jPasswordField);
        jPasswordField.setBounds(170, 80, 160, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAccederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccederActionPerformed
        Color oColor = null;
        
        String sTxtUsr = txtUsuario.getText();
        String sTxtPsw = jPasswordField.getText();

        LOG.info("Usuario : {}", sTxtUsr);
        LOG.info("Clave : {}", sTxtPsw);

        if (sTxtUsr.equals("Queen") && sTxtPsw.equals("15172027")) {
            JOptionPane.showMessageDialog(null, "Acceso concedido", "[EVL] Evaluación", JOptionPane.YES_OPTION);

            CV0204v01JFrameMenuOpciones oMenu = new CV0204v01JFrameMenuOpciones();
            oMenu.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Usuario o clave incorrectos", "[EVL] Evaluación", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAccederActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CV0203v01JFrameLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcceder;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

}
