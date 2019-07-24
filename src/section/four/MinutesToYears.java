package section.four;
public class MinutesToYears {
    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }

    private static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
            return;
        }
        long oneYearInMinutes = 365*24*60;
        long years = minutes / oneYearInMinutes;
        long yearRemainder = minutes % oneYearInMinutes;
        long oneDayInMinutes = 24*60;
        long days = yearRemainder / oneDayInMinutes;

        System.out.println(minutes +" min = " + years + " y and " + days + " d");

    }
}
