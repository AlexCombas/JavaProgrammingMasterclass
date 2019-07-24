package section.four;
public class PlayingCat {
    public static void main(String[] args) {
        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(true, 35));
    }
    private static boolean isCatPlaying(boolean summer, int temperature) {
       int upper;
       int lower = 25;

       if (summer) {
           upper = 45;
       } else {
           upper = 35;
       }

       return (temperature <= upper && temperature >= lower);
    }
}
