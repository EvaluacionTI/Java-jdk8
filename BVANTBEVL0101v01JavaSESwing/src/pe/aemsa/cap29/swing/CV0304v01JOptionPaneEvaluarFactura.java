/*
 * Crear un programa que realice el calculo del importe de la factura
 * 
 * Base Imponible = 3500
 * Descuento = 10%
 * Impuesto = 18%
 * 
 * Formula utilizada = BaseImponible - BaseImponible * 10% + BaseImponible * 18%
 */
package pe.aemsa.cap29.swing;

import javax.swing.JOptionPane;

public class CV0304v01JOptionPaneEvaluarFactura {

    public static void main(String[] args) {
        //1. Declarando las variables
        double mdBaseImponible, mdPorcentajeDescuento, mdPorcentajeImpuesto, mdImporteFacturado;
        String msBaseImponible, msPorcentajeDescuento, msPorcentajeImpuesto;

        //2. Asignando Valores
        msBaseImponible = JOptionPane.showInputDialog("Base Imponible");
        msPorcentajeDescuento = JOptionPane.showInputDialog("Descuento (%)");
        msPorcentajeImpuesto = JOptionPane.showInputDialog("Impuesto (%)");

        //3. Convirtiendo los valores
        mdBaseImponible = Double.parseDouble(msBaseImponible);
        mdPorcentajeDescuento = Double.parseDouble(msPorcentajeDescuento);
        mdPorcentajeImpuesto = Double.parseDouble(msPorcentajeImpuesto);

        // 3.1 Utilizando la formula o llamando al metodo
        mdImporteFacturado = calcularImporteFactura(mdBaseImponible, mdPorcentajeDescuento, mdPorcentajeImpuesto);

        // 4. Mostrando los resultados
        System.out.println("Monto Facturado = " + mdImporteFacturado);
        JOptionPane.showMessageDialog(null, mdImporteFacturado);

    }

    static double calcularImporteFactura(double pdBaseImponible, double pdPorcentajeDescuento,
                                                             double pdPorcentajeImpuesto) {
        // 1. Declarando variable locales propias del METODO
        double ldImporteFacturado = 0;

        // 2. Calculando la formula
        ldImporteFacturado = (pdBaseImponible - (pdBaseImponible * pdPorcentajeDescuento * 0.01)
                                         + (pdBaseImponible * pdPorcentajeImpuesto * 0.01)
                                        );

        // 3. Retornado los resultados
        return ldImporteFacturado;
    }
}
