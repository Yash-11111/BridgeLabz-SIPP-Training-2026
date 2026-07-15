import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number1: ");
        double a = sc.nextDouble();

        System.out.print("Enter number2: ");
        double b = sc.nextDouble();

        double add = a + b;
        double sub = a - b;
        double mul = a * b;

        if (number2 != 0) {
            double div = a / b;
            System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers "
                    + a + " and " + b + " is "
                    + add + ", " + sub + ", " + mul + ", and " + div);
        } else {
            System.out.println("Division not possible (division by zero)");
        }
    }
}