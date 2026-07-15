package oops-practice.gcr-codebase.ScenarioBased;
public class Bike extends Vehicle {

    @Override
    public double fuelCost(double km) {
        return km * 0.05;
    }
}