package aemsa.cap05.arreglo;


public class CV01v04MediaVector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int oaMesesDelAno[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
         double lDblPromedio = 0;

         for (int i=0; i<=oaMesesDelAno.length-1;i++)
             lDblPromedio = lDblPromedio + oaMesesDelAno[i];

        System.out.println("Promedio  =" + lDblPromedio /(oaMesesDelAno.length-1));
    }

}
