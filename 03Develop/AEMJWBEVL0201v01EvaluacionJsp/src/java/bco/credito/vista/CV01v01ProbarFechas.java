/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bco.credito.vista;

import bco.credito.entidad.CEv0CronogramaCuotaFija;
import bco.credito.logica.CLv0Financiero;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author background21
 */
public class CV01v01ProbarFechas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
         Date oFecha = new Date();
         SimpleDateFormat oFormatoFecha = new SimpleDateFormat("dd/MM/yyyy");
         System.out.print(oFormatoFecha.format(oFecha));

         GregorianCalendar gcg = new GregorianCalendar();

         gcg.add(GregorianCalendar.DATE, 30);
         System.out.println(oFormatoFecha.format(gcg.getTime()));

         String lStrFecha = "12/06/2012";*/

        try {/*
             Date mifecha = oFormatoFecha.parse(lStrFecha);
             System.out.println(oFormatoFecha.format(mifecha));

             GregorianCalendar gc = new GregorianCalendar();
             gc.setGregorianChange(mifecha);

             gc.add(GregorianCalendar.DATE, 30);
             System.out.println(oFormatoFecha.format(gc.getTime()));
             gc.setGregorianChange(mifecha);
            
             lStrFecha = "31/12/2012";
             System.out.println(lStrFecha );
             mifecha = oFormatoFecha.parse(lStrFecha);
             gc.setGregorianChange(mifecha);
             System.out.println(oFormatoFecha.format(mifecha ));
            
             CLv0Financiero oCLFinanciero = new CLv0Financiero();*/

            String fecha = "31/12/2012";
            SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            Date myfecha = df.parse(fecha);
            System.out.println(df.format(myfecha));
            
            
            CLv0Financiero oCLFinanciero = new CLv0Financiero();
            Date respuesta = oCLFinanciero.fechaInicioPagoCuotaFija(myfecha, 30, 2);

            System.out.println(df.format(respuesta));
        

        } catch (Exception ex) {
        }

    }
}
