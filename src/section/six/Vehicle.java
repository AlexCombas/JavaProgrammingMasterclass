package section.six;

public class Vehicle {
    private boolean cargoVehicle;

    public Vehicle(boolean cargoVehicle){
        this.cargoVehicle = cargoVehicle;
    }

    public boolean canTransportCargo() {
        return cargoVehicle;
    }

    public void toggleCargoAbility() {
        cargoVehicle = !cargoVehicle;
    }
}
