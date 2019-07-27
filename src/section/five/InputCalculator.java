package section.five;

import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        while (true) {
            boolean nextInt = scanner.hasNextInt();
            if (nextInt) {
                sum += scanner.nextInt();
                scanner.nextLine();
                count++;
            } else {
                double average = (double) sum / count;
                long rounded = Math.round(average);
                System.out.println("SUM = " + sum + " AVG = " + rounded);
                break;
            }
        }
        scanner.close();
    }
}
