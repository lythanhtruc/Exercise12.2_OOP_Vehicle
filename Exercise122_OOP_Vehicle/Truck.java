package Exercise122_OOP_Vehicle;

public class Truck extends Vehicle {

    private double loadCapacity;
    private double distance;

    public Truck() {
        super();
    }

    // Getter & Setter
    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    @Override
    public void addVehicle() {
        super.addVehicle();
        System.out.print("Enter Load Capacity (tons): ");
        loadCapacity = Double.parseDouble(sc.nextLine());
        System.out.print("Enter Distance (km): ");
        distance = Double.parseDouble(sc.nextLine());
    }

    @Override
    public void updateVehicle() {
        super.updateVehicle();
        System.out.print("Enter new Load Capacity: ");
        loadCapacity = Double.parseDouble(sc.nextLine());
        System.out.print("Enter new Distance: ");
        distance = Double.parseDouble(sc.nextLine());
    }

    @Override
    public void displayDetails() {
        System.out.println("----- Truck -----");
        System.out.println("ID: " + id);
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Price Per Day: " + rentalPricePerDay);
        System.out.println("Load Capacity: " + loadCapacity + " tons");
        System.out.println("Distance: " + distance + " km");
        System.out.println("Total Cost: " + (rentalDays * rentalPricePerDay));
    }
}
