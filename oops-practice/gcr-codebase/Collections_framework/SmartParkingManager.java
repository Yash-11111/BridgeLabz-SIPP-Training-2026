import java.util.*;

public class SmartParkingManager {

    static ArrayList<String> parking = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    static void addVehicle() {

        System.out.print("Enter Vehicle Number: ");
        String vehicle = sc.nextLine();

        if (parking.contains(vehicle)) {
            System.out.println("Vehicle already parked.");
            return;
        }

        parking.add(vehicle);

        System.out.println("Vehicle Entered Successfully.");
    }

    static void removeVehicle() {

        System.out.print("Enter Vehicle Number: ");
        String vehicle = sc.nextLine();

        if (parking.remove(vehicle)) {
            System.out.println("Vehicle Exited Successfully.");
        } else {
            System.out.println("Vehicle Not Found.");
        }
    }

    static void searchVehicle() {

        System.out.print("Enter Vehicle Number: ");
        String vehicle = sc.nextLine();

        if (parking.contains(vehicle))
            System.out.println("Vehicle is Currently Parked.");
        else
            System.out.println("Vehicle Not Found.");
    }

    static void displayVehicles() {

        System.out.println("\nParked Vehicles");

        if (parking.isEmpty()) {
            System.out.println("Parking is Empty.");
        } else {
            for (String v : parking)
                System.out.println(v);
        }

        System.out.println("Occupied Slots: " + parking.size());
    }

    public static void main(String[] args) {

        while (true) {

            System.out.println("\n1.Vehicle Entry");
            System.out.println("2.Vehicle Exit");
            System.out.println("3.Search Vehicle");
            System.out.println("4.Display Vehicles");
            System.out.println("5.Exit");

            System.out.print("Choice: ");
            int ch = Integer.parseInt(sc.nextLine());

            switch (ch) {

                case 1:
                    addVehicle();
                    break;

                case 2:
                    removeVehicle();
                    break;

                case 3:
                    searchVehicle();
                    break;

                case 4:
                    displayVehicles();
                    break;

                case 5:
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}