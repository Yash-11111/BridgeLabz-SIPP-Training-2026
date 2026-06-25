package oops-practice.gcr-codebase.ScenarioBased;
public class Bus extends Vehicle {

    @Override
    public double fuelCost(double km) {
        return km * 0.5;
    }
}