package aemsa.cap06.funcion;


import aemsa.cap12.flujos.entidad.CO04v01FlujoTipoDato;

/////////////////////////////////////////////////////////////////
// Clase para operar con n�meros racionales (utiliza la clase Leer)
//
public class CO04v01FuncionAbs
{
  // Atributos
  private long numerador;
  private long denominador;
  
  // M�todos
  protected CO04v01FuncionAbs Simplificar()
  {
    // M�ximo com�n divisor
    long mcd, temp, resto;
    mcd = Math.abs( numerador );
    temp = Math.abs( denominador );
    while ( temp > 0 )
    {
      resto = mcd % temp;
      mcd = temp;
      temp = resto;
    }
    // Simplificar
    if ( mcd > 1 )
    {
      numerador /= mcd;
      denominador /= mcd;
    }
    return this;
  }

  public CO04v01FuncionAbs() // constructor
  {
    numerador = 0;
    denominador = 1;
  }

  public CO04v01FuncionAbs( long num ) // constructor
  {
    numerador = num;
    denominador = 1;
  }

  public CO04v01FuncionAbs( long num, long den ) // constructor
  {
    numerador = num;
    denominador = den;
    if ( denominador == 0 )
    {
      System.out.println("Error: denominador 0. Se asigna 1.");
      denominador = 1;
    }
    if ( denominador < 0 )
    {
      numerador = -numerador;
      denominador = -denominador;
    }
    Simplificar();
  }
  
  public CO04v01FuncionAbs( CO04v01FuncionAbs r ) // constructor copia
  {
     numerador = r.numerador;
     denominador = r.denominador;
  }

  // Sumar n�meros racionales
  public CO04v01FuncionAbs sumar( CO04v01FuncionAbs r )
  {
    return new CO04v01FuncionAbs(numerador * r.denominador +
                         denominador * r.numerador,
                         denominador * r.denominador );
  }
  
  // Restar n�meros racionales
  public CO04v01FuncionAbs restar( CO04v01FuncionAbs r )
  {
    return new CO04v01FuncionAbs(numerador * r.denominador -
                         denominador * r.numerador,
                         denominador * r.denominador );
  }
  
  // Multiplicar n�meros racionales
  public CO04v01FuncionAbs multiplicar( CO04v01FuncionAbs r )
  {
    return new CO04v01FuncionAbs(numerador * r.numerador,
                         denominador * r.denominador );
  }
  
  // Dividir n�meros racionales
  public CO04v01FuncionAbs dividir( CO04v01FuncionAbs r )
  {
    return new CO04v01FuncionAbs(numerador * r.denominador,
                         denominador * r.numerador );
  }
  
  // Verificar si dos n�meros racionales son iguales
  public boolean equals( CO04v01FuncionAbs r )
  {
    return ( numerador * r.denominador ==
             denominador * r.numerador );
  }

  // Verificar si un racional es menor que otro
  public boolean menor( CO04v01FuncionAbs r )
  {
    return ( numerador * r.denominador <
             denominador * r.numerador );
  }

  // Verificar si un racional es mayor que otro
  public boolean mayor( CO04v01FuncionAbs r )
  {
    return ( numerador * r.denominador >
             denominador * r.numerador );
  }

  // Devolver un n�mero racional como cadena
  public String toString()
  {
    return new String(numerador + "/" + denominador);
  }

  // Establecer un n�mero racional
  public static CO04v01FuncionAbs leer()
  {
    long num, den;
    int i, barras;
    boolean caracterValido;
    String racional;

    do
    {
      barras = 0;
      System.out.print("[-]entero[/entero]: ");
      racional = CO04v01FlujoTipoDato.dato(); // leer el racional
      if (racional.length() == 0)
         caracterValido = false;
      else
      {
        // El primer car�cter puede ser un d�gito o el signo menos
        caracterValido =
          (racional.charAt(0) >= '0' && racional.charAt(0) <= '9') ||
          (racional.charAt(0) == '-' && racional.length() > 1);
        // El �ltimo car�cter no puede ser una /
        if (racional.charAt(racional.length()-1) == '/')
          caracterValido = false;
      }
      // El resto de los caracteres pueden ser d�gitos o / (s�lo una)
      for (i = 1; caracterValido && i < racional.length(); i++)
      {
        caracterValido = racional.charAt(i) >= '0' &&
                         racional.charAt(i) <= '9' ||
                         racional.charAt(i) == '/';
        if (racional.charAt(i) == '/') barras++;
        if (barras > 1) caracterValido = false;
      }
      if (!caracterValido) System.out.println("Entrada no v�lida.");
    }
    while (!caracterValido);
    // Extraer el numerador y el denominador
    if ((i = racional.indexOf('/')) == -1) // no hay denominador
    {
      num = Long.parseLong(racional);
      den = 1;
    }
    else
    {
      num = Long.parseLong(racional.substring(0, i)); // 0 a i-1
      den = Long.parseLong(racional.substring(i+1));
    }
    // Construir y devolver el objeto CRacional
    return new CO04v01FuncionAbs(num, den);
  }

  // Copiar un racional en otro
  public CO04v01FuncionAbs copiar( CO04v01FuncionAbs r )
  {
     numerador = r.numerador;
     denominador = r.denominador;
     return this;
  }

  // Verificar si es 0
  public boolean esCero()
  {
    return numerador == 0;
  }
  
  // Incrementar en 1
  public CO04v01FuncionAbs incrementar()
  {
    numerador += denominador;
    return this;
  }
  
  // Decrementar en 1
  public CO04v01FuncionAbs decrementar()
  {
    numerador -= denominador;
    return this;
  }

  // - unario
  public CO04v01FuncionAbs cambiadoDeSigno()
  {
    CO04v01FuncionAbs temp = new CO04v01FuncionAbs( -numerador, denominador );
    return temp;
  }
}
