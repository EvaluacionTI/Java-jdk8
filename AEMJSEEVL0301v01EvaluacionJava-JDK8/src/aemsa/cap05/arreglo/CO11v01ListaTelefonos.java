package aemsa.cap05.arreglo;

/////////////////////////////////////////////////////////////////

import aemsa.mysql.dba.entidad.CEPersona;

//
public class CO11v01ListaTelefonos {

    private CEPersona[] listaTelefonos; // matriz de objetos
    private int nElementos; // n�mero de elementos de la matriz

    public CO11v01ListaTelefonos() {
        // Crear una lista vac�a
        nElementos = 0;
        listaTelefonos = new CEPersona[nElementos];
    }

    private void unElementoMas(CEPersona[] listaActual) {
        nElementos = listaActual.length;
        listaTelefonos = new CEPersona[nElementos + 1];
        // Copiar la lista actual
        for (int i = 0; i < nElementos; i++) {
            listaTelefonos[i] = listaActual[i];
        }
        nElementos++;
    }

    private void unElementoMenos(CEPersona[] listaActual) {
        if (listaActual.length == 0) {
            return;
        }
        int k = 0;
        nElementos = listaActual.length;
        listaTelefonos = new CEPersona[nElementos - 1];
        // Copiar la lista actual
        for (int i = 0; i < nElementos; i++) {
            if (listaActual[i] != null) {
                listaTelefonos[k++] = listaActual[i];
            }
        }
        nElementos--;
    }

    public void ponerValorEn(int i, CEPersona objeto) {
        if (i >= 0 && i < nElementos) {
            listaTelefonos[i] = objeto;
        } else {
            System.out.println("�ndice fuera de l�mites");
        }
    }

    public CEPersona valorEn(int i) {
        if (i >= 0 && i < nElementos) {
            return listaTelefonos[i];
        } else {
            System.out.println("�ndice fuera de l�mites");
            return null;
        }
    }

    public int longitud() {
        return nElementos;
    }

    public void anadir(CEPersona obj) {
        unElementoMas(listaTelefonos);
        ponerValorEn(nElementos - 1, obj);
    }

    public boolean eliminar(long tel) {
        // Buscar el tel�fono y eliminar registro
        for (int i = 0; i < nElementos; i++) {
            if (listaTelefonos[i].obtenerTelefono() == tel) {
                listaTelefonos[i] = null;
                unElementoMenos(listaTelefonos);
                return true;
            }
        }
        return false;
    }

    public int buscar(String str, int pos) {
        String nom;
        if (str == null) {
            return -1;
        }
        if (pos < 0) {
            pos = 0;
        }
        for (int i = pos; i < nElementos; i++) {
            nom = listaTelefonos[i].obtenerNombre();
            if (nom == null) {
                continue;
            }
            // �str est� contenida en nom?
            if (nom.indexOf(str) > -1) {
                return i;
            }
        }
        return -1;
    }
}
