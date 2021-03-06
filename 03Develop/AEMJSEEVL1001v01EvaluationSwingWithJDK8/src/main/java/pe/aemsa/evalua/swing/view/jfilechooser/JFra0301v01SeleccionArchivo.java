package pe.aemsa.evalua.swing.view.jfilechooser;

import java.awt.Image;
import java.io.File;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class JFra0301v01SeleccionArchivo extends javax.swing.JFrame {
    private File oArchivo;

    public JFra0301v01SeleccionArchivo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jBtnCargarImagen = new javax.swing.JButton();
        jLblMostrarImagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jBtnCargarImagen.setText("Cargar Imagen");
        jBtnCargarImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCargarImagenActionPerformed(evt);
            }
        });

        jLblMostrarImagen.setBackground(new java.awt.Color(204, 204, 255));
        jLblMostrarImagen.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jBtnCargarImagen, javax.swing.GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE)
            .addComponent(jLblMostrarImagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLblMostrarImagen, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBtnCargarImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>                        

    private void jBtnCargarImagenActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        int iResultado;

        JFra0302v01CargarImagen oVentana = new JFra0302v01CargarImagen();
        FileNameExtensionFilter oFiltro = new FileNameExtensionFilter("Ëxtensiones jpg y png", "jpg", "png");
        oVentana.jFChoCargarImagen.setFileFilter(oFiltro);
        
        // Cargar y verificar que el archivo es el elegido
        iResultado = oVentana.jFChoCargarImagen.showOpenDialog(null);
        
        // Comparar el valor vs el JFileChooser
        if (JFileChooser.APPROVE_OPTION == iResultado){
            oArchivo = oVentana.jFChoCargarImagen.getSelectedFile();
            try{
                ImageIcon oImagen = new ImageIcon(oArchivo.toString());
                
                // Redimensionar la imagen a las medidas del label
                Icon oIcono = new ImageIcon(oImagen.getImage().getScaledInstance(jLblMostrarImagen.getWidth(), jLblMostrarImagen.getHeight(), Image.SCALE_DEFAULT));
                jLblMostrarImagen.setText(null);
                jLblMostrarImagen.setIcon(oIcono);
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Error al abrir el archivo de imagen");
            }
        }
        
    }                                                

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
            java.util.logging.Logger.getLogger(JFra0301v01SeleccionArchivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFra0301v01SeleccionArchivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFra0301v01SeleccionArchivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFra0301v01SeleccionArchivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFra0301v01SeleccionArchivo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jBtnCargarImagen;
    private javax.swing.JLabel jLblMostrarImagen;
    // End of variables declaration                   
}
