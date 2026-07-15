abstract class Vehicle {

    private String vehicleNumber;
    private String vehicleType;

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    abstract double calculateRentalCost(int days);

    public void displayVehicleInfo() {
        System.out.println("Vehicle Number : " + vehicleNumber);
        System.out.println("Vehicle Type : " + vehicleType);
    }
}

// Car
class Car extends Vehicle {

    private double dailyRate;

    public double getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }

    @Override
    double calculateRentalCost(int days) {
        return days * dailyRate;
    }
}

// Bike
class Bike extends Vehicle {

    private double dailyRate;

    public double getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }

    @Override
    double calculateRentalCost(int days) {
        return days * dailyRate;
    }
}

// Truck
class Truck extends Vehicle {

    private double dailyRate;
    private double loadingCharge;

    public double getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }

    public double getLoadingCharge() {
        return loadingCharge;
    }

    public void setLoadingCharge(double loadingCharge) {
        this.loadingCharge = loadingCharge;
    }

    @Override
    double calculateRentalCost(int days) {
        return (days * dailyRate) + loadingCharge;
    }
}

public class VehicleRentalSystem {

    public static void main(String[] args) {

        Car c = new Car();
        c.setVehicleNumber("UP32AB1234");
        c.setVehicleType("Car");
        c.setDailyRate(1500);

        Bike b = new Bike();
        b.setVehicleNumber("UP32XY5678");
        b.setVehicleType("Bike");
        b.setDailyRate(500);

        Truck t = new Truck();
        t.setVehicleNumber("UP32TR1111");
        t.setVehicleType("Truck");
        t.setDailyRate(3000);
        t.setLoadingCharge(2000);

        int days = 5;

        System.out.println("Car");
        c.displayVehicleInfo();
        System.out.println("Rental Cost : " + c.calculateRentalCost(days));

        System.out.println();

        System.out.println("Bike");
        b.displayVehicleInfo();
        System.out.println("Rental Cost : " + b.calculateRentalCost(days));

        System.out.println();

        System.out.println("Truck");
        t.displayVehicleInfo();
        System.out.println("Rental Cost : " + t.calculateRentalCost(days));
    }
}