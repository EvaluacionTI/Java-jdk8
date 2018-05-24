
package aemsa.cap05.arreglo;

public class CV01v05LongitudMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Declarando un vector
        String[] oaCategoria = new String[4];
        
        oaCategoria[0] = "DEPVEF";
        oaCategoria[1] = "IDEPV";
        
        
        //Declarando una matriz
        String[][] oaTipoPrestamo = new String[10][10];
        
        oaTipoPrestamo[0][0] = "NORMAL";
        oaTipoPrestamo[0][1] = "10";
        
        oaTipoPrestamo[0][0] = "REFINANCIAMIENTO";
        oaTipoPrestamo[0][1] = "30";
        
        System.out.println("Tama�o de vetor = " + oaCategoria.length);
        System.out.println("N�mero de filaes " + oaTipoPrestamo[0].length);
        System.out.println("Numero de Columnas = " + oaTipoPrestamo[0][oaTipoPrestamo.length-1]);
        System.out.println("Tama�p de la matriz = " + oaTipoPrestamo[oaTipoPrestamo.length-1][oaTipoPrestamo.length-1]);
    }
}
