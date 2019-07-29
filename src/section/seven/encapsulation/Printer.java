package section.seven.encapsulation;

public class Printer {
    private int tonerLevel;
    private int numberOfPrintedPages = 0;
    private boolean duplexPrinter;

    Printer(int tonerLevel, boolean duplexPrinter) {
        if (tonerLevel > 100) {
            this.tonerLevel = 100;
        } else if (tonerLevel < 0){
            this.tonerLevel = 0;
        } else {
            this.tonerLevel = tonerLevel;
        }
        this.numberOfPrintedPages = 0;
        this.duplexPrinter = duplexPrinter;
    }

    void printPage(int numberOfPages) {
        tonerLevel -= numberOfPages;
        numberOfPrintedPages += numberOfPages;
        System.out.println(numberOfPages + " pages printed.");
    }

    void getTonerLevel() {
        System.out.println("Toner Level: " + tonerLevel);;
    }

    public void getNumberOfPrintedPages() {
        System.out.println("Number of printed pages: " + numberOfPrintedPages);
    }

    private void isDuplexPrinter() {
        if (duplexPrinter) {
            System.out.println("Duplex printing is enabled.");
        } else {
            System.out.println("Duplex printing is disabled.");
        }
    }

    void toggleDuplex() {
        duplexPrinter = !duplexPrinter;
        isDuplexPrinter();
    }

    void addToner(int amountOfToner) {
        if (tonerLevel + amountOfToner > 100){
            tonerLevel = 100;
        } else {
            tonerLevel += amountOfToner;
        }
        System.out.println("New Toner Level: " + tonerLevel);
    }
}
