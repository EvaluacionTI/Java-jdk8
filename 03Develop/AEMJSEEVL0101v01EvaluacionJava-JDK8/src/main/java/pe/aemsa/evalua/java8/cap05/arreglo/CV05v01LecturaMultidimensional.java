package aemsa.cap05.arreglo;

/////////////////////////////////////////////////////////////////
// Aplicaci�n para trabajar con CMatriz
//
public class CV05v01LecturaMultidimensional
{
  public static void main(String[] args)
  {
    final int A = 5;
    final int B = 10;
    int i, j, conta = 1;
    CO05v01MatrizMultidimensional m = new CO05v01MatrizMultidimensional( A, B ); // matriz de 2 dimensiones (A*B)

    // Asignar datos a la matriz m
    for ( i = 0; i < A; i++ )
      for ( j = 0; j < B; j++ )
        m.asignarDato(conta++, i, j );

    // Visualizar la matriz m
    for ( i = 0; i < A; i++ )
    {
      for ( j = 0; j < B; j++ )
        System.out.print(m.obtenerDato( i, j ) + " ");
      System.out.println();
    }
  }
}
