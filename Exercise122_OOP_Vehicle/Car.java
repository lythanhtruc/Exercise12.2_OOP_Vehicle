package Exercise122_OOP_Vehicle;

public class Car extends Vehicle {

    private int numberOfSeats;
    private String fuelType;

    public Car() {
        super();
    }

    // Getter & Setter
    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public void addVehicle() {
        super.addVehicle();
        System.out.print("Enter Number Of Seats: ");
        numberOfSeats = Integer.parseInt(sc.nextLine());
        System.out.print("Enter Fuel Type (petrol/diesel/electric): ");
        fuelType = sc.nextLine();
    }

    @Override
    public void updateVehicle() {
        super.updateVehicle();
        System.out.print("Enter new Number Of Seats: ");
        numberOfSeats = Integer.parseInt(sc.nextLine());
        System.out.print("Enter new Fuel Type: ");
        fuelType = sc.nextLine();
    }

    @Override
    public void displayDetails() {
        System.out.println("----- Car -----");
        System.out.println("ID: " + id);
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Price Per Day: " + rentalPricePerDay);
        System.out.println("Seats: " + numberOfSeats);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Total Cost: " + (rentalDays * rentalPricePerDay));
    }
}
