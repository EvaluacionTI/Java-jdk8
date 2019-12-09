package aemsa.cap06.funcion;

/////////////////////////////////////////////////////////////////
// Aplicaci�n para trabajar con n�meros racionales
//
public class CV04v01LeerNumeroRacional
{
  public static void main(String[] args)
  {
    CO04v01FuncionAbs r1 = new CO04v01FuncionAbs(1);
    CO04v01FuncionAbs r2 = new CO04v01FuncionAbs(1, 4);
    CO04v01FuncionAbs r3;
    r3 = r1.sumar(r2);
    System.out.println(r3.toString()); // 5/4
    
    long n = 2;
    r3 = new CO04v01FuncionAbs(n).sumar(r2);
    System.out.println(r3.toString()); // 9/4
    
    CO04v01FuncionAbs r4 = new CO04v01FuncionAbs(r2);
    r3.copiar(r2);
    if (r3.equals(r2)) r1 = r3.sumar(r4);
    System.out.println(r1.toString()); // 1/2
    
    CO04v01FuncionAbs r5, r6, r7;
    r5 = CO04v01FuncionAbs.leer();
    r6 = CO04v01FuncionAbs.leer();
    r7 = r5.restar(r6);
    if (r7.esCero())
      System.out.println("racional cero");
    else
      System.out.println(r7.toString());
    
    r2.copiar(r1.incrementar());
    System.out.println(r1.toString()); // 3/2
    System.out.println(r2.toString()); // 3/2
    r2.decrementar();
    System.out.println(r2.toString()); // 1/2
    
    r2.copiar(r1.cambiadoDeSigno());
    System.out.println(r1.toString()); // 3/2
    System.out.println(r2.toString()); // -3/2
  }
}
