package pe.unjfsc.ads.java8.logical;

import pe.unjfsc.ads.java8.entity.CEOrdenar;

public class CLOrdenar {

    public CEOrdenar ordenarNumeros(int a, int b, int c) {
        int mayor = 0, medio = 0, menor = 0;

        CEOrdenar oCEOrdenar = new CEOrdenar();

        if (a > b) {
            if (a > c && b > c) {
                mayor = a;
                medio = b;
                menor = c;
            } else {
                mayor = a;
                medio = c;
                menor = b;
            }
        } else {
            if (a > c) {
                if (b > c) {
                    mayor = b;
                    medio = a;
                    menor = c;
                } else {
                    mayor = b;
                    medio = c;
                    menor = a;
                }
            } else {
                if (b > c) {
                    mayor = b;
                    medio = c;
                    menor = a;
                } else {
                    mayor = c;
                    medio = b;
                    menor = a;
                }
            }
        }

        oCEOrdenar.setMayor(mayor);
        oCEOrdenar.setMedio(medio);
        oCEOrdenar.setMenor(menor);
        return oCEOrdenar;
    }
}
