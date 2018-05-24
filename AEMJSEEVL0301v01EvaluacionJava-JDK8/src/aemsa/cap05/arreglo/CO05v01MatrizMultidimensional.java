package aemsa.cap05.arreglo;

//////////////////////////////////////////////////////////////////
// Matriz multidimensional basada en una unidimensional
//
public class CO05v01MatrizMultidimensional
{
  private double[] matriz;   // matriz unidimensional
  private int nDims;         // n�mero de dimensiones
  private int[] dimsMatriz;  // valor de cada dimensi�n
  
  private void construir( int[] dim )
  {
    int i;

    for ( i = 0; i < dim.length; i++ )
      if ( dim[i] < 1 )
      {
        System.out.println("Dimensi�n nula o negativa");
        System.exit(-1);
      }
    // Establecer los atributos
    dimsMatriz = new int[dim.length];
    for ( i = 0; i < dim.length; i++ ) dimsMatriz[i] = dim[i];
    nDims = dim.length;
    matriz = new double[totalElementos()];
  }

  public CO05v01MatrizMultidimensional() // constructor
  {
    int dim[] = { 10 }; // dimensi�n por omisi�n
    construir( dim );
  }

  public CO05v01MatrizMultidimensional( int d1 ) // constructor
  {
    int dim[] = { d1 }; // una dimensi�n
    construir( dim );
  }

  public CO05v01MatrizMultidimensional( int d1, int d2 ) // constructor
  {
    int dim[] = { d1, d2 }; // dos dimensiones
    construir( dim );
  }

  public CO05v01MatrizMultidimensional( int d1, int d2, int d3 ) // constructor
  {
    int dim[] = { d1, d2, d3 }; // tres dimensiones
    construir( dim );
  }

  public int totalElementos()
  {
    int i;
    int nTElementos = 1;
    // Calcular el n�mero total de elementos de la matriz
    for ( i = 0; i < nDims; i++ )
      nTElementos *= dimsMatriz[i];

    return nTElementos;
  }

  public int desplazamiento( int[] subind )
  {
    int i;
    int desplazamiento = 0;

    for ( i = 0; i < nDims; i++ )
    {
      // Verificar si los sub�ndices est�n dentro del rango
      if ( subind[i] < 0 || subind[i] > dimsMatriz[i] )
      {
        System.out.println("Sub�ndice fuera de rango");
        return -1;
      }
      // Desplazamiento equivalente en la matriz unidimensional
      desplazamiento += subind[i];
      if ( i+1 < nDims )
        desplazamiento *= dimsMatriz[i+1];
    }
    return desplazamiento;
  }

  public void asignarDato( int dato, int i1 )
  {
    asignarDato(dato, i1, 0, 0);
  }
  
  public void asignarDato( int dato, int i1, int i2 )
  {
    asignarDato(dato, i1, i2, 0);
  }
  
  public void asignarDato( int dato, int i1, int i2, int i3 )
  {
    // Asignar un valor al elemento especificado de la matriz
    int subind[] = { i1, i2, i3 };
    int i = desplazamiento( subind );
    if ( i == -1 ) System.exit(-1); // sub�ndice fuera de rango
    matriz[i] = dato;
  }

  public double obtenerDato( int i1 )
  {
    return obtenerDato( i1, 0, 0);
  }
  
  public double obtenerDato( int i1, int i2 )
  {
    return obtenerDato( i1, i2, 0);
  }
  
  public double obtenerDato( int i1, int i2, int i3 )
  {
    // Obtener el valor al elemento especificado de la matriz
    int subind[] = { i1, i2, i3 };
    int i = desplazamiento( subind );
    if ( i == -1 ) System.exit(-1); // sub�ndice fuera de rango
    return matriz[i];
  }
}
//////////////////////////////////////////////////////////////////
