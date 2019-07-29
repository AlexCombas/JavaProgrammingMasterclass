package section.seven;

public class Main {
    public static void main(String[] args) {
        Bedroom bedrooms = new Bedroom(2, 4);
        Bathroom bathrooms = new Bathroom(2, 2);
        Kitchen kitchens = new Kitchen(2, 6);
        House myHouse = new House("927 Cherrywood Lane", 2, bedrooms, bathrooms, kitchens);

        System.out.println("My house has "+ myHouse.getBedrooms().getNumberOfRooms() +" rooms, and "+ myHouse.getBathrooms().getNumberOfBathrooms() +" bathrooms.");
    }
}
