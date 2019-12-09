
package aemsa.cap05.arreglo;

import java.util.Arrays;


public class CV03v01FuncionesEnArreglos {

    public static void main(String[] args) {
        int oaPares[]={2,4,6,8};
        int oaImpares[]={1,3,5,7,9};
        
        mostrarVector(oaPares);
        System.out.println("Promedio pares = " + media(oaPares));
        
        mostrarVector(oaImpares);
        System.out.println("Promedio impares = " + media(oaImpares));
    }
    
    static float media(int poDatos[]){
        float media = 0;
        try{
            for(int i=0;i<poDatos.length-1;i++){
                media += poDatos[i];
            }
        }catch(Exception ex){
            System.out.println(ex.toString());
        }
        
        return media / poDatos.length;
    }
    
    static void mostrarVector(int poDatos[]){
        try{
            for(int i=0;i<poDatos.length;i++){
                System.out.println(poDatos[i]);
            }
            
        }catch(Exception ex){
            ex.getMessage();
        }
    }
    
    static int[] leerVector(int pTamano){
        int oaNumeros[] = {0,1,2,3,4,5,6,7,8,9};
        
        int oaVector[] = new int[pTamano];
        try{
            for (int i=0; i< pTamano; i++){
                oaVector[i]=oaNumeros[i];
            }
        }catch(Exception ex){
            ex.getMessage();
        }
        return oaVector;            
    }
    
    void funcionesArreglos(int[] poaNumeros, int[] poaVector){
        int[] oaDatos = new int[poaNumeros.length];
        
        try{
            
            System.arraycopy(poaNumeros, 1, oaDatos, 0, poaNumeros.length);
            
            Arrays.sort(oaDatos);
            
            // Compara dos vectores
            Arrays.equals(oaDatos,poaVector);
            
            //Rellena con 78
            Arrays.fill(oaDatos, 78);
            // Devuelve una cadena
            Arrays.toString(oaDatos);
            // Buscar en arreglo
            Arrays.binarySearch(oaDatos, 5);
            
            
            
        }catch(Exception ex){
            ex.toString();
        }
    }
}
