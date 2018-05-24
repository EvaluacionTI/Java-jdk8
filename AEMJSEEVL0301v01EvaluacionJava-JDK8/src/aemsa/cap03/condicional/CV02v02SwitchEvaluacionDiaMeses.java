package aemsa.cap03.condicional;

import javax.swing.JOptionPane;

public class CV02v02SwitchEvaluacionDiaMeses {

    public static void main(String[] args) {
        String mNumeroMes = null;
        String mNumeroAaaa = null;
        int dias = 0, mes = 0, aaaa = 0;

        //System.out.print("Mes (##): ");
        mNumeroMes = JOptionPane.showInputDialog(null, "Numero Mes : ");
        mNumeroAaaa = JOptionPane.showInputDialog(null, "Numero aaaa : ");

        mes = Integer.parseInt(mNumeroMes);

        aaaa = Integer.parseInt(mNumeroAaaa);

        switch (mes) {
            case 1:      // eneroo      case 3:      // marzo
            case 5:      // mayo
            case 7:      // julio
            case 8:      // agosto
            case 10:     // octubre
            case 12:     // diciembre
                dias = 31;
                break;
            case 4:      // abril
            case 6:      // junio
            case 9:      // septiembre
            case 11:     // noviembre
                dias = 30;
                break;
            case 2:      // febrero
                // �Es el a�o bisiesto?
                if ((aaaa % 4 == 0) && (aaaa % 100 != 0) || (aaaa % 400 == 0)) {
                    dias = 29;
                } else {
                    dias = 28;
                }
                break;
            default:
                System.out.println("\nEl mes no es válido");
                break;
        }
        if (mes >= 1 && mes <= 12) {
            System.out.println("\nEl mes " + mes + " del año " + aaaa
                    + " tiene " + dias + " dias");
        }
    }
}
