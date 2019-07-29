package section.six;

public class Truck extends Vehicle {
    private int numberOfPassengers;
    private String steeringType;
    private String driveType;

    public Truck(boolean toggleCargo, int numberOfPassengers, String steeringType, String driveType) {
        super(toggleCargo);
        this.numberOfPassengers = numberOfPassengers;
        this.steeringType = steeringType;
        this.driveType = driveType;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public String getSteeringType() {
        return steeringType;
    }

    public void setSteeringType(String steeringType) {
        this.steeringType = steeringType;
    }

    public String getDriveType() {
        return driveType;
    }

    public void setDriveType(String driveType) {
        this.driveType = driveType;
    }
}
