
package pe.aemsa.cap29.swing04.windows;

import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class CV0502v01BuscarImagenGetResource {

    private ImageIcon oImagen;
    
    public CV0502v01BuscarImagenGetResource(){
        oImagen = createImagen("/pe/aemsa/cap29/swing04/windows/AberdeenAngusMacho.jpg");
    }
    
    public void start(){
        JOptionPane.showMessageDialog(null, "Imagen", "", JOptionPane.PLAIN_MESSAGE, oImagen);
    }
    
    public static void main(String[] args) {
        CV0502v01BuscarImagenGetResource oImagenResource = new CV0502v01BuscarImagenGetResource();
        System.out.println("main :" + oImagenResource);
        oImagenResource.start();
    }
    
    private ImageIcon createImagen(String psPath){
        System.out.println("createImagen " + psPath);
        ImageIcon oImagen = new ImageIcon(Toolkit.getDefaultToolkit().getClass().getResource(psPath));
        System.out.println("Instancia imagen" + oImagen);
        return oImagen;
    }
       
}
