package aemsa.cap02.operador;

public class CV05v01OperadorIncremental {

    public static void main(String[] args) {

        // 1.0 Declaracion e inicializacion
        int mValorIncremento = 1;
        int mValorDecremento = 2;

        // 2.0 Operaciones
        mValorIncremento ++;  //Incremente de uno en uno
        // mValorIncremento = mValorIncremento + 1
        mValorDecremento --; // Disminuye de uno en uno
        // mValorDecremento = mValorDecremento - 1
        
        // 3.0 Resultado
        System.out.println("Incremento ++ " +mValorIncremento );
        System.out.println("Decremento -- " +mValorDecremento );
        
          // 4.0 Operaciones
        ++mValorIncremento;
        --mValorDecremento ;
        
        // 5.0 Resultado
        System.out.println(" ++ Incremento " +mValorIncremento );
        System.out.println("-- Decremento " +mValorDecremento );
        
    }
}
