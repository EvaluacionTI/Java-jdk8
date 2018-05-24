package aemsa.cap09.clase.vista;

interface Interfaz {

    public abstract void p();

    public abstract void m();
}

class Clase2 {

    private int i;

    // ...
    public Interfaz metClase2() {
        return new Interfaz() {
            @Override
            public void p() {
                System.out.println("metodo p");
            }

            @Override
            public void m() {
                System.out.println("metodo m");
            }
        };
    }
}

public class CV0501v01ClaseAnonima {

    public static void main(String[] args) {
        Clase2 obj = new Clase2();
        Interfaz iobj = obj.metClase2(); // devuelve un objeto Clase3
        iobj.m();
    }
}