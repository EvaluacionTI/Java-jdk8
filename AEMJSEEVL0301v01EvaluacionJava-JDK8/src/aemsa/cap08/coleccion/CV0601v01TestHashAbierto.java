package aemsa.cap08.coleccion;

//////////////////////////////////////////////////////////////////

import aemsa.cap09.clase.CO06v01LeerTipoDato;
import java.io.IOException;

// Calcular los centros num�ricos entre 1 y n.
//
public class CV0601v01TestHashAbierto
{
  // M�todo de b�squeda binaria
  //
  // cn: centro num�rico
  // (1 a cn-1) cn (cn+1 a mitad)
  // suma_grupo1 = suma de los valores desde 1 a cn-1
  // suma_grupo2 = suma de los valores desde cn+1 a mitad
  //
  // El m�todo devuelve como resultado el valor mitad.
  // Si cn no es un centro num�rico devuelve un valor 0.
  //
  public static long busquedaBin(long cn, long n)
  {
    if (cn <= 0 || n <= 0) return 0;
    
    long suma_grupo1 = ((cn-1) * ((cn-1) + 1)) / 2;
    long suma_grupo2 = 0;
    long mitad = 0;
    
    long inf = cn+1; // l�mite inferior del grupo 2
    long sup = n;    // l�mite superior del grupo 2
    
    // B�squeda binaria  
    do
    {
      mitad = (inf + sup) / 2;
      suma_grupo2 = (mitad * (mitad + 1)) / 2 - suma_grupo1 - cn;
      if (suma_grupo1 > suma_grupo2)
        inf = mitad + 1;
      else
        sup = mitad - 1;
    }
    while ( suma_grupo1 != suma_grupo2 && inf <= sup);

    if (suma_grupo2 == suma_grupo1)
      return mitad;
    else
      return 0;
  }

  public static void main(String[] args) throws IOException
  {
    long n;              // centros num�ricos entre 1 y n
    long cn;             // posible centro num�rico
    long lim_sup_grupo2; // l�mite superior del grupo 2
  
    System.out.print("Centros num�ricos entre 1 y ");
    n = CO06v01LeerTipoDato.datoLong();
    System.out.println();
    for (cn = 3; cn < n; cn++)
    {
      lim_sup_grupo2 = busquedaBin(cn, n); 
      if (lim_sup_grupo2 != 0)
        System.out.println(cn + " es centro num�rico de 1 a " +
                           (cn-1) + " y " + (cn+1) + " a " +
                           lim_sup_grupo2);
    }
  }
}
