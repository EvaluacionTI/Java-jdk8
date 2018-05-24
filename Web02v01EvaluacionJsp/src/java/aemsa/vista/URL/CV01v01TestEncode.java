/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aemsa.vista.URL;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class CV01v01TestEncode {

    public static void main(String[] args) {
        try {

	String url = "<![CDATA[ <IMG SRC=\"  javascript:document.vulnerable=true;\"> ]]>";

	String encodedUrl = URLEncoder.encode(url, "UTF-8");

	System.out.println("Encoded URL " + encodedUrl);

	String decodedUrl = URLDecoder.decode(url, "UTF-8");

	System.out.println("Dncoded URL " + decodedUrl);

	} catch (UnsupportedEncodingException e) {

		System.err.println(e);

	}
    }
    
}
