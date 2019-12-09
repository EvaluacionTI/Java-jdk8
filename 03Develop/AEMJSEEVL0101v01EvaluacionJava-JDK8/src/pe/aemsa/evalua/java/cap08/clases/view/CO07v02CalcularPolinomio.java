package pe.aemsa.evalua.java.cap08.clases.view;

//////////////////////////////////////////////////////////////////
// Clase CO07v02CalcularPolinomio. Un objeto CO07v02CalcularPolinomio consta de uno o m�s
//                   objetos CO07v01TerminoPolinomio.
//
public class CO07v02CalcularPolinomio {

    private CO07v01TerminoPolinomio[] terminos; // matriz de objetos
    private int nElementos; // n�mero de elementos de la matriz

    public CO07v02CalcularPolinomio() {
        // Crear una matriz vac�a
        nElementos = 0;
        terminos = new CO07v01TerminoPolinomio[nElementos];
    }

    private void unElementoMas(CO07v01TerminoPolinomio[] terminosAct) {
        nElementos = terminosAct.length;
        // Crear una matriz con un elemento m�s
        terminos = new CO07v01TerminoPolinomio[nElementos + 1];
        // Copiar los t�rminos que hay actualmente
        for (int i = 0; i < nElementos; i++) {
            terminos[i] = terminosAct[i];
        }
        nElementos++;
    }

    private void unElementoMenos(CO07v01TerminoPolinomio[] terminosAct) {
        if (terminosAct.length == 0) {
            return;
        }
        int k = 0;
        nElementos = terminosAct.length;
        // Crear una matriz con un elementos menos
        terminos = new CO07v01TerminoPolinomio[nElementos - 1];
        // Copiar los t�rminos no nulos que hay actualmente
        for (int i = 0; i < nElementos; i++) {
            if (terminosAct[i] != null) {
                terminos[k++] = terminosAct[i];
            }
        }
        nElementos--;
    }

    public void insertarTermino(CO07v01TerminoPolinomio obj) {
        // Insertar un nuevo t�rmino en orden ascendente del
        // exponente de x; y a igual exponente de x, en orden
        // ascendente del exponente de y.
        if (obj.obtenerCoeficiente() == 0) {
            return;
        }
        int k = 10, i;
        int expX = obj.obtenerExponenteDeX();
        int expY = obj.obtenerExponenteDeY();

        // Si el t�rmino en xy existe, sumar los coeficientes
        for (i = nElementos - 1; i >= 0; i--) {
            if (expX == terminos[i].obtenerExponenteDeX()
                    && expY == terminos[i].obtenerExponenteDeY()) {
                double coef = terminos[i].obtenerCoeficiente()
                        + obj.obtenerCoeficiente();
                if (coef != 0) {
                    terminos[i].asignarCoeficiente(coef);
                } else {
                    eliminarTermino(i);
                }
                return;
            }
        }

        // Si el t�rmino en xy no existe, insertarlo.
        while (Math.abs(expX) > k || Math.abs(expY) > k) {
            k = k * 10;
        }
        // Se a�ade un elemento vac�o
        unElementoMas(terminos);
        i = nElementos - 2; // i = nElementos - 1 vale null
        while (i >= 0 && (expX * k + expY
                < terminos[i].obtenerExponenteDeX() * k
                + terminos[i].obtenerExponenteDeY())) {
            terminos[i + 1] = terminos[i];
            i--;
        }
        terminos[i + 1] = obj;
    }

    public boolean eliminarTermino(int i) {
        // Eliminar el objeto que est� en la posici�n i
        if (i >= 0 && i < nElementos) {
            terminos[i] = null; // enviar el objeto a la basura
            unElementoMenos(terminos);
            return true;
        }
        return false;
    }

    public CO07v01TerminoPolinomio terminoEn(int i) {
        // Devolver la referencia al objeto i de la matriz
        if (i >= 0 && i < nElementos) {
            return terminos[i];
        } else {
            System.out.println("�ndice fuera de l�mites");
            return null;
        }
    }

    public int longitud() {
        return nElementos;
    }

    public CO07v02CalcularPolinomio copiar(CO07v02CalcularPolinomio p) // asignaci�n
    {
        // Copiar el origen en el nuevo destino
        nElementos = p.nElementos;
        terminos = new CO07v01TerminoPolinomio[nElementos];
        for (int i = 0; i < nElementos; i++) {
            terminos[i] = new CO07v01TerminoPolinomio(p.terminos[i]);
        }

        return this;
    }

    public CO07v02CalcularPolinomio sumar(CO07v02CalcularPolinomio pB) {
        // pR = pA.sumar(pB). pA es this y pR el resultado.
        int ipa = 0, ipb = 0, k = 0;
        int na = nElementos, nb = pB.nElementos;
        double coefA, coefB;
        int expXA, expYA, expXB, expYB;
        CO07v02CalcularPolinomio pR = new CO07v02CalcularPolinomio(); // polinomio resultante

        // Sumar pA con pB
        while (ipa < na && ipb < nb) {
            coefA = terminos[ipa].obtenerCoeficiente();
            expXA = terminos[ipa].obtenerExponenteDeX();
            expYA = terminos[ipa].obtenerExponenteDeY();
            coefB = pB.terminos[ipb].obtenerCoeficiente();
            expXB = pB.terminos[ipb].obtenerExponenteDeX();
            expYB = pB.terminos[ipb].obtenerExponenteDeY();
            k = 10;
            while (Math.abs(expXA) > k || Math.abs(expYA) > k) {
                k = k * 10;
            }

            if (expXA == expXB && expYA == expYB) {
                pR.insertarTermino(new CO07v01TerminoPolinomio(coefA + coefB, expXA, expYA));
                ipa++;
                ipb++;
            } else if (expXA * k + expYA < expXB * k + expYB) {
                pR.insertarTermino(new CO07v01TerminoPolinomio(coefA, expXA, expYA));
                ipa++;
            } else {
                pR.insertarTermino(new CO07v01TerminoPolinomio(coefB, expXB, expYB));
                ipb++;
            }
        }

        // T�rminos restantes en el pA
        while (ipa < na) {
            coefA = terminos[ipa].obtenerCoeficiente();
            expXA = terminos[ipa].obtenerExponenteDeX();
            expYA = terminos[ipa].obtenerExponenteDeY();
            pR.insertarTermino(new CO07v01TerminoPolinomio(coefA, expXA, expYA));
            ipa++;
        }
        // T�rminos restantes en el pB
        while (ipb < nb) {
            coefB = pB.terminos[ipb].obtenerCoeficiente();
            expXB = pB.terminos[ipb].obtenerExponenteDeX();
            expYB = pB.terminos[ipb].obtenerExponenteDeY();
            pR.insertarTermino(new CO07v01TerminoPolinomio(coefB, expXB, expYB));
            ipb++;
        }
        // Quitar los t�rminos con coeficiente 0
        k = 0;
        while (k < pR.nElementos) {
            if (pR.terminos[k].obtenerCoeficiente() == 0) {
                pR.eliminarTermino(k);
                pR.nElementos--;
            } else {
                k++;
            }
        }
        return pR;
    }

    public void mostrarPolinomio() {
        int i = nElementos;

        while (i-- != 0) {
            terminos[i].mostrarTermino();
        }
    }

    public double valorPolonomio(double x, double y) {
        double v = 0;
        for (int i = 0; i < nElementos; i++) {
            v += terminos[i].obtenerCoeficiente()
                    * Math.pow(x, terminos[i].obtenerExponenteDeX())
                    * Math.pow(y, terminos[i].obtenerExponenteDeY());
        }
        return v;
    }
}
//////////////////////////////////////////////////////////////////
