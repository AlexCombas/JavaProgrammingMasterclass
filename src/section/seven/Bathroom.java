package section.seven;

public class Bathroom {
    private int numberOfToilets;
    private int numberOfBathrooms;


    public Bathroom(int numberOfToilets, int numberOfBathrooms) {
        this.numberOfToilets = numberOfToilets;
        this.numberOfBathrooms = numberOfBathrooms;
    }

    public int getNumberOfToilets() {
        return numberOfToilets;
    }

    public void setNumberOfToilets(int numberOfToilets) {
        this.numberOfToilets = numberOfToilets;
    }

    public int getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    public void setNumberOfBathrooms(int numberOfBathrooms) {
        this.numberOfBathrooms = numberOfBathrooms;
    }
}
