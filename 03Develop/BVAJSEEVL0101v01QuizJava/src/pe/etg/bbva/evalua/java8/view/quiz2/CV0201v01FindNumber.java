package pe.etg.bbva.evalua.java8.view.quiz2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import static java.util.stream.Collectors.toList;
import java.util.stream.IntStream;

public class CV0201v01FindNumber {

// Complete the findNumber function below.
    static String findNumber(List<Integer> arr, int k) {
        String sNumber = null;
        for (int x:arr){
            if (x==k){
                sNumber = String.valueOf(arr.get(x));
            }
        }
        return sNumber;
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> arrTemp = new ArrayList<>();

        IntStream.range(0, arrCount).forEach(i -> {
            try {
                arrTemp.add(bufferedReader.readLine().replaceAll("\\s+$", ""));
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        List<Integer> arr = arrTemp.stream()
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        String res = findNumber(arr, k);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
    
}
