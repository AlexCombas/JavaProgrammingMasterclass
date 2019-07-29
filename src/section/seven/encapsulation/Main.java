package section.seven.encapsulation;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(50, true);

        printer.toggleDuplex();
        printer.printPage(5);
        printer.getTonerLevel();
        printer.printPage(67);
        printer.addToner(50);
        printer.printPage(89);
        printer.addToner(50);
    }
}
