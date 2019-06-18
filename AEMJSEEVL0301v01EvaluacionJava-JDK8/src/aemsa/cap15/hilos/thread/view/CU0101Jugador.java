package aemsa.cap15.hilos.thread.view;

public class CU0101Jugador {
    int vida;
    int curacion;
    
    CU0101Jugador(){
        vida = 10;
        curacion=5;
    }
    synchronized void recibir_golpe(int cantidad){
        vida = vida - cantidad;
        vida = vida + curacion;
    }
    
    synchronized boolean esta_muerto(){
        return (vida<=0);
    }
}
