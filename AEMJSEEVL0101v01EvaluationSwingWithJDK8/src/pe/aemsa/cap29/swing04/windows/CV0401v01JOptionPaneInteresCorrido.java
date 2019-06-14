package pe.aemsa.cap29.swing04.windows;

import javax.swing.JOptionPane;

public class CV0401v01JOptionPaneInteresCorrido {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //1. Declarando Variables
        double mdTea;
        double mdMontoPrestamo;
        double mdInteresCorrido, mdBase, mdExponente;
        int miPlazo;
        String msTea, msMontoPrestamo, msPlazo;
        
        // 2. Asignado Valores
        mdTea = 0.0;
        mdMontoPrestamo = 0.0;
        miPlazo = 0;
        
        msTea = JOptionPane.showInputDialog("Tasa de Interes ");
        msMontoPrestamo = JOptionPane.showInputDialog("Monto del Prestamo ");
        msPlazo = JOptionPane.showInputDialog("Plazo ");
        
        // 3. Procesando la informacion
        // 3.1 Convirtiendo valores
        mdTea = Double.parseDouble(msTea);
        mdMontoPrestamo = Double.parseDouble(msMontoPrestamo);
        miPlazo = Integer.parseInt(msPlazo);
        
        // 3.2 Calculando el interes corrido con la formula
        
        mdBase = (1+mdTea*0.01);
        mdExponente = (miPlazo / 360D);
        mdInteresCorrido = (Math.pow(mdBase, mdExponente)-1)*mdMontoPrestamo;
        
        // 4. Mostrando los resultados
        System.out.println("Interes Corrido = " + mdInteresCorrido);
        JOptionPane.showMessageDialog(null, mdInteresCorrido);
    }
}
