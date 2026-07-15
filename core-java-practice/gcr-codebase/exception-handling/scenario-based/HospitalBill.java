
public class HospitalBill {

    // Custom Exception
    static class InsufficientFundsException extends Exception {
        public InsufficientFundsException(String message) {
            super(message);
        }
    }

    static void calAvgBill(int totalBill, int items) {
        try {
            int avg = totalBill / items;
            System.out.println("Avg bill for items: " + avg);
        } catch (ArithmeticException e) {
            System.out.println("Error: Number of bill items cannot be zero.");
        }
    }

    static void getPatient(String[] patients, int index) {
        try {
            System.out.println("Patient Name: " + patients[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid patient index.");
        }
    }

    static void input(String input) {
        try {
            int value = Integer.parseInt(input);
            System.out.println("Entered value: " + value);
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter a valid number.");
        }
    }

    static void paymentCheck(double billAmount, double payment)
            throws InsufficientFundsException {

        if (payment < billAmount) {
            throw new InsufficientFundsException(
                    "Payment failed: Insufficient funds.");
        }

        System.out.println("Payment successful.");
    }

    public static void main(String[] args) {

        // Division by zero example
        calAvgBill(5000, 0);

        // Array out of bounds example
        String[] patients = {"Rahul", "Priya", "Aman"};
        getPatient(patients, 5);

        // Number format example
        input("ABC123");

        // Custom exception example
        try {
            paymentCheck(10000, 7000);
            
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }
}