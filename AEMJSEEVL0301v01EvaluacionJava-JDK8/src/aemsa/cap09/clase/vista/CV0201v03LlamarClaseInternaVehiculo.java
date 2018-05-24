
package aemsa.cap09.clase.vista;

class Auto{
    String marca;
    String modelo;
    String color;

    void m01_EncederMotor(){
        System.out.println("Auto Encendido ");
        System.out.println(marca);
        System.out.println(modelo);
        System.out.println(color);
    }

    void m02_CambiarVelocidad(){
        System.out.println("Auto ha cambiado de velocidad ");
    }

    void m03_Acelerar(){
        System.out.println("Se está acelerando ");
    }

    void m04_Frenar(){
        System.out.println("Se está frenando para pagar peaje ");
    }

    void m05_PararMotor(){
        System.out.println("Se ha detenido el auto para una revisión ");
    }
}

public class CV0201v03LlamarClaseInternaVehiculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Auto oAuto = new Auto();

        oAuto.marca="Hyundai";
        oAuto.modelo="Accent Gls";
        oAuto.color = "Verde Opalo";

        oAuto.m01_EncederMotor();
        oAuto.m02_CambiarVelocidad();
        oAuto.m03_Acelerar();
        oAuto.m04_Frenar();
        oAuto.m05_PararMotor();
    }

}
