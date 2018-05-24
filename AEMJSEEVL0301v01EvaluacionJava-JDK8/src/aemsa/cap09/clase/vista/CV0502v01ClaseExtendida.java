package aemsa.cap09.clase.vista;

class ClaseA {

    public int atributo_x = 1;

    public int metodo_x() {
        return atributo_x * 10;
    }

    public int metodo_y() {
        return atributo_x + 100;
    }

    @Override
    protected void finalize() throws Throwable // destructor
    {
        try {
            System.out.println("Recursos de ClaseA liberados");
        } finally {
            super.finalize();
        }
    }
}

class ClaseB extends ClaseA {

    protected int atributo_x = 2;

    @Override
    public int metodo_x() {
        return atributo_x * -10;
    }

    public int metodo_z() {
        atributo_x = super.atributo_x + 3;
        return super.metodo_x() + atributo_x;
    }

    @Override
    protected void finalize() throws Throwable // destructor
    {
        System.out.println("Recursos de ClaseB liberados");
        super.finalize();
    }
}

public class CV0502v01ClaseExtendida {

    public static void main(String[] args) {
        
        ClaseB objClaseB = new ClaseB();
        
        System.out.println(objClaseB.atributo_x); // escribe 2
        System.out.println(objClaseB.metodo_y()); // escribe 101
        System.out.println(objClaseB.metodo_x()); // escribe -20
        System.out.println(objClaseB.metodo_z()); // escribe 14 
        
        objClaseB = null;
        
        // Ejecutar el recolector de basura
        Runtime runtime = Runtime.getRuntime();
        runtime.gc();
        runtime.runFinalization();
    }
}
