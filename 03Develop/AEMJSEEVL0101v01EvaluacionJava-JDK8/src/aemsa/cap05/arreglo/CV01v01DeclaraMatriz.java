
package aemsa.cap05.arreglo;

public class CV01v01DeclaraMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // 1.0 Declarando un vector
        String[] oaCategoria = new String[4];
        
        oaCategoria[0] = "DEPVEF";
        oaCategoria[1] = "IDEPV";
        
        
        //Declarando una matriz
        String[][] oaTipoPrestamo = new String[10][10];
        
        oaTipoPrestamo[0][0] = "NORMAL";
        oaTipoPrestamo[0][1] = "10";
        
        oaTipoPrestamo[0][0] = "REFINANCIAMIENTO";
        oaTipoPrestamo[0][1] = "30";
        
    }
}
