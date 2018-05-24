/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aemsa.cap09.clase.logica;

public class CL0502Pila {
    int oPila[] = new int[10];
    int lIntPosicion;

    public CL0502Pila(){
        lIntPosicion = 1;
    }

    public void Poner(int pItem){
        if (lIntPosicion == 9)
            System.out.println("Pila llena" );
        else
            oPila[++lIntPosicion] = pItem;

    }

    public int Retira(){
        if (lIntPosicion < 0){
            System.out.println("Pila llena");
            return 0;
        }else return oPila[lIntPosicion--];
    }
}
