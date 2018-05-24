package aemsa.cap06.funcion.fecha;

/////////////////////////////////////////////////////////////////

import aemsa.cap06.funcion.fecha.CO02v02FuncionFecha;
import aemsa.cap12.flujos.entidad.CO04v01FlujoTipoDato;

// Aplicaci�n que utiliza la clase CFecha
//
public class CV02v02FuncionFecha
{
  // Visualizar una fecha
  public static void visualizarFecha(CO02v02FuncionFecha fecha)
  {
    int[] f = new int[3];
    
    fecha.obtenerFecha(f);
    System.out.println(f[0] + "/" + f[1] + "/" + f[2]);
  }
  
  // Establecer una fecha, verificarla y visualizarla
  public static void main(String[] args)
          
  {
    CO02v02FuncionFecha fecha = new CO02v02FuncionFecha(); // objeto de tipo CFecha
    int dia, mes, ano;

    do
    {
      System.out.print("dia, ##   :  ");  dia = CO04v01FlujoTipoDato.datoInt();
      System.out.print("mes, ##   :  ");  mes = CO04v01FlujoTipoDato.datoInt();
      System.out.print("ano, #### :  ");  ano = CO04v01FlujoTipoDato.datoInt();
      fecha.asignarFecha(dia, mes, ano);
    }
    while (!fecha.fechaCorrecta());

    visualizarFecha( fecha );
  }
}
