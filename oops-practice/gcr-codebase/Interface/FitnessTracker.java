interface Trackable {

    void logActivity();

    default void resetData() {
        System.out.println("Fitness data has been reset.");
    }
}

interface Reportable {
    void generateReport();
}

interface Notifiable {
    void sendAlert();
}

class FitnessDevice implements Trackable, Reportable, Notifiable {

    @Override
    public void logActivity() {
        System.out.println("Activity Logged: 5000 Steps");
    }

    @Override
    public void generateReport() {
        System.out.println("Fitness Report Generated");
    }

    @Override
    public void sendAlert() {
        System.out.println("Alert: Drink Water!");
    }
}

public class FitnessTracker {
    public static void main(String[] args) {

        FitnessDevice device = new FitnessDevice();

        device.logActivity();
        device.generateReport();
        device.sendAlert();
        device.resetData();

        // Java supports multiple interface implementation
        // but does NOT support multiple class inheritance.
    }
}
