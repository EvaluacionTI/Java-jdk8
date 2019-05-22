package pe.aemsa.cap02.operador;

public class CV02v01OperadoresAritmetico {

    public static void main(String[] args) {

        System.out.println("Operaciones Aritméticas con Enteros");

        int lInta = 1 + 1;
        int lIntb = lInta * 3;
        int lIntc = lIntb / 4;
        int lIntd = lIntc - lInta;
        int lInte = - lIntd;

        System.out.println("Valor de a = " + lInta);
        System.out.println("Valor de b = " + lIntb);
        System.out.println("Valor de c = " + lIntc);
        System.out.println("Valor de d = " + lIntd);
        System.out.println("Valor de e = " + lInte);

        System.out.println("Operaciones Aritméticas con Punto Flotante");

        double lDbla = 1 + 1;
        double lDblb = lDbla * 3;
        double lDblc = lDblb / 4;
        double lDbld = lDblc - lDbla;
        double lDble = - lDbld;

        System.out.println("Valor de a = " + lDbla);
        System.out.println("Valor de b = " + lDblb);
        System.out.println("Valor de c = " + lDblc);
        System.out.println("Valor de d = " + lDbld);
        System.out.println("Valor de e = " + lDble);
    }

}
