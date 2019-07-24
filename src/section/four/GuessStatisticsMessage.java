package section.four;
public class GuessStatisticsMessage {
    static String number;
    static String verb;
    static String pluralModifier;

    public static void main(String[] args) {
        System.out.println(makeMessage('b', 1));
    }

    private static String makeMessage(char candidate, int count) {
        createPluralDependentMessageParts(count);
        return String.format("There %s %s %s%s", verb, number, candidate, pluralModifier);
    }
    private static void createPluralDependentMessageParts(int count) {
       if (count == 0) {
           thereAreNoLetters();
       } else if (count == 1) {
           thereIsOneLetter();
       } else {
           thereAreManyLetters(count);
       }
    }
    private static void thereAreManyLetters(int count) {
        number = Integer.toString(count);
        verb = "are";
        pluralModifier = "s";
    }
    private static void thereIsOneLetter() {
        number = "1";
        verb = "is";
        pluralModifier = "";
    }
    private static void thereAreNoLetters() {
        number = "no";
        verb = "are";
        pluralModifier = "s";
    }
}
