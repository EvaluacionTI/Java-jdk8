package pe.aemsa.cap12.java8.flujos.vista;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CV09ValidarRecurso {

    private static final Logger MOLOG = Logger.getLogger("CV0101v01ValidarRecurso");

    private static final String FILE_PROPERTIES = "RE0101v01ValidarRecurso.properties";

    public static void main(String[] args) throws IOException {
        MOLOG.info("[EVL] Begin");
        CV09ValidarRecurso oMain = new CV09ValidarRecurso();
        MOLOG.log(Level.INFO, "[EVL] Instancia : {0}", oMain);
        
        System.out.println(oMain.getFilePathToSave(FILE_PROPERTIES));

//        File oFile = oMain.getFileFromResources(sFileProperties);
        //       printFile(oFile);
    }

    public String getFilePathToSave(String psFile) {

        Properties prop = new Properties();

        String result = "";
        MOLOG.log(Level.INFO, "[EVL] File : {0}", psFile);
        MOLOG.log(Level.INFO, "[EVL] File : {0}", getClass());
        MOLOG.log(Level.INFO, "[EVL] File : {0}", getClass().getClassLoader());
        
        InputStream oIStream = getClass().getClassLoader().getResourceAsStream("/src/resources"+ psFile);

        try {

            prop.load(oIStream);
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

        if (file == null) {
            return;
        }

        try (FileReader reader = new FileReader(file);
                BufferedReader br = new BufferedReader(reader)) {

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }
    }

}
