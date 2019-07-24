package section.five;

public class DigitSum {
    public static void main(String[] args) {

    }

    public static int sumDigits(int number) {
        if (number < 10) {
            return -1;
        }
        int sum = 0;
        for (int i = 1; i <= number; i++) {
           sum += i;

        }
        return sum;
    }


}
