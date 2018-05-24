package aemsa.cap03.condicional;

import aemsa.cap09.clase.CO06v01LeerTipoDato;

public class CP0604TableroAjedrez {


    public static void main(String[] args) {
        int liFilaAlfil, liColumnaAlfil;
        int liPosicionFila, liPosicionColumna;
        
        try{
            System.out.println("Posición del alfil:");
            System.out.print("  fila    "); liFilaAlfil = CO06v01LeerTipoDato.datoInt();
            System.out.print("  columna "); liColumnaAlfil = CO06v01LeerTipoDato.datoInt();
            System.out.println(); // dejar una línea en blanco
            
            //Dibujar el tablero de ajedrez
            for (liPosicionFila=1;liPosicionFila <= 8; liPosicionFila++){
                for (liPosicionColumna=1;liPosicionColumna<=8; liPosicionColumna++){
                  if ((liPosicionFila + liPosicionColumna == liFilaAlfil + liColumnaAlfil) || (liPosicionFila - liPosicionColumna == liFilaAlfil - liColumnaAlfil))  
                      System.out.print(" * ");
                  else if ((liPosicionFila + liPosicionColumna) % 2 == 0){
                      System.out.print(" B ");
                  }else
                      System.out.print(" N ");
                }
            System.out.println(); // cambiar de fila                
            }
    
        }catch(Exception ex){
            System.out.print(ex);
        }
        
    }
}
