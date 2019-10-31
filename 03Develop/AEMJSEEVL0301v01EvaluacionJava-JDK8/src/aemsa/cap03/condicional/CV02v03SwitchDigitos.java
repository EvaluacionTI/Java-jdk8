package aemsa.cap03.condicional;

public class CV02v03SwitchDigitos {

    public static void main(String[] args) {
        System.out.println(convertirEnLetras('7') + " "
                + convertirEnLetras('8') + " "
                + convertirEnLetras('6'));
    }

    public static String convertirEnLetras(char pcDigito) {
        
        String lsNumeroEnLetras = "";
        
        switch (pcDigito) {
            case '1':
                lsNumeroEnLetras = "UNO";
                break;
            case '2':
                lsNumeroEnLetras = "DOS";
                break;
            case '3':
                lsNumeroEnLetras = "TRES";
                break;
            case '4':
                lsNumeroEnLetras = "CUATRO";
                break;
            case '5':
                lsNumeroEnLetras = "CINCO";
                break;
            case '6':
                lsNumeroEnLetras = "SEIS";
                break;
            case '7':
                lsNumeroEnLetras = "SIETE";
                break;
            case '8':
                lsNumeroEnLetras = "OCHO";
                break;
            case '9':
                lsNumeroEnLetras = "NUEVE";
                break;
            case '0':
                lsNumeroEnLetras = "CERO";
                break;
            default:
                System.out.println(pcDigito + " NO ES UN DIGITO!");
        }
        return lsNumeroEnLetras;
    }
}
