package section.four;
public class EqualSumChecker {
    public static void main(String[] args) {
        System.out.println(hasEqualSum(1, 1, 1));
        System.out.println(hasEqualSum(1, 1, 2));
        System.out.println(hasEqualSum(1, -1, 0));

    }

    private static boolean hasEqualSum(int first, int second, int third) {
        return (first + second == third);
    }
}
