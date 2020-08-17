/*
 * Usando la notación: basta etiquetar con la anotación los métodos que queramos
 */
package aemsa.cap18.anotacion.logica;

import aemsa.cap18.anotacion.servicio.CIMultipleInvocation;

public class CLAutomaticWeapon {
    
    private static final int BURST_FIRE_ROUNDS = 3;
 
    private static final int AUTO_FIRE_ROUNDS = 5;
 
    private int ammo;
 
    public CLAutomaticWeapon(int ammo) {
        this.ammo = ammo;
    }
 
    @CIMultipleInvocation
    public void singleFire() {
        ammo--;
        System.out.println("Simple disparo: Gasta una bala por invocación " + ammo);
    }
 
    @CIMultipleInvocation(timesToInvoke = BURST_FIRE_ROUNDS)
    public void burstFire() {
        ammo--;
        System.out.println("Ráfaga : Gasta tres balas por invocación " + ammo);
    }
 
    @CIMultipleInvocation(timesToInvoke = AUTO_FIRE_ROUNDS)
    public void autoFire() {
        ammo--;
        System.out.println("Automático : Gasta cinco balas por invocación " + ammo);
    }    
}
