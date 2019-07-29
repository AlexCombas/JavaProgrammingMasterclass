package section.seven;

public class Bedroom {
    private int numberOfBeds;
    private int numberOfRooms;

    public Bedroom(int numberOfRooms, int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
        this.numberOfRooms = numberOfRooms;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }
}
