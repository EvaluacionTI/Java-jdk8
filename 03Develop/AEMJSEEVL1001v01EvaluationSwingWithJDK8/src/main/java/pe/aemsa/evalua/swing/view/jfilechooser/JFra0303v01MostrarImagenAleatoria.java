package pe.aemsa.evalua.swing.view.jfilechooser;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class JFra0303v01MostrarImagenAleatoria extends javax.swing.JFrame {
    String sRutaImagen = "\\imagen\\";
    String asRutaImagen[] = {sRutaImagen + "AberdeenAngusMacho.jpg", sRutaImagen + "BrahmanMacho.jpg", sRutaImagen + "BrownSwissMacho.jpg", sRutaImagen + "CharolaiseMacho.jpg", sRutaImagen + "CriolloMacho.jpg" };

    public JFra0303v01MostrarImagenAleatoria() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLblImagen = new javax.swing.JLabel();
        jBtnMostrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jBtnMostrar.setText("Generar Imagen Aleatoria");
        jBtnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnMostrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLblImagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jBtnMostrar, javax.swing.GroupLayout.DEFAULT_SIZE, 437, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBtnMostrar, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnMostrarActionPerformed
        // generamos número aleatorio
        int iRandom = (int) (Math.random()*3);
        // indicamos que nuestra imagen está en local y mandamos la ruta previamente declarada

        //URL url = this.getClass().getResource(asRutaImagen[iRandom]);
        Class oClass = getClass();
        URL url = oClass.getResource("AberdeenAngusMacho.jpg");
        try{
            // Verificamos si no es null
            if (url!=null){
                // Verificamos si existe el archivo
                File oArchivo = new File(url.getFile());
                if (oArchivo.exists()){
                    // Leemos la imagen
                    Image oImagen = ImageIO.read(url);
                    // Asignamos la imagen
                    jLblImagen.setIcon(new ImageIcon(oImagen));
                }else{
                    JOptionPane.showMessageDialog(null, "Archivo No existe");
                }
            }else{
                JOptionPane.showMessageDialog(null, "Archivo No existe");
            }
        }catch(IOException exIO){
            JOptionPane.showMessageDialog(null, exIO.getMessage());
        }

    }//GEN-LAST:event_jBtnMostrarActionPerformed

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
            java.util.logging.Logger.getLogger(JFra0303v01MostrarImagenAleatoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFra0303v01MostrarImagenAleatoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFra0303v01MostrarImagenAleatoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFra0303v01MostrarImagenAleatoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFra0303v01MostrarImagenAleatoria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnMostrar;
    private javax.swing.JLabel jLblImagen;
    // End of variables declaration//GEN-END:variables
}
