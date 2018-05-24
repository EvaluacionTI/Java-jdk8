/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aemsa.controladora;


import bco.credito.entidad.CEBaseCalculo;
import aemsa.modelo.CDBaseCalculo;

import java.util.List;

public class CCBaseCalculo {

    public static List<CEBaseCalculo> cargarTablaBaseCalculov1() {
        return CDBaseCalculo.cargarTablaBaseCalculov1();
    }
}
