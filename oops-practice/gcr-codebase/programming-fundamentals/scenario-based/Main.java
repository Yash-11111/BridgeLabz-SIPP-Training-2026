package oops-practice.gcr-codebase.ScenarioBased;

public class Main {

    public static void main(String[] args) {

        Vehicle[] fleet = {
                new Car(),
                new Bus(),
                new Bike(),
                new ElectricCar()
        };

        for (Vehicle v : fleet) {
            System.out.println(
                    v.getClass().getSimpleName() +
                    " cost for 100 km: " +
                    v.fuelCost(100)
            );
        }
    }
}