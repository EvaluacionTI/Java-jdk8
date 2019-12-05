
package pe.aemsa.evalua.java8.view.cifrar;

import java.util.Base64;

public class CV0101v01EncoderDecoderBase64 {

    public static void main(String[] args) {

        String sBaseSinCifrar = "Arquitectura Host/Apx";
        String sCifrarBase64 = Base64.getEncoder().encodeToString(sBaseSinCifrar.getBytes());
        
        System.out.println("Cadena :" + sBaseSinCifrar);
        System.out.println("Cifrado en Base 64 :" + sCifrarBase64);
        
        byte[] sDescifrarBase64 = Base64.getDecoder().decode(sCifrarBase64);
        String decodedString = new String(sDescifrarBase64);

        System.out.println("Descifrado en Base 64 :" + decodedString);
    }
    
}
