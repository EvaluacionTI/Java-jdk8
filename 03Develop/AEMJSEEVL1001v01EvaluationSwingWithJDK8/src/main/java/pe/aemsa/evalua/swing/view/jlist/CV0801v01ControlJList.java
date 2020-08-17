package pe.aemsa.evalua.swing.view.jlist;

import java.awt.Color;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.SwingUtilities;

public class CV0801v01ControlJList extends JFrame{
    private JList<String> oListaPaises;

    public CV0801v01ControlJList(){
        // 1.0 Crea modelo y adiciona elementos
        DefaultListModel<String> oModeloPaises = new DefaultListModel<>();
        oModeloPaises.addElement("USA");
        oModeloPaises.addElement("India");
        oModeloPaises.addElement("Vietnam");
        oModeloPaises.addElement("Canadá");
        oModeloPaises.addElement("Perú");
        oModeloPaises.addElement("Francia");
        oModeloPaises.addElement("Brasil");
        oModeloPaises.addElement("Gran Bretana");
        oModeloPaises.addElement("Japon");
        
        // 2.0 Crea la lista con el modelo
        oListaPaises = new JList<>(oModeloPaises);
        add(oListaPaises);
        
        // 3.0 Configurando el frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("JList simple");
        this.setBackground(Color.yellow);
        this.setSize(200, 250);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CV0801v01ControlJList();

            }
        });
    }
    
}
