package pe.aemsa.cap29.swing04.windows;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class CV0504v01BuscarFile {


    public static void main(String[] args) {
        File file = null;
        String resource = "/pe/aemsa/cap29/swing04/windows/AberdeenAngus.jpg";
        URL res = getClass().getResource(resource);
          if (res.toString().startsWith("jar:")) {
              try {
                  InputStream input = getClass().getResourceAsStream(resource);
                  file = File.createTempFile("tempfile", ".tmp");
                  OutputStream out = new FileOutputStream(file);
                  int read;
                  byte[] bytes = new byte[1024];

                  while ((read = input.read(bytes)) != -1) {
                      out.write(bytes, 0, read);
                  }
                  file.deleteOnExit();
              } catch (IOException ex) {
                  ex.printStackTrace();
              }
          } else {
              //this will probably work in your IDE, but not from a JAR
              file = new File(res.getFile());
          }

          if (file != null && !file.exists()) {
              throw new RuntimeException("Error: File " + file + " not found!");
          }
          }
    
}
