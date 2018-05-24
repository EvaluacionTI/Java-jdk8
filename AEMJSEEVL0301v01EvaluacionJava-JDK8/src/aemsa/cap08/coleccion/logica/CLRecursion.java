package aemsa.cap08.coleccion.logica;

import aemsa.cap08.coleccion.entidad.CEDatoNumerico;


/////////////////////////////////////////////////////////////////
// Recursividad
//
public class CLRecursion
{
  // Metodo recursivo de Ackerman:
  //   A(0,n) = n+1
  //   A(m,0) = A(m-1,1)               (m > 0)
  //   A(m,n) = A(m-1,A(m,n-1))        (m,n > 0)
  public static int Ackerman(int m, int n)
  {
    if (m == 0)
      return n+1;
    else if (n == 0)
      return Ackerman(m-1, 1);
    else
      return Ackerman(m-1, Ackerman(m,n-1));
  }
  
  public static int AckermanNR(int m, int n)
  {
    CLPila pila = new CLPila(); // pila de elementos (m,n)
    CEDatoNumerico dato;
    int Ackerman_m_n = 0;
    pila.meterEnPila(new CEDatoNumerico(m, n));
    while (true)
    {
      // Tomar los datos de la cima de la pila
      dato = (CEDatoNumerico)pila.sacarDePila();
      m = dato.obtenerSup();
      n = dato.obtenerInf();
      if (m == 0) // Ackerman(0,n) = n+1
      {
        Ackerman_m_n = n+1;
        if (pila.tamano() != 0)
        {
          // Sacar m y n de la pila
          dato = (CEDatoNumerico)pila.sacarDePila();
          m = dato.obtenerSup();
          n = dato.obtenerInf();
          // Meter m y Ackerman_m_n en la pila
          pila.meterEnPila(new CEDatoNumerico(m, Ackerman_m_n));
        }
        else
          return Ackerman_m_n;
      }
      else if (n == 0) // Ackerman(m-1,1)
        // Meter m-1 y 1 en la pila
        pila.meterEnPila(new CEDatoNumerico(m-1, 1));
      else // Ackerman(m-1,Ackerman(m,n-1))
      {
        // Meter m-1 y Ackerman_m_n en la pila
        pila.meterEnPila(new CEDatoNumerico(m-1, Ackerman_m_n)); // n=Ackerman(m,n-1)
        // Meter m y n-1 en la pila
        pila.meterEnPila(new CEDatoNumerico(m, n-1));
      }
    }
  }
}
/////////////////////////////////////////////////////////////////
