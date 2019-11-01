package pe.aemsa.evalua.swing.view.jbutton;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CV0201v01MatrizHorarioBotones extends JButton {

    public static void main(String[] args) {
        JFrame oJFrame = new JFrame();
        JButton oJButtonHorario;
        JButton oJButtonCancha;

        oJFrame.setTitle(".....[Evaluación Swing - Botones].....");
        oJFrame.setVisible(true);
        oJFrame.setSize(800, 600);
        oJFrame.setLayout(null);
        oJFrame.setResizable(false);
        oJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String asHoraAlquiler[][] = new String[9][3];

        asHoraAlquiler[1][1] = "  6 -   7 am";
        asHoraAlquiler[2][1] = "  8 -   9 am";
        asHoraAlquiler[3][1] = "10 - 11 am";
        asHoraAlquiler[4][1] = "12 - 13 pm";
        asHoraAlquiler[5][1] = "14 - 15 pm";
        asHoraAlquiler[6][1] = "16 - 17 pm";
        asHoraAlquiler[7][1] = "18 - 19 pm";
        asHoraAlquiler[8][1] = "20 - 21 pm";

        asHoraAlquiler[1][2] = "  7 -   8 am";
        asHoraAlquiler[2][2] = "  9 - 10 am";
        asHoraAlquiler[3][2] = "11 - 12 am";
        asHoraAlquiler[4][2] = "13 - 14 pm";
        asHoraAlquiler[5][2] = "15 - 16 pm";
        asHoraAlquiler[6][2] = "17 - 18 pm";
        asHoraAlquiler[7][2] = "19 - 20 pm";
        asHoraAlquiler[8][2] = "21 - 22 pm";

        int iEjeX = 350;
        int iEjeY = 90;
        int iWidth = 200;
        int iHeight = 60;
        int iSkipHeight = 60;
        int iTotalSkip = 0;

        // Botones del lado izquierdo
        iTotalSkip = iEjeY;
        System.out.println(iTotalSkip);
        oJButtonHorario = new JButton(asHoraAlquiler[1][1]);
        oJButtonHorario.setBounds(iEjeX, iEjeY, iWidth, iHeight);
        oJFrame.add(oJButtonHorario);
        iTotalSkip += iSkipHeight;
        System.out.println(iTotalSkip);

        oJButtonHorario = new JButton(asHoraAlquiler[2][1]);
        oJButtonHorario.setBounds(iEjeX, iTotalSkip, iWidth, iHeight);
        oJFrame.add(oJButtonHorario);
        iTotalSkip += iSkipHeight;
        System.out.println(iTotalSkip);

        oJButtonHorario = new JButton(asHoraAlquiler[3][1]);
        oJButtonHorario.setBounds(iEjeX, iTotalSkip, iWidth, iHeight);
        oJFrame.add(oJButtonHorario);
        iTotalSkip += iSkipHeight;
        System.out.println(iTotalSkip);

        oJButtonHorario = new JButton(asHoraAlquiler[4][1]);
        oJButtonHorario.setBounds(iEjeX, iTotalSkip, iWidth, iHeight);
        oJFrame.add(oJButtonHorario);
        iTotalSkip += iSkipHeight;
        System.out.println(iTotalSkip);

        oJButtonHorario = new JButton(asHoraAlquiler[5][1]);
        oJButtonHorario.setBounds(iEjeX, iTotalSkip, iWidth, iHeight);
        oJFrame.add(oJButtonHorario);
        iTotalSkip += iSkipHeight;
        System.out.println(iTotalSkip);

        oJButtonHorario = new JButton(asHoraAlquiler[6][1]);
        oJButtonHorario.setBounds(iEjeX, iTotalSkip, iWidth, iHeight);
        oJFrame.add(oJButtonHorario);
        iTotalSkip += iSkipHeight;
        System.out.println(iTotalSkip);

        oJButtonHorario = new JButton(asHoraAlquiler[7][1]);
        oJButtonHorario.setBounds(iEjeX, iTotalSkip, iWidth, iHeight);
        oJFrame.add(oJButtonHorario);
        iTotalSkip += iSkipHeight;
        System.out.println(iTotalSkip);

        oJButtonHorario = new JButton(asHoraAlquiler[8][1]);
        oJButtonHorario.setBounds(iEjeX, iTotalSkip, iWidth, iHeight);
        oJFrame.add(oJButtonHorario);
        iTotalSkip += iSkipHeight;
        System.out.println(iTotalSkip);

        // Botones del lado derecho
        iTotalSkip = iEjeY;
        iEjeX = 550;
        for (int i = 1; i < 9; i++) {
            oJButtonHorario = new JButton(asHoraAlquiler[i][2]);
            oJButtonHorario.setBounds(iEjeX, iTotalSkip, iWidth, iHeight);
            oJFrame.add(oJButtonHorario);
            iTotalSkip += iSkipHeight;
        }

        // Botones de las canchas
        String asCanchaAlquiler[] = new String[13];

        asCanchaAlquiler[1] = "Cancha N° 1";
        asCanchaAlquiler[2] = "Cancha N° 2";
        asCanchaAlquiler[3] = "Cancha N° 3";
        asCanchaAlquiler[4] = "Cancha N° 4";
        asCanchaAlquiler[5] = "Cancha N° 5";
        asCanchaAlquiler[6] = "Cancha N° 6";
        asCanchaAlquiler[7] = "Cancha N° 7";
        asCanchaAlquiler[8] = "Cancha N° 8";
        asCanchaAlquiler[9] = "Cancha N° 9";
        asCanchaAlquiler[10] = "Cancha N° 10";
        asCanchaAlquiler[11] = "Cancha N° 11";
        asCanchaAlquiler[12] = "Cancha N° 12";
        
        iEjeX = 50;
        iEjeY = 90;
        iWidth = 200;
        iHeight = 60;
        iSkipHeight = 60;
        iTotalSkip = 0;
        int iNumeroCanchaMostrar = 5;
        iTotalSkip = iEjeY;
        for (int i = 1; i < iNumeroCanchaMostrar + 1; i++) {
            oJButtonCancha = new JButton(asCanchaAlquiler[i]);
            oJButtonCancha.setBounds(iEjeX, iTotalSkip, iWidth, iHeight);
            oJFrame.add(oJButtonCancha);
            iTotalSkip += iSkipHeight;
        }
    }

}
