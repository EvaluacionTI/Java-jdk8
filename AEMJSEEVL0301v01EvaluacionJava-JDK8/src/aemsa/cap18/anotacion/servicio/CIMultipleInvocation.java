/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aemsa.cap18.anotacion.servicio;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/*
    @Retention – Especifica el nivel de retención de la anotación (cuándo se puede acceder a ella).
    RetentionPolicy.SOURCE — Retenida sólo a nivel de código; ignorada por el compilador.
    RetentionPolicy.CLASS — Retenida en tiempo de compilación, pero ignorada en tiempo de ejcución.
    RetentionPolicy.RUNTIME — Retenida en tiempo de ejecución, sólo se puede acceder a ella en este tiempo.
*/

/*
    @Target – Especifica el tipo de elemento al que se va a asociar la anotación.
    ElementType.TYPE – se puede aplicar a cualquier elemento de la clase.
    ElementType.FIELD – se puede aplicar a un miebro de la clase.
    ElementType.METHOD – se puede aplicar a un método
    ElementType.PARAMETER – se puede aplicar a parámetros de un método.
    ElementType.CONSTRUCTOR – se puede aplicar a constructores
    ElementType.LOCAL_VARIABLE – se puede aplicar a variables locales
    ElementType.ANNOTATION_TYPE – indica que el tipo declarado en sí es un tipo de anotación.
*/

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface CIMultipleInvocation {
    int timesToInvoke() default 1;
}
