package Exercise122_OOP_Vehicle;

import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VehicleList list = new VehicleList();
        int choice;

        do {
            System.out.println("\n===== VEHICLE MANAGEMENT =====");
            System.out.println("1. Add Car");
            System.out.println("2. Add Truck");
            System.out.println("3. Update Vehicle by ID");
            System.out.println("4. Delete Vehicle by ID");
            System.out.println("5. Find Vehicle by ID");
            System.out.println("6. Display All Vehicles");
            System.out.println("0. Exit");
            System.out.print("Choose: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    Car car = new Car();
                    car.addVehicle();
                    list.addVehicle(car);
                    break;

                case 2:
                    Truck truck = new Truck();
                    truck.addVehicle();
                    list.addVehicle(truck);
                    break;

                case 3:
                    System.out.print("Enter ID to update: ");
                    String updateId = sc.nextLine();
                    if (!list.updateVehicleById(updateId)) {
                        System.out.println("Vehicle not found!");
                    }
                    break;

                case 4:
                    System.out.print("Enter ID to delete: ");
                    String deleteId = sc.nextLine();
                    if (!list.deleteVehicleById(deleteId)) {
                        System.out.println("Vehicle not found!");
                    }
                    break;

                case 5:
                    System.out.print("Enter ID to find: ");
                    String findId = sc.nextLine();
                    Vehicle v = list.findVehicleById(findId);
                    if (v != null) {
                        v.displayDetails();
                    } else {
                        System.out.println("Vehicle not found!");
                    }
                    break;

                case 6:
                    list.displayAllVehicles();
                    break;
            }
        } while (choice != 0);
    }
}
