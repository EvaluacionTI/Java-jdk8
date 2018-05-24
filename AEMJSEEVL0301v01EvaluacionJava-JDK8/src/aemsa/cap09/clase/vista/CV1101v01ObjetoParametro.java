
package aemsa.cap09.clase.vista;

class Evaluar{
    int a, b;

    Evaluar(int i, int j){
        this.a=i;
        this.b=j;
    }

    // Devuelve el valor verdadero si "o" es igual al objeto que la al metodo
    boolean equals(Evaluar o){
        if (o.a == a && o.b==b) return true;
        else return false;
    }
}

public class CV1101v01ObjetoParametro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Evaluar oObjeto1 = new Evaluar(100,22);
        Evaluar oObjeto2 = new Evaluar(100,22);
        Evaluar oObjeto3 = new Evaluar(-1,-1);

        System.out.println("Objeto1 == Objeto2: " + oObjeto1.equals(oObjeto2));

        System.out.println("Objeto1 == Objeto3: " + oObjeto1.equals(oObjeto3));
    }

}
