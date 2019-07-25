package section.five;

public class NumberToWords {
    public static void main(String[] args) {
        numberToWords(1234);
        numberToWords(-222);
    }

    public static void numberToWords(int number) {
        if (number < 0){
            System.out.println("Invalid Value");
        }
        int sum = reverse(number);
        for (int i = 1; i <= getDigitCount(number); i++) {
            int extract = sum % 10;
            sum /= 10;
            switch (extract) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:
                    System.out.println("Invalid Value");
            }
        }
    }

    public static int getDigitCount(int number) {
        if (number == 0) {
            return 1;
        }
        if (number < 0) {
            return -1;
        }
        int digits = 0;
        while (number > 0) {
            number /= 10;
            digits++;
        }
        return digits;
    }

    public static int reverse(int number) {
        boolean negative = false;
        if (number < 0) {
            negative = true;
            number = number * -1;
        }
        if (getDigitCount(number) == 1) {
            if (negative) {
                return number * -1;
            } else {
                return number;
            }
        }

        int sum = 0;
        int counter = getDigitCount(number);
        for (int i = 0; i < counter; i++) {
            sum *= 10;
            sum += number % 10;
            number /= 10;
        }
        if (negative) {
            return sum * -1;
        } else {
            return sum;
        }
    }
}
