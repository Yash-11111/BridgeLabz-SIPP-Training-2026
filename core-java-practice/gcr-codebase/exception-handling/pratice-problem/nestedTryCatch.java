import java.util.Scanner;

public class nestedTryCatch {

    static void divideElement(int[] arr, int index, int divisor) {

        try {
            int value = arr[index];   // Outer try for array access

            try {
                int result = value / divisor;   // Inner try for division
                System.out.println("Result: " + result);
            }
            catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero!");
            }

        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {10, 20, 30, 40, 50};

        System.out.print("Enter index: ");
        int index = sc.nextInt();

        System.out.print("Enter divisor: ");
        int divisor = sc.nextInt();

        divideElement(arr, index, divisor);

        sc.close();
    }
}