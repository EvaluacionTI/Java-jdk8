package pe.isaengine.evalua.java15.codeqr.utility;

import com.google.zxing.WriterException;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CU02WindowQR extends JFrame{
    
    public CU02WindowQR() throws WriterException {
        CU01GenerarQR generaQR = new CU01GenerarQR();
//        BufferedImage imagen = generaQR.crearQR("https://medium.com/el-acordeon-del-programador", 300, 300);
        BufferedImage imagen = generaQR.crearQR("Illari, Chabelo, Kasuki y Pau", 500, 500);
        ImageIcon icono = new ImageIcon(imagen);
        JLabel etiqueta = new JLabel("");
         
        etiqueta.setIcon(icono);
         
        this.setIconImage(imagen);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("[EVL] Generación QR");
        this.getContentPane().add(etiqueta);
        this.pack();        
    }
    
}
