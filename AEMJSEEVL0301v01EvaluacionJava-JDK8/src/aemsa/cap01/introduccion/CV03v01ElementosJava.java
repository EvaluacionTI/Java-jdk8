package aemsa.cap01.introduccion;

/**
 * La ejecuci�n del programa comienza con el m�todo main().
 * La llamada al constructor de clase no tiene lugar a menos
 * que se cree un objeto del tipo 'Main0401ElementosJava'
 * en el m�todo main().
 */
class CV03v01ElementosJava{
  /**
   * Punto de entrada principal para la aplicaci�n.
   * 
   * Par�metros:
   *   args: Matriz de par�metros pasados a la aplicaci�n
   *         a trav�s de la l�nea de �rdenes.
   */
  final static int cte1 = 1;
  final static String cte2 = "Pulse una tecla para continuar";
  short dia, mes, ano;
  
  void Test()
  {
        final double cte3 = 3.1415926;
        int contador;
        String Nombre = "", Apellidos;
        dia = 20;
        Apellidos = "Ceballos";
        //System.out.println(contador); // error: variable no iniciada
        System.out.println(dia);      // correcto: d�a es igual a 0
  }

  public static void main(String[] args){


      System.out.println("Conversion Implicita");

      byte bDato = 1; short sDato = 0; int iDato = 0; long lDato = 0;
      float fDato = 0; double dDato = 0;
    
      sDato = bDato;
      iDato = sDato;
      lDato = iDato;
      fDato = lDato;
      dDato = fDato + lDato - iDato * sDato / bDato;

      System.out.println(dDato); // resultado: 1.0
    
    System.out.println("Conversion implicita con cast");
    dDato = 2;
    fDato = (float)dDato;
    lDato = (long)fDato;
    iDato = (int)lDato;
    sDato = (short)iDato;
    bDato = (byte)(sDato + iDato - lDato * fDato / dDato);
    System.out.println(bDato); // resultado: 2
    
    float r;
    r = (float)Math.sqrt(10);
    System.out.println(r);
   
    // Operadores aritm�ticos
    int a = 10, b = 3, c;
    float x = 2.0F, y;
    y = x + a;        // El resultado es 12.0 de tipo float
    c = a / b;        // El resultado es 3 de tipo int
    c = a % b;        // El resultado es 1 de tipo int
    y = a / b;        // El resultado es 3 de tipo int. Se
                      // convierte a float para asignarlo a y
    c = (int)(x / y); // El resultado es 0.6666667 de tipo float. Se
                      // convierte a int para asignarlo a c (c = 0)
    System.out.println(x/y);

     //Operadores de relaci�n o de comparaci�n
     System.out.println("Operadores de relacion o comparacion");
    int mIntg = 10, mInth = 0;
    boolean mBlni;
    mBlni = mIntg == mInth; // da como resultado false
    mBlni = mIntg > mInth;  // da como resultado true
    mBlni = mIntg != mInth; // da como resultado true
    System.out.println(mBlni);

     //Operadores l�gicos
    System.out.println("Operadores logicos");
    int mIntp = 10, mIntq = 0;
    boolean mBlnr;

    mBlnr = mIntp != 0 && mIntq != 0;   // da como resultado false
    mBlnr = mIntp != 0 || mIntq > 0;    // da como resultado true
    mBlnr = mIntq < mIntp && mIntp <= 10;   // da como resultado true
    mBlnr = !mBlnr;                 // si r es true, el resultado es false

    System.out.println(mBlnr);

     //Operadores unitarios
    System.out.println("Operadores unitarios");
    int mIntj = 2, mIntk = 0, mIntl = 0;
    mIntl = -mIntj;   // resultado c = -2
    mIntl = ~mIntk;   // resultado c = -1

    System.out.println(mIntl);

     //Operadores a nivel de bits
    System.out.println("Operadores a nivel de bits");
    int mInta = 255, mIntr = 0, mIntm = 32;
    
    mIntr = mInta & 017; // r=15. Pone a cero todos los bits de a
                 // excepto los 4 bits de menor peso.
    mIntr = mIntr | mIntm;   // r=47. Pone a 1 todos los bits de r que
                 // est�n a 1 en m.
    mIntr = mInta & ~07; // r=248. Pone a 0 los 3 bits de menor peso de a.
    mIntr = mInta >> 7;  // r=1. Desplazamiento de 7 bits a la derecha.

    System.out.println(mIntr);


     //Operadores de asignaci�n
    System.out.println("Operadores de asignacion");

    int mIntx = 0, mIntn = 10, mInti = 1;
    mIntx++;         // Incrementa el valor de x en 1.
    ++mIntx;         // Incrementa el valor de x en 1.
    mIntx = --mIntn;     // Decrementa n en 1 y asigna el resultado a x.
    mIntx = mIntn--;     // Asigna el valor de n a x y despu�s
                  //decrementa n en 1.
    mInti += 2;      // Realiza la operaci�n i = i + 2.
    mIntx *= mIntn - 3;  // Realiza la operaci�n mIntx = mIntx * (n-3) y no
                  //mIntx = mIntx * n - 3.
    mIntn >>= 1;     // Realiza la operaci�n n = n >> 1 la cual desplaza
                  //el contenido de n 1 bit a la derecha.
    System.out.println(mInti);
    System.out.println(mIntx);
    System.out.println(mIntn);

     //Operador condicional

    System.out.println("Operador condicional");
    double mDbla = 10.2, mDblb = 20.5, mDblmayor = 0;
    mDblmayor = (mDbla > mDblb) ? mDbla : mDblb;
    System.out.println(mDblmayor);

    // Priopridad y orden de evaluaci�n
    System.out.println("Prioridad y orden de evaluacion");
    int lintx = 0, linty = 0, lintz = 15;
    lintx = linty = lintz;     // resultado x = y = z = 15
    System.out.println("x = " + lintx + ", " + "y = " + linty + ", " + "z = " + lintz);
  }
}
