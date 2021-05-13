package pe.unjfsc.ads.sesion10.java15.utility;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.Writer;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import java.awt.image.BufferedImage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CU01GenerarQR {
    private static final Logger LOG = LoggerFactory.getLogger("CUGenerarQR");
    
    public BufferedImage crearQR(String datos, int ancho, int altura) throws WriterException {
        BitMatrix matrix;
        Writer escritor = new QRCodeWriter();
        
        LOG.info("[ADS] Datos, ancho y altura : {} {} {} ", datos, ancho, altura);
        matrix = escritor.encode(datos, BarcodeFormat.QR_CODE, ancho, altura);
        LOG.info("[ADS] Imagen before QR : {}", matrix);
        
        BufferedImage imagen = new BufferedImage(ancho, altura, BufferedImage.TYPE_INT_RGB);
        LOG.info("[ADS] Imagen before QR : {}", imagen);
        
        for(int y = 0; y < altura; y++) {
            for(int x = 0; x < ancho; x++) {
                int grayValue = (matrix.get(x, y) ? 0 : 1) & 0xff;
                imagen.setRGB(x, y, (grayValue == 0 ? 0 : 0xFFFFFF));
            }
        }
        LOG.info("[ADS] Imagen QR : {}", imagen);
        return imagen;        
    }   

}
