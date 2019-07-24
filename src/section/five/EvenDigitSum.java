package section.five;


public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));
    }
    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }
        int sum = 0;
        int temp = 0;
        while (number > 0) {
            temp = number % 10;
            if (temp % 2 == 0) {
                sum += temp;
            }
            number /= 10;
        }
        return sum;
    }
}

