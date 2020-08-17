package pe.unjfsc.ads.java8.view;

import java.util.Scanner;

public class CV01NumberPrimeWhile {

    public static void main(String[] args) {
        int j = 2;
        int result = 0;
        int number = 0;
        Scanner reader = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        number = reader.nextInt();
        while (j <= number / 2) {
            //un número divisible solo por sí mismo y 1
            if (number % j == 0) {
                result = 1;
            }
            j++;
        }
        if (result == 1) {
            System.out.println("Number: " + number + " is Not Prime.");
        } else {
            System.out.println("Number: " + number + " is Prime. ");
        }
    }

}
