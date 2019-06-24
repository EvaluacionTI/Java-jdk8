package pe.etg.bbva.evalua.java8.view.quiz1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
import java.util.stream.IntStream;

public class CV0401v01Anagrama {

    public static List<String> funWithAnagrams(List<String> s) {
        List<String> aAnagrama = null;
        String[] aAux1 = null;
        String[] aAux2 = null;

        Iterator oIt = s.iterator();
        int i = 0;
        while (oIt.hasNext()) {
            aAux1[i] = s.get(0);
            aAux2[i] = s.get(0);
        }

        char[] cadena1 = null;
        char[] cadena2 = null;

        for (i = 0; i < aAux1.length; i++) {
            cadena1 = aAux1[i].toCharArray();
            for (int j = 0; j < aAux2.length; j++) {
                cadena2 = aAux2[i].toCharArray();
                Arrays.sort(cadena1);
                Arrays.sort(cadena2);
                String sCadena1 = new String(cadena1);
                String sCadena2 = new String(cadena2);
                if (sCadena1.equals(sCadena2)) {
                    aAnagrama.add(sCadena2);
                };
            }
        }

        return aAnagrama;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int sCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> s = IntStream.range(0, sCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
                .collect(toList());

//        List<String> result = Result.funWithAnagrams(s);
        List<String> result = null;
        bufferedWriter.write(
                result.stream()
                        .collect(joining("\n"))
                + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }

}
