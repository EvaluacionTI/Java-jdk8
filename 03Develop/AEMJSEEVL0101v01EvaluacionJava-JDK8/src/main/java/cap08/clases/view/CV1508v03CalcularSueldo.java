package pe.aemsa.evalua.java.cap08.clases.view;

import pe.aemsa.evalua.java.cap08.clases.view.CO08v01ClaseLectura;

class CV1508v03CalcularSueldo {

    public static void main(String[] args) {
        double s = 0;
        double aumento = 0;
        double t = 0;

        System.out.print("Sueldo:");
        s = CO08v01ClaseLectura.leerDouble();

        if (s < 2000) {
            aumento = s * 0.23;
            System.out.println("Aumento:" + aumento);
            t = s + aumento;
            System.out.print("Sueldo:" + t);
        } else {
            if ((s >= 2000) && (s <= 3000)) {
                aumento = s * 0.17;
                System.out.println("Aumento:" + aumento);
                t = s + aumento;
                System.out.print("Sueldo:" + t);
            } else {
                if (s > 3000) {
                    aumento = s * 0.12;
                    System.out.println("Aumento:" + aumento);
                    t = s + aumento;
                    System.out.print("Sueldo:" + t);

                }

            }
        }
    }
}
