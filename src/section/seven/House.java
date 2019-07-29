package section.seven;

public class House {
    private String address;
    private int numberOfFloors;
    private Bedroom bedrooms = new Bedroom(3, 4);
    private Bathroom bathrooms = new Bathroom(3, 4);
    private Kitchen kitchens = new Kitchen(1, 3);

    public House(String address, int numberOfFloors, Bedroom bedrooms, Bathroom bathrooms, Kitchen kitchens) {
        this.address = address;
        this.numberOfFloors = numberOfFloors;
        this.bedrooms = bedrooms;
        this.bathrooms = bathrooms;
        this.kitchens = kitchens;
    }


}
