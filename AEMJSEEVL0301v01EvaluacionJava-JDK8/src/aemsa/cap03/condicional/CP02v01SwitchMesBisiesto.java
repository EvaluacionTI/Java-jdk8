/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aemsa.cap03.condicional;

/**
 *
 * @author AEMSA
 */
public class CP02v01SwitchMesBisiesto {

    public static void main(String[] args) {
             int dias=5, mes=1, aaaa=2002;

       switch(mes){
           case 1:
           case 3:
           case 5:
           case 7:
           case 8:
           case 10:
           case 12:
               dias=31;
               break;
           case 4:
           case 6:
           case 9:
           case 11:
               dias = 30;
               break;
           case 2:
               //Es ano bisiesto
               if (((aaaa%4)==0) && (aaaa%100 !=0) || (aaaa%400)==0)
                   dias = 29;
               else
                   dias = 28;
               break;
           default:

       }

       if (mes >= 1 && mes <=12)
           System.out.println("\n El mes " + mes + " del ano " + aaaa +
                   "tiene " + dias + " dias ");
    }

}
