
package pe.aemsa.evalua.java8.view;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Properties;

public class CV0101v01ValidarRecurso {

    public static void main(String[] args) throws IOException {
        String sFileProperties = "database.properties";
        
        CV0101v01ValidarRecurso oMain = new CV0101v01ValidarRecurso();
     
        System.out.println(oMain.getFilePathToSave());
        
//        File oFile = oMain.getFileFromResources(sFileProperties);
        
 //       printFile(oFile);
    }
    
    public String getFilePathToSave() {

        Properties prop = new Properties();

        String result = "";

        try (InputStream inputStream = getClass().getClassLoader().getResourceAsStream("config.properties")) {
			
            prop.load(inputStream);
            result = prop.getProperty("json.filepath");

        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;

    }
    
    // get file from classpath, resources folder
    private File getFileFromResources(String fileName) {

        ClassLoader classLoader = getClass().getClassLoader();

        URL resource = classLoader.getResource(fileName);
        if (resource == null) {
            throw new IllegalArgumentException("file is not found!");
        } else {
            return new File(resource.getFile());
        }

    }
    
    private static void printFile(File file) throws IOException {

        if (file == null) return;

        try (FileReader reader = new FileReader(file);
             BufferedReader br = new BufferedReader(reader)) {

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }
    }
    
}
