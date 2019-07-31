package section.eight;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Scanner;

public class SortDescending {
    /**
     * sort a list of integers in descending order highest to lowest
     * read these numbers from user input
     * implement methods getIntegers(), printArray(), sortIntegers()
     * getIntegers() returns array of integers from keyboard
     * printArray() prints out the contents of the array
     * sortIntegers() returns a sorted copy of the array
     */
    public static void main(String[] args) {
        int[] integerArray = getIntegers();
        printArray(sortIntegers(integerArray));
    }

    @Nullable
    private static int[] getIntegers() {
        Scanner scanner = new Scanner(System.in);
        int arraySize = 0;

        System.out.print("Enter size of array: ");
        boolean hasNext = scanner.hasNextInt();
        if (hasNext) {
            arraySize = scanner.nextInt();
            scanner.nextLine();
        } else {
            System.out.println("Error: not an integer");
            return null;
        }
        if (arraySize > 0) {
            int[] myArray = new int[arraySize];
            System.out.println("Enter " + arraySize + " vales: ");
            for (int i = 0; i < arraySize; i++) {
                myArray[i] = scanner.nextInt();
            }
            return myArray;
        }
        return null;
    }

    private static void printArray(@NotNull int[] myArray) {
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(i + 1 + ": " + myArray[i]);
        }

    }

    @Contract("_ -> param1")
    private static int[] sortIntegers(@NotNull int[] myArray) {
        int temp = 0;
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray.length; j++) {
                if (myArray[i] < myArray[j]) {
                    temp = myArray[i];
                    myArray[i] = myArray[j];
                    myArray[j] = temp;
                }

            }
        }
        return myArray;
    }
}
