package aemsa.cap09.clase.vista;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class CV1301v01TestNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Definir un flujo de caractes de Entrada

        InputStreamReader oisLectura = new InputStreamReader(System.in);
        BufferedReader oFlujoEntrada = new BufferedReader(oisLectura);

        //Definiir una referencia al flujo estandar de salida

        PrintStream oFlujoSalida = System.out;

        String mStrDato;
        float mFltprecio = 0.0F;

        try{
            oFlujoSalida.print("Precio: ");
            mStrDato = oFlujoEntrada.readLine();

            //El operador ternario (?) y (:) se utiliza para verificar si se llego al final del flujo.
            //Lo que sucede al pulsar ctrl z
            mFltprecio = (mStrDato != null)
                    ? (new Float(mFltprecio)).floatValue()
                    : Float.NaN;

        }catch(Exception ex){
            ex.printStackTrace();
        }
    }

}
