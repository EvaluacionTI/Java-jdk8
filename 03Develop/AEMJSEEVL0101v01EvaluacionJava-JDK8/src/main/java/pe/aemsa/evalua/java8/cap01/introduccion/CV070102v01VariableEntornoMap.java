package pe.aemsa.cap01.introduccion;

import java.util.Map;

public class CV070102v01VariableEntornoMap {

    public static void main(String[] args) {
       Map<String, String> oEnvironment = System.getenv();
        for (String envName : oEnvironment.keySet()) {
            System.out.format("%s=%s%n", envName, oEnvironment.get(envName));
        }
    }
    
}
