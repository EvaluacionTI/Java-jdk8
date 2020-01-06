package pe.aemsa.evalua.java8.utilities;

public class CU0101Jugador {
    int vida;
    int curacion;
    
    public CU0101Jugador(){
        vida = 10;
        curacion=5;
    }
    
    public synchronized void recibir_golpe(int cantidad){
        vida = vida - cantidad;
        vida = vida + curacion;
    }
    
    public synchronized boolean esta_muerto(){
        return (vida<=0);
    }
}
