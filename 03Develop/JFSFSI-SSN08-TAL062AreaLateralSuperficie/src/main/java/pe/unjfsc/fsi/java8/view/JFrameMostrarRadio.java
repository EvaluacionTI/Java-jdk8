package pe.unjfsc.fsi.java8.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pe.unjfsc.fsi.java8.entity.CEAreaSuperficieLateral;
import pe.unjfsc.fsi.java8.entity.CEMostrarDatos;
import pe.unjfsc.fsi.java8.logical.CIEvaluarSuperficie;
import pe.unjfsc.fsi.java8.logical.impl.CMEvaluarArea;

public class JFrameMostrarRadio extends javax.swing.JFrame {
    public static final Logger LOG = LoggerFactory.getLogger("JFrameMostrarRadio");
    
    private CEAreaSuperficieLateral oCELsa;
    private CEMostrarDatos oCEMostrar, oCEMostrarResponse;
    private CIEvaluarSuperficie oCIArea;

    public JFrameMostrarRadio() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldLSA = new javax.swing.JTextField();
        jTextFieldPI = new javax.swing.JTextField();
        jTextFieldAltura = new javax.swing.JTextField();
        jTextFieldRadio = new javax.swing.JTextField();
        jTextFieldTSA = new javax.swing.JTextField();
        jTextFieldDiametro = new javax.swing.JTextField();
        jTextFieldATE = new javax.swing.JTextField();
        jTextFieldRotarID = new javax.swing.JTextField();
        jTextField1erUltCaracter = new javax.swing.JTextField();
        jButtonLimpiar = new javax.swing.JButton();
        jButtonCalcular = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldMayuscula = new javax.swing.JTextField();
        jTextFieldMinuscula = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Area lateral de superficie (LSA)");

        jLabel2.setText("PI");

        jLabel3.setText("Altura o base");

        jLabel4.setText("Radio");

        jLabel5.setText("Area total de superficie (TSA)");

        jLabel6.setText("Diametro de cilindro");

        jLabel7.setText("Area triangulo equilatero");

        jLabel8.setText("Rotar de derecha a izquierda");

        jLabel9.setText("1er, Ultimo caracter");

        jButtonLimpiar.setText("Limpiar");
        jButtonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarActionPerformed(evt);
            }
        });

        jButtonCalcular.setText("Evaluar");
        jButtonCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalcularActionPerformed(evt);
            }
        });

        jLabel10.setText("En Mayuscula");

        jLabel11.setText("En Minuscula");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldLSA)
                            .addComponent(jTextFieldPI)
                            .addComponent(jTextFieldAltura)
                            .addComponent(jTextFieldRadio)
                            .addComponent(jTextFieldTSA)
                            .addComponent(jTextFieldDiametro)
                            .addComponent(jTextFieldATE, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(jTextFieldRotarID))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1erUltCaracter)
                            .addComponent(jTextFieldMinuscula)
                            .addComponent(jTextFieldMayuscula, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(229, 229, 229)
                        .addComponent(jButtonLimpiar)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonCalcular)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldLSA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldPI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldRadio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jTextFieldMinuscula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldTSA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldDiametro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jTextFieldMayuscula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jTextFieldATE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldRotarID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)
                        .addComponent(jTextField1erUltCaracter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonLimpiar)
                    .addComponent(jButtonCalcular))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarActionPerformed
        jTextFieldLSA.setText("");
        jTextFieldPI.setText("");
        jTextFieldAltura.setText("");
        jTextFieldRadio.setText("");
        jTextFieldTSA.setText("");
        jTextFieldDiametro.setText("");
        jTextFieldATE.setText("");
        jTextFieldRotarID.setText("");
        jTextFieldMinuscula.setText("");
        jTextFieldMayuscula.setText("");
        jTextField1erUltCaracter.setText("");
    }//GEN-LAST:event_jButtonLimpiarActionPerformed

    private void jButtonCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCalcularActionPerformed
        oCEMostrar = new CEMostrarDatos();
        oCELsa = new CEAreaSuperficieLateral();
        oCIArea = new CMEvaluarArea();
        
        oCELsa.setAltura(Double.parseDouble(jTextFieldAltura.getText()));
        oCEMostrar.setoCELsa(oCELsa);
        LOG.info(" CEMostrarDatos Request : {}", oCEMostrar);
        oCEMostrarResponse = new CEMostrarDatos();
        oCEMostrarResponse = oCIArea.seeData(oCEMostrar);
        LOG.info(" CEMostrarDatos Response : {}", oCEMostrar);
        sendData(oCEMostrarResponse);
    }//GEN-LAST:event_jButtonCalcularActionPerformed

    private void sendData(CEMostrarDatos poData){
        jTextFieldLSA.setText(String.valueOf(poData.getoCELsa().getLsa()));
        jTextFieldPI.setText(String.valueOf(poData.getValorPI()));
        jTextFieldAltura.setText(String.valueOf(poData.getoCELsa().getAltura()));
        jTextFieldRadio.setText(String.valueOf(poData.getoCELsa().getRadio()));
        jTextFieldTSA.setText(String.valueOf(poData.getoCETsa()));
        jTextFieldDiametro.setText(String.valueOf(poData.getoCELsa().getDiametro()));
        jTextFieldATE.setText(String.valueOf(poData.getoCETsa().getAte()));
        jTextFieldRotarID.setText(poData.getRotarIzquierdaDerecha());
        jTextFieldMinuscula.setText(poData.getEnMinuscula());
        jTextFieldMayuscula.setText(poData.getEnMayuscula());
        jTextField1erUltCaracter.setText(poData.getPrimerUltimoCaracter());
    }
    
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
            java.util.logging.Logger.getLogger(JFrameMostrarRadio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameMostrarRadio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameMostrarRadio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameMostrarRadio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameMostrarRadio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCalcular;
    private javax.swing.JButton jButtonLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1erUltCaracter;
    private javax.swing.JTextField jTextFieldATE;
    private javax.swing.JTextField jTextFieldAltura;
    private javax.swing.JTextField jTextFieldDiametro;
    private javax.swing.JTextField jTextFieldLSA;
    private javax.swing.JTextField jTextFieldMayuscula;
    private javax.swing.JTextField jTextFieldMinuscula;
    private javax.swing.JTextField jTextFieldPI;
    private javax.swing.JTextField jTextFieldRadio;
    private javax.swing.JTextField jTextFieldRotarID;
    private javax.swing.JTextField jTextFieldTSA;
    // End of variables declaration//GEN-END:variables
}
