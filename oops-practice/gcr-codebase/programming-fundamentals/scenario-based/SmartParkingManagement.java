class Vehicle {
    String vehicleNumber;
    String ownerName;
    String vehicleType;


    Vehicle(String vehicleNumber, String ownerName, String vehicleType) {
        this.vehicleNumber = vehicleNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    void displayDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println();
    }
}

public class SmartParkingManagement {


    static void displayCars(Vehicle[] vehicles) {
        System.out.println( "Cars");
        for (Vehicle v : vehicles) {
            if (v != null && v.vehicleType.equalsIgnoreCase("Car")) {
                v.displayDetails();
            }
        }
    }


    static void displayBikes(Vehicle[] vehicles) {
        System.out.println("Bikes ");
        for (Vehicle v : vehicles) {
            if (v != null && v.vehicleType.equalsIgnoreCase("Bike")) {
                v.displayDetails();
            }
        }
    }

    public static void main(String[] args) {

        // Array to store 10 vehicles
        Vehicle[] vehicles = new Vehicle[10];

        vehicles[0] = new Vehicle("UP81AB1234", "Rahul", "Car");
        vehicles[1] = new Vehicle("UP81CD5678", "Amit", "Bike");
        vehicles[2] = new Vehicle("DL01EF1111", "Priya", "Car");
        vehicles[3] = new Vehicle("DL02GH2222", "Neha", "Bike");
        vehicles[4] = new Vehicle("UP32IJ3333", "Rohan", "Car");
        vehicles[5] = new Vehicle("UP32KL4444", "Ankit", "Bike");
        vehicles[6] = new Vehicle("HR26MN5555", "Karan", "Car");
        vehicles[7] = new Vehicle("HR26OP6666", "Sonia", "Bike");
        vehicles[8] = new Vehicle("RJ14QR7777", "Vikas", "Car");
        vehicles[9] = new Vehicle("RJ14ST8888", "Pooja", "Bike");

        displayCars(vehicles);
        displayBikes(vehicles);
    }
}