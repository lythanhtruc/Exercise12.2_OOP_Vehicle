package Exercise122_OOP_Vehicle;

import java.util.ArrayList;

public class VehicleList {

    private ArrayList<Vehicle> vehicleList = new ArrayList<>();

    public void addVehicle(Vehicle vehicle) {
        vehicleList.add(vehicle);
    }

    public boolean updateVehicleById(String id) {
        for (Vehicle v : vehicleList) {
            if (v.getId().equalsIgnoreCase(id)) {
                v.updateVehicle();
                return true;
            }
        }
        return false;
    }

    public boolean deleteVehicleById(String id) {
        return vehicleList.removeIf(v -> v.getId().equalsIgnoreCase(id));
    }

    public Vehicle findVehicleById(String id) {
        for (Vehicle v : vehicleList) {
            if (v.getId().equalsIgnoreCase(id)) {
                return v;
            }
        }
        return null;
    }

    public void displayAllVehicles() {
        for (Vehicle v : vehicleList) {
            v.displayDetails();
            System.out.println("--------------------");
        }
    }
}
