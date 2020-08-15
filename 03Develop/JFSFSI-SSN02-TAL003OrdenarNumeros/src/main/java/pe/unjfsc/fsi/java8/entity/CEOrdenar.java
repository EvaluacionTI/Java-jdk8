package pe.unjfsc.fsi.java8.entity;

public class CEOrdenar {
      private int mayor;
      private int medio;
      private int menor;
      
    public int getMayor() {
        return mayor;
    }

    public void setMayor(int mayor) {
        this.mayor = mayor;
    }

    public int getMedio() {
        return medio;
    }

    public void setMedio(int medio) {
        this.medio = medio;
    }

    public int getMenor() {
        return menor;
    }

    public void setMenor(int menor) {
        this.menor = menor;
    }

    @Override
    public String toString() {
        return "CEOrdenar{" + "mayor=" + mayor + ", medio=" + medio + ", menor=" + menor + '}';
    }

}
