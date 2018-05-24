package aemsa.cap03.condicional;

public class CV01v01IfSimple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a, b;
        a=6;
        b = 10;

        if (a<b) a=0;
        else b = 0;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

}
