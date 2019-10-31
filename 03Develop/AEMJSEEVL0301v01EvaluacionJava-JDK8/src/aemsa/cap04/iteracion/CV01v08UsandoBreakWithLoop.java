package aemsa.cap04.iteracion;

public class CV01v08UsandoBreakWithLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int passmark = 2;
        boolean passed =false;
        int[] liScores = {4, 6, 2, 8, 12, 35, 9};

        for (int score : liScores){
            if (score >=12 ){
                passed = true;
                break;
            }
        }
        System.out.println(" At least on passed ? " + passed);
    }
    
}
