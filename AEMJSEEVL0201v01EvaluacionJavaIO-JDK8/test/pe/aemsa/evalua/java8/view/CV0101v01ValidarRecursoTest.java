/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.aemsa.evalua.java8.view;

import java.io.IOException;
import java.io.InputStream;
import org.junit.Test;
import sun.misc.IOUtils;
import sun.nio.cs.StandardCharsets;


/**
 *
 * @author user
 */
public class CV0101v01ValidarRecursoTest {
    
    //@DisplayName("Test loading XML")
    @Test
    void loadXMLTest() {

        ClassLoader classLoader = getClass().getClassLoader();

        try (InputStream inputStream = classLoader.getResourceAsStream("xml/data.xml")) {

            String result = IOUtils.toString(inputStream, StandardCharsets.UTF_8);
            System.out.println(result);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
