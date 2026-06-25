package oops-practice.gcr-codebase.ScenarioBased;


public class Car extends Vehicle {

    @Override
    public double fuelCost(double km) {
        return km * 0.12;
    }
}