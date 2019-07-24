package section.four;
public class DecimalComparator {

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));
    }

    private static boolean areEqualByThreeDecimalPlaces(double first, double second) {
        if (first < 0 && second > 0 || first > 0 && second < 0) {
            return false;
        }
       int cutFirst = (int) Math.abs(first * 1000);
       int cutSecond = (int) Math.abs(second * 1000);
       return (cutFirst == cutSecond);
    }
}
