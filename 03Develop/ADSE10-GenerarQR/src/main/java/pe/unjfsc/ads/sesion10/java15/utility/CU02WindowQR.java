package pe.unjfsc.ads.sesion10.java15.utility;

import com.google.zxing.WriterException;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CU02WindowQR extends JFrame{
    private static final Logger LOG = LoggerFactory.getLogger("CU02WindowQR");
            
    public CU02WindowQR() throws WriterException {
       
        CU01GenerarQR oGeneraQR = new CU01GenerarQR();
        
        String sDatos = "Illari, Chabelo, Kasuki y Pau";
        int iAncho = 300;
        int iAlto = 300;
        
        LOG.info("[ADS] Datos ancho y altura : {} {} {}", sDatos, iAncho, iAlto);
        BufferedImage imagen = oGeneraQR.crearQR(sDatos, iAncho, iAlto);
        
        ImageIcon icono = new ImageIcon(imagen);
        JLabel etiqueta = new JLabel("");
        etiqueta.setIcon(icono);
         
        this.setIconImage(imagen);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("[ADS] Generación QR");
        this.getContentPane().add(etiqueta);
        this.pack();        
    }

}
