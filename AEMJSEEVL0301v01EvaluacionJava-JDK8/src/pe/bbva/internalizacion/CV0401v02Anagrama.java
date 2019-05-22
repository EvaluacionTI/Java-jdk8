/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.bbva.internalizacion;

import java.util.Arrays;

/**
 *
 * @author Administrador
 */
public class CV0401v02Anagrama {
public static boolean isAnagram2(String s1, String s2){ 

     // Early termination check, if strings are of unequal lengths, 
     // then they cannot be anagrams 
     if (s1.length() != s2.length()) { 
      return false; 
     } 
     s1=s1.toLowerCase(); 
     s2=s2.toLowerCase(); 
     char[] c1 = s1.toCharArray(); 
     char[] c2 = s2.toCharArray(); 
     Arrays.sort(c1); 
     Arrays.sort(c2); 
     String sc1 = new String(c1); 
     String sc2 = new String(c2); 
     return sc1.equals(sc2); 
} 

 public static boolean isAnagram1(String s1 , String s2)
{
    if (s1.length() != s2.length()) { 
     return false; 
    } 

    for(int i = 0; i < s2.length(); i++) { 

      if(!s1.contains("" + s2.charAt(i))) { 
       return false; 
      } 

      s1 = s1.replaceFirst("" + s2.charAt(i), ""); 
      s2 = s2.replaceFirst("" + s2.charAt(i), ""); 
    } 
    return true; 
}
    public static void main(String[] args) {
        System.out.println(isAnagram1("code", "doce"));
       // System.out.println(isAnagram2System.out.println(isAnagram1("code", "doce"));("code", "doce"));
    }
    
}
