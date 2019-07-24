package section.five;

public class DigitSum {
    public static void main(String[] args) {
        System.out.println(sumDigits(125));
        System.out.println(sumDigits(2048));
    }

    // break number into individual digits and add them together
    // sumDigits(125) -> 1 + 2 + 5 = 8
    // sumDigits(2048) -> 2 + 0 + 4 + 8 = 14
    private static int sumDigits(int n) {
        int sum = 0;
        int number = n;

        // values less than 10 are invalid
        if (number < 10) { return -1; }

        // extract the final digit then accumulate
        while (number > 0) {
            sum += (number % 10);
            number = (int) Math.floor(number / 10);
        }
        return sum;
    }
}
