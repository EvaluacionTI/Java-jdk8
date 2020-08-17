package pe.aemsa.cap01.introduccion;

import java.util.Map;

public class CV070102v02VariableEntornoMapFunctional {

    public static void main(String[] args) {
       Map<String, String> oEnvironment = System.getenv();
       oEnvironment.keySet().forEach((envName) -> {
           System.out.format("%s=%s%n", envName, oEnvironment.get(envName));
        });
    }
    
}
