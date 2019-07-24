package section.four;
public class TeenNumberChecker {
    public static void main(String[] args) {
        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));

    }

    private static boolean hasTeen(int first, int second, int third) {
        return (isTeen(first) || isTeen(second) || isTeen(third));
    }

    private static boolean isTeen(int teen) {
        return (teen > 12 && teen < 20);
    }
}
