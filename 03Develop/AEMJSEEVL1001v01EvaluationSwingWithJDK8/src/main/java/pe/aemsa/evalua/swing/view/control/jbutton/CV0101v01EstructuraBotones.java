package pe.aemsa.evalua.swing.view.control.jbutton;


import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class CV0101v01EstructuraBotones extends JButton{

    public static void main(String[] paAemsa){
        JFrame oJFrame = new JFrame();

        oJFrame.setTitle("Control JButton");
        oJFrame.setVisible(true);

        String sPathFile = "F:\\01NetBeans8.2\\02Terminado\\AEMJSEEVL0101v01EvaluationSwingWithJDK8\\src\\resources\\pe\\aemsa\\evalua\\swing\\view\\jbutton\\AberdeenAngusMacho.jpg";
        sPathFile = "F:\\2020Java8\\03Develop\\AEMJSEEVL1001v01EvaluationSwingWithJDK8\\src\\main\\resources\\pe.aemsa.evalua.swing.view.control.jbutton\\AberdeenAngusMacho.jpg";
        JButton oJButtonSinTextoIcono = new JButton();
        JButton oJButtonConTexto = new JButton("Mostrar");
        JButton oJButtonConIcono = new JButton(new ImageIcon(sPathFile));
        JButton oJButtonConTextoIcono = new JButton("Toro", new ImageIcon(sPathFile));
        
        oJButtonSinTextoIcono.setBounds(50, 100, 95, 30);
        oJFrame.add(oJButtonSinTextoIcono);
        
        oJButtonConTexto.setBounds(50, 150, 95, 30);
        oJFrame.add(oJButtonConTexto);
        
        oJButtonConIcono.setBounds(50, 200, 295, 300);
        oJFrame.add(oJButtonConIcono);
        
        oJButtonConTextoIcono.setBounds(350, 200, 295, 300);
        oJFrame.add(oJButtonConTextoIcono);

        oJFrame.setSize(700, 600);
        oJFrame.setLayout(null);
        oJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }   


}
