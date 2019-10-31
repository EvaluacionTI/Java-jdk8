/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.aemsa.cap02.operador;

public class CV08v01OperadoresLogicosBit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String lStrBinario[] = {
            "0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111",
            "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111",};

        int lInta = 3;
        int lIntb = 6;
        int lIntc = lInta | lIntb;
        int lIntd = lInta & lIntb;
        int lInte = lInta ^ lIntb;
        int lIntf = (~lInta & lIntb) | (lInta & ~lIntb);
        int lIntg = ~lInta & 0x0f;

        System.out.println("                   a = " + lStrBinario[lInta]);
        System.out.println("                   b = " + lStrBinario[lIntb]);
        System.out.println("                a|b = " + lStrBinario[lIntc]);
        System.out.println("                a&b= " + lStrBinario[lIntd]);
        System.out.println("                a^b= " + lStrBinario[lInte]);
        System.out.println("  ~a&b | a&~b= " + lStrBinario[lIntf]);
        System.out.println("                  ~a = " + lStrBinario[lIntg]);
    }
}
