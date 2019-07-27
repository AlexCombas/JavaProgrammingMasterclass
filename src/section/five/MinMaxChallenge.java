package section.five;

import java.util.Scanner;

public class MinMaxChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min = 0;
        int max = 0;
        int temp = 0;
        boolean hasNext;
        while (true) {
            System.out.print("2Enter number: ");
            hasNext = scanner.hasNextInt();
            if (hasNext) {
               temp = scanner.nextInt();
               scanner.nextLine();
               if (temp < 1) {
                   System.out.println("Minimum number entered: " + min);
                   System.out.println("Maximum number entered: " + max);
                   break;
               }

               if (temp < min || min == 0) {
                   min = temp;
               } else if (temp > max) {
                   max = temp;
               }

            } else {
                System.out.println("Error: Invalid Integer");
                break;
            }
        }
        scanner.close();



    }
}
