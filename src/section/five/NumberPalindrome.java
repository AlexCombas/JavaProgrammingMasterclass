package section.five;

public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(-123321));
        System.out.println(isPalindrome(123321));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
        System.out.println(isPalindrome(11));
        System.out.println(isPalindrome(770077));
        System.out.println(isPalindrome(-222));
    }


    public static boolean isPalindrome(int number) {
        // if number is negative invert it
        if (number < 0) {
            number = Math.abs(number);
        }
        if (number < 11) {
            return false;
        }
        int extraction = 0;
        int original = number;

        while (number > 0) {
            extraction *= 10;
            extraction += number % 10;
            number /= 10;
        }
        return (original == extraction);
    }
}


