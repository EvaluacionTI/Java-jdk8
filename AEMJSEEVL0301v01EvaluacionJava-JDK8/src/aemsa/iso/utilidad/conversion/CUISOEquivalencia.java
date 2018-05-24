/*=============================================================================
 * Proyecto         :	ISO Trama de datos
 * Aplicación       :	Trama de datos
 * Nombre archivo   :	CUISOEquivalencia.java
 * Objetivo         :	Conversion de datos a otra unidad equivalente
 * Fecha            :	10 Feb 2016
 * Autor            :	ALDV
 * Descripción      :   
=============================================================================*/

package aemsa.iso.utilidad.conversion;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;

public class CUISOEquivalencia {

    private static final int SIZE = 256;
    private static final char[] ASCII_EBCDIC = { '\000', '\001', '\002', '\003', '\004', '\005', '\006', '\007', '\b', '\t', '\n', '\013', '\f', '\r', '\016', '\017', '\020', '\021', '\022', '\023', '�', '�', '\026', '\027', '\030', '\031', '\032', '\033', '\034', '\035', '\036', '\037', '@', 'O', '', '{', '[', 'l', 'P', '}', 'M', ']', '\\', 'N', 'k', '`', 'K', 'a', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', 'z', '^', 'L', '~', 'n', 'o', '|', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', 'J', '�', 'Z', '_', 'm', 'y', '?', '?', '?', '?', '?', '?', '?', '?', '?', '?', '?', '?', '?', '?', '?', '?', '?', '?', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', 'A', 'h', '�', 'Q', 'B', 'C', 'D', 'G', 'H', 'R', 'S', 'T', 'W', 'V', 'X', 'c', 'g', 'q', '?', '?', '�', '�', '�', '�', '�', '�', '�', '�', 'p', '�', '?', 'A', '�', 'E', 'U', '�', '�', 'I', 'i', '?', '?', '�', '�', '�', '�', '�', '�', '?', '?', 'A', 'A', 'A', 'A', 'A', 'e', 'b', 'd', 'A', 'A', 'A', 'A', 'A', '�', '�', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'F', 'f', 'A', 'A', 'A', 'A', 'A', 'A', 'A', '?', '?', '�', 'r', 's', 't', '�', 'u', 'v', 'w', 'A', 'A', 'A', 'A', 'j', 'x', 'A', '�', 'Y', '�', '�', '�', '�', '�', '�', '?', '�', '�', '�', '?', '�', '�', '�', '�', '?', '�', '�', '�', '�', 'A', '?', '?', '�', '�', 'A', '�', '�', 'A', 'A' };
    private static final char[] EBCDIC_ASCII = { '\000', '\001', '\002', '\003', '\004', '\005', '\006', '\007', '\b', '\t', '\n', '\013', '\f', '\r', '\016', '\017', '\020', '\021', '\022', '\023', '\024', '\025', '\026', '\027', '\030', '\031', '\032', '\033', '\034', '\035', '\036', '\037', ' ', '!', '"', '#', '$', '%', '&', '\'', '(', ')', '*', '+', ',', '-', '.', '/', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ':', ';', '<', '=', '>', '?', ' ', '�', '?', '?', '?', '�', '�', '?', '?', '�', '[', '.', '<', '(', '+', '!', '&', '?', '?', '?', '?', '�', '?', '?', '?', '�', ']', '$', '*', ')', ';', '^', '-', '/', '�', '?', '�', '�', '�', '?', '?', '�', '�', ',', '%', '_', '>', '?', '?', '?', '�', '�', '�', '�', '�', '�', '�', '`', ':', '#', '@', '\'', '=', '"', '?', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', '�', '�', '�', '�', '�', '�', '�', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', '�', '�', '?', '�', '?', '�', '�', '~', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '�', '�', '�', '�', '�', '�', '�', '?', '�', '�', '?', '�', '�', '�', '�', '�', '�', '|', '�', '�', '�', '�', '{', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', '�', '?', '?', '?', '�', '�', '}', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', '�', '?', '?', '?', '�', '?', '\\', '�', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '�', '�', '?', '�', '�', '�', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '�', '�', '?', '�', '�', '�' };
    private static final int[] ASCII_EBCDIC_V2 = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 182, 181, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 64, 79, 127, 123, 91, 108, 80, 125, 77, 93, 92, 78, 107, 96, 75, 97, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 122, 94, 76, 126, 110, 111, 124, 193, 194, 195, 196, 197, 198, 199, 200, 201, 209, 210, 211, 212, 213, 214, 215, 216, 217, 226, 227, 228, 229, 230, 231, 232, 233, 74, 224, 90, 95, 109, 121, 129, 130, 131, 132, 133, 134, 135, 136, 137, 145, 146, 147, 148, 149, 150, 151, 152, 153, 162, 163, 164, 165, 166, 167, 168, 169, 192, 187, 208, 161, 65, 104, 220, 81, 66, 67, 68, 71, 72, 82, 83, 84, 87, 86, 88, 99, 103, 113, 156, 158, 203, 204, 205, 219, 221, 223, 236, 252, 112, 177, 128, 65, 180, 69, 85, 206, 222, 73, 105, 154, 155, 171, 175, 186, 184, 183, 170, 138, 139, 65, 65, 65, 65, 65, 101, 98, 100, 65, 65, 65, 65, 65, 176, 178, 65, 65, 65, 65, 65, 65, 65, 70, 102, 65, 65, 65, 65, 65, 65, 65, 159, 140, 172, 114, 115, 116, 218, 117, 118, 119, 65, 65, 65, 65, 106, 120, 65, 238, 89, 235, 237, 207, 239, 160, 174, 142, 254, 251, 253, 141, 173, 188, 190, 202, 143, 191, 185, 182, 181, 65, 157, 144, 189, 179, 65, 250, 234, 65, 65 };
    private static final int[] EBCDIC_ASCII_V2 = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 32, 255, 131, 132, 133, 160, 198, 134, 135, 164, 91, 46, 60, 40, 43, 33, 38, 130, 136, 137, 138, 161, 140, 139, 141, 225, 93, 36, 42, 41, 59, 94, 45, 47, 182, 142, 183, 181, 199, 143, 128, 165, 221, 44, 37, 95, 62, 63, 155, 144, 210, 211, 212, 214, 215, 216, 222, 96, 58, 35, 64, 39, 61, 34, 157, 97, 98, 99, 100, 101, 102, 103, 104, 105, 174, 175, 208, 236, 232, 241, 248, 106, 107, 108, 109, 110, 111, 112, 113, 114, 166, 167, 145, 247, 146, 207, 230, 126, 115, 116, 117, 118, 119, 120, 121, 122, 173, 168, 209, 237, 231, 169, 189, 156, 190, 250, 159, 245, 244, 172, 171, 243, 170, 124, 238, 249, 239, 242, 123, 65, 66, 67, 68, 69, 70, 71, 72, 73, 240, 147, 148, 149, 162, 228, 125, 74, 75, 76, 77, 78, 79, 80, 81, 82, 213, 150, 129, 151, 163, 152, 92, 225, 83, 84, 85, 86, 87, 88, 89, 90, 253, 226, 153, 227, 224, 229, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 252, 234, 154, 235, 233, 255 };
          
    /*=============================================================================================
	 * Descripción          : Convertir una cadena de ASCII a EBCDIC y viceversa
	 * pStrCadenaConvertir  : Nombre de cadena a convertir
	 * pStrCadenaOrigen     : Prefijo de conversión: 
                                  ISO-8859-1: ASCCI
                                  CP1047    : EBCDIC
	 * pStrCadenaDestino    : Prefijo de conversión: 
                                  ISO-8859-1: ASCCI
                                  CP1047    : EBCDIC
	 * ex                   : ex
    =============================================================================================*/
    public String convertirAsciiToEbcdic (String pstrCadenaConvertir, String pstrCadenaOrigen, String pstrCadenaDestino){
        String lstrConversion;
        
        try {
            Charset charset_in = Charset.forName(pstrCadenaDestino);
            
            Charset charset_out = Charset.forName(pstrCadenaOrigen);

            CharsetDecoder decoder = charset_out.newDecoder();

            CharsetEncoder encoder = charset_in.newEncoder();

            CharBuffer uCharBuffer = CharBuffer.wrap(pstrCadenaConvertir);

            ByteBuffer bbuf = encoder.encode(uCharBuffer);

            CharBuffer cbuf = decoder.decode(bbuf);

            lstrConversion = cbuf.toString();
            return lstrConversion;

        } catch (CharacterCodingException exCCE) {
            System.out.println(exCCE.getMessage());
            return exCCE.getMessage();
      }
    }    
    
    public String convertirAsciiToEbcdic(String pstrTrama){
        int nPos = 0;
        String sTrama = "";
        StringBuffer sTramaB = new StringBuffer();
        
        pstrTrama = pstrTrama.trim();
        
        for (int j = 0; j < pstrTrama.length(); j++){
            nPos = pstrTrama.charAt(j);
            sTramaB.append(ASCII_EBCDIC[nPos]);
        }
        
        sTrama = sTramaB.substring(0);
        return sTrama;
    }
    
    public String convertirEbcdicToAscii(String pstrTrama) {
        int nPos = 0;
        String sTrama = "";
        StringBuffer sTramaB = new StringBuffer();
        
        pstrTrama = pstrTrama.trim();
        
        for (int j = 0; j < pstrTrama.length(); j++){
          nPos = pstrTrama.charAt(j);
          sTramaB.append(EBCDIC_ASCII[nPos]);
        }
        
        sTrama = sTramaB.substring(0);
        return sTrama;
    }

    public byte[] convertirAsciiToEbcdicV2(byte[] pstrTrama){
        int nPos = 0;
        try{
            for (int j = 0; j < pstrTrama.length; j++) {
                if (pstrTrama[j] == 28){
                    pstrTrama[j] = 63;
                }else{
                    nPos = pstrTrama[j];
                    pstrTrama[j] = ((byte)ASCII_EBCDIC_V2[nPos]);
                }
            }
        }finally {}
            return pstrTrama;
    }
    
    public byte[] convertirEbcdicToAsciiV2(byte[] pstrTrama){
        int nPos = 0;
        
        try{
            for (int j = 0; j < pstrTrama.length; j++){
                nPos = pstrTrama[j];
                if (nPos < 0) {
                    nPos += SIZE;
                }
                pstrTrama[j] = ((byte)EBCDIC_ASCII_V2[nPos]);
            }
        }finally {}
            return pstrTrama;
    }

}
