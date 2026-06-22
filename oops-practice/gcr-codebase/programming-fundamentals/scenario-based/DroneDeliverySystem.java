class Drone {
    
    private String droneId;
    private int batteryPercentage;

    static String companyName = "SkyLogistics";

    
    public Drone(String droneId, int batteryPercentage) {
        this.droneId = droneId; // using this keyword
        this.batteryPercentage = batteryPercentage;
    }

    
    public void startDelivery() {
        if (batteryPercentage > 20) {
            System.out.println("Drone " + droneId + " started delivery.");
        } else {
            System.out.println("Drone " + droneId + " has low battery. Cannot start delivery.");
        }
    }

    
    public void displayStatus() {
        System.out.println("Company Name: " + companyName);
        System.out.println("Drone ID: " + droneId);
        System.out.println("Battery Percentage: " + batteryPercentage + "%");
        System.out.println();
    }
}

public class DroneDeliverySystem {
    public static void main(String[] args) {

        // Creating multiple drones
        Drone d1 = new Drone("D101", 85);
        Drone d2 = new Drone("D102", 15);
        Drone d3 = new Drone("D103", 60);

        // Display status
        d1.displayStatus();
        d2.displayStatus();
        d3.displayStatus();

        // Start delivery
        d1.startDelivery();
        d2.startDelivery();
        d3.startDelivery();

        // Verify shared company name
        System.out.println("\nShared Company Name:");
        System.out.println("Drone 1 Company: " + Drone.companyName);
        System.out.println("Drone 2 Company: " + Drone.companyName);
        System.out.println("Drone 3 Company: " + Drone.companyName);
    }
}