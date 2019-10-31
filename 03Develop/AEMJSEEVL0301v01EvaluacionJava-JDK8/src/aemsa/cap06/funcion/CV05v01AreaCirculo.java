package aemsa.cap06.funcion;

public class CV05v01AreaCirculo
{
  public static void main(String[] args)
  {
    System.out.println(CO05v01FuncionRadiansRintSenoCoseno.seno[90]);
    System.out.println(CO05v01FuncionRadiansRintSenoCoseno.coseno[90]);

    CO05v01FuncionRadiansRintSenoCoseno obj1 = new CO05v01FuncionRadiansRintSenoCoseno();
    System.out.println(obj1.longCircunferencia());
    System.out.println(obj1.areaCirculo());

    CO05v01FuncionRadiansRintSenoCoseno.cambiarPrecisionPiA(3.14);

    CO05v01FuncionRadiansRintSenoCoseno obj2 = new CO05v01FuncionRadiansRintSenoCoseno(100, 100, 10);
    System.out.println(obj2.longCircunferencia());
    System.out.println(obj2.areaCirculo());

    System.out.println(CO05v01FuncionRadiansRintSenoCoseno.numCirculos);
  }
}

