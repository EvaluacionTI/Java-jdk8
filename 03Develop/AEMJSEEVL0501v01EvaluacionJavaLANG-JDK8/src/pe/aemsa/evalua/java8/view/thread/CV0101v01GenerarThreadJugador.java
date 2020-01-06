package pe.aemsa.evalua.java8.view.thread;

import pe.aemsa.evalua.java8.utilities.CU0101Jugador;

public class CV0101v01GenerarThreadJugador {
    public static void main(String[] paeias){
        CU0101Jugador oJugador = new CU0101Jugador();

        CVThread1 oCVT1 = new CVThread1(oJugador);
        CVThread1 oCVT2 = new CVThread1(oJugador);
    }
}

class CVThread1 extends Thread{
    CU0101Jugador oCUJugador;
    
    public CVThread1(CU0101Jugador poCUJugador){
        oCUJugador = poCUJugador;
        start();
    }
    
    @Override
    public void run (){
        oCUJugador.recibir_golpe(12);
    }
}

class CVThread2 extends Thread{
    CU0101Jugador oCUJugador;
    public CVThread2(CU0101Jugador poCUJugador){
        oCUJugador = poCUJugador;
        start();
    }
    
    @Override
    public void run(){
        if (oCUJugador.esta_muerto()){
            System.out.println("El jugador esta muerto");
        }else{
            System.out.println("El jugador esta vico");
        }
            
    }
}
