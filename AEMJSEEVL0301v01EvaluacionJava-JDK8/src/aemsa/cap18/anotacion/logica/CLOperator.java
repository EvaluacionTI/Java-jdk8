/*
    Coge todos métodos de la clase que se le pasa (en nuestro caso, el arma).
    Para cada método:
        Mira el número de veces a invocar
        Invoca dicho número de veces con los argumentos necesarios (en este caso no hay)
 */
package aemsa.cap18.anotacion.logica;

import aemsa.cap18.anotacion.servicio.CIMultipleInvocation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class CLOperator {
    public void operate(CLAutomaticWeapon weapon) {
        final String className = weapon.getClass().getName();
        try {
            final Method[] methods = Class.forName(className).getMethods();
            for (final Method method : methods) {
                invokeMethod(method, weapon);
            }
        } catch (final Exception e) {
            System.err.println("Hubo un error:" + e.getMessage());
        }
    }
 
    private void invokeMethod(Method method, CLAutomaticWeapon weapon)
            throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
 
        final CIMultipleInvocation multipleInvocation = method.getAnnotation(CIMultipleInvocation.class);
 
        if (multipleInvocation != null) {
            final int timesToInvoke = multipleInvocation.timesToInvoke();
 
            for (int i = 0; i < timesToInvoke; i++) {
                method.invoke(weapon, (Object[])null);
            }
        }
 
    }    
}