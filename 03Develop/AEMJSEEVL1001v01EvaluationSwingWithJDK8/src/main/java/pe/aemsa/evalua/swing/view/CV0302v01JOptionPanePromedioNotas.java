package pe.aemsa.evalua.swing.view;

import javax.swing.JOptionPane;

public class CV0302v01JOptionPanePromedioNotas {

    public static void main(String[] args) {

        //1. Declarando Variables
        int miNotaParcial, miNotaFinal, miNotaLectura, niNotaTrabajo;
        int miNotaPromedio;
        
        String msNotaParcial, msNotaFinal, msNotaLectura, msNotaTrabajo;

        // 2. Asignado Valores
        miNotaParcial = 0;
        miNotaFinal = 0;
        miNotaLectura = 0;
        niNotaTrabajo = 0;

        msNotaParcial = JOptionPane.showInputDialog("Nota Parcial ");
        msNotaFinal = JOptionPane.showInputDialog("Nota Final ");
        msNotaLectura = JOptionPane.showInputDialog("Nota Lectura ");
        msNotaTrabajo = JOptionPane.showInputDialog("Nota Trabajo ");

        // 3. Procesando la informacion
        // 3.1 Convirtiendo valores
        miNotaParcial = Integer.parseInt(msNotaParcial);
        miNotaFinal = Integer.parseInt(msNotaFinal);
        miNotaLectura = Integer.parseInt(msNotaLectura);
        niNotaTrabajo = Integer.parseInt(msNotaTrabajo);

        // 3.2 Calculando el interes corrido con la formula

        miNotaPromedio = (miNotaParcial + miNotaFinal + miNotaLectura + niNotaTrabajo)/4;

        // 4. Mostrando los resultados
        System.out.println("Promedio Notas = " + miNotaPromedio);
        JOptionPane.showMessageDialog(null, miNotaPromedio);

    }
}
