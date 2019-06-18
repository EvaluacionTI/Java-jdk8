package pe.aemsa.evalua.java.cap08.clases.view;

public class CV1502v02Ecuacion3erGrado
{
  public static void main(String[] args)
  {
    CEcuacion oEcuacion = new CEcuacion();
    oEcuacion.Ecuacion(1, -3.2, 0, 7);
    
    double r = oEcuacion.ValorPara(1);
    System.out.println(r);
    
    r = oEcuacion.ValorPara(1.5);
    System.out.println(r);
  }
}
class CEcuacion
{
  // El t�rmino de mayor grado tiene exponente 3 fijo
  double mDblc3, mDblc2, mDblc1, mDblc0; // coeficientes

  public void Ecuacion(double a, double b, double c, double d)
  {
    mDblc3 = a; mDblc2 = b; mDblc1 = c; mDblc0 = d;
  }
  
  public double ValorPara(double x)
  {
    double resultado;

    resultado = mDblc3*x*x*x + mDblc2*x*x + mDblc1*x + mDblc0;
    return resultado; // devolver el valor calculado
  }
}
