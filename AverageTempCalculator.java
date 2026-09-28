// Average temperature calculator 
// This program calculates the average temperature over a number of days and counts how many days had a temperature above the average.
// Date: 2026-09-28
// Rebecca Miller

import java.util.Scanner;

public class AverageTempCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Ask how many days of temperature data the user wants to input
        System.out.print("Enter the number of days: ");
        int days = scanner.nextInt();

        // Create array 
        int[] temperatures = new int[days];

        int total = 0;

        for (int i = 0; i < temperatures.length; i++) {

            System.out.print("Enter temperature: ");
            temperatures[i] = scanner.nextInt();

            total = total + temperatures[i];
        }

        // Calculate the average temperature
        double average = (double) total / temperatures.length;

        System.out.println("Average temperature: " + average);

        // Find how many days had a temperature above the average
        int countAboveAverage = 0;

        for (int i = 0; i < temperatures.length; i++) {

            if (temperatures[i] > average) {
                countAboveAverage++;
            }
        }

        System.out.println("Number of days above average temperature: " + countAboveAverage);

        scanner.close();
    }
}