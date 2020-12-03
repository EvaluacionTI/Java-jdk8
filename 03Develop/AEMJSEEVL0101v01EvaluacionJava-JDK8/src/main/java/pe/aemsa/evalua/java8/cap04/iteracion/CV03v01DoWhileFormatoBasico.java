package pe.aemsa.evalua.java8.cap04.iteracion;

public class CV03v01DoWhileFormatoBasico {

    public static void main(String[] args) {
        int lIntN = 10;

        do{
            System.out.println("tick " + lIntN);
            lIntN --;
        }while (lIntN > 0);
    }

}
