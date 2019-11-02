package pe.aemsa.evalua.java8.view;

import java.io.IOException;
import java.io.InputStream;
import org.junit.Test;
import sun.misc.IOUtils;
import sun.nio.cs.StandardCharsets;


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
