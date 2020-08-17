
package pe.aemsa.evalua.java8.view.cifrar;

import java.util.Base64;

public class CV0102v01UrlLEncoderUrlDecoderBase64 {

    public static void main(String[] args) {

        String sBaseSinCifrar = "https://www.google.co.nz/?gfe_rd=cr&ei=dzbFV&gws_rd=ssl#q=java";
        String sCifrarBase64 = Base64.getUrlEncoder().encodeToString(sBaseSinCifrar.getBytes());
        
        System.out.println("Cadena :" + sBaseSinCifrar);
        System.out.println("Cifrado en Base 64 :" + sCifrarBase64);
        
        byte[] sDescifrarBase64 = Base64.getUrlDecoder().decode(sCifrarBase64);
        String decodedString = new String(sDescifrarBase64);

        System.out.println("Descifrado en Base 64 :" + decodedString);
    }
    
}
