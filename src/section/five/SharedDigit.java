package section.five;

public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
        System.out.println(hasSharedDigit(12, 43));
        System.out.println(hasSharedDigit(12, 13));
    }

    public static boolean hasSharedDigit(int firstNumber, int secondNumber) {
        // numbers must be within range of 10 to 99 (inclusive) otherwise returns false
        // method returns true if a digit is shared between both number (12, 320) -> true
        if (firstNumber < 10 || firstNumber > 99 || secondNumber < 10 || secondNumber > 99) {
            return false;
        }
        int firstDigit = firstNumber / 10;
        int secondDigit = firstNumber % 10;
        if (firstDigit == secondNumber / 10 || firstDigit == secondNumber % 10) {
            return true;
        } else {
            return (secondDigit == secondNumber / 10 || secondDigit == secondNumber % 10);
        }
    }
}
