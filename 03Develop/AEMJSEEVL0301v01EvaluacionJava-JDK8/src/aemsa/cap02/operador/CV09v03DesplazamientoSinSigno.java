/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aemsa.cap02.operador;

/**
 *
 * @author INVERTEC
 */
public class CV09v03DesplazamientoSinSigno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char lChrHexadecimal[] = {
            '0', '1', '2', '3', '4', '5', '6', '7',
            '8', '9', 'a', 'b', 'c', 'd', 'e', 'f',
        };

        byte b = (byte) 0xf1;
        byte c = (byte) (b>>>4);
        byte d = (byte) (b>>>4);
        byte e = (byte) ((b & 0xff) >>4);

        System.out.println("                b = 0x" + lChrHexadecimal[(b>>4) & 0x0f] + lChrHexadecimal[b&0x0f] );
        System.out.println("                b >> 4 = 0x" + lChrHexadecimal[(c>>4) & 0x0f] + lChrHexadecimal[c&0x0f] );
        System.out.println("                b >>>= 0x" + lChrHexadecimal[(d>>4) & 0x0f] + lChrHexadecimal[d&0x0f] );
        System.out.println("                >> 4 = 0x" + lChrHexadecimal[(e>>4) & 0x0f] + lChrHexadecimal[e&0x0f] );
    }

}
