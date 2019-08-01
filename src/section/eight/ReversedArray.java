package section.eight;

import java.util.Arrays;

public class ReversedArray {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        printArray(array);
        printReversedArray(array);
    }

    static void printReversedArray(int[] array) {
        int temp;
        for (int i = 0; i < array.length / 2; i++) {
            temp = array[i];
            array[i] = array[array.length -i -1];
            array[array.length -i -1] = temp;
        }
        printArray(array);
    }

    static void printArray(int[] array){
        System.out.println(Arrays.toString(array));
    }
}
