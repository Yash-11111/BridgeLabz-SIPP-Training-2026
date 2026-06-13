import java.util.Scanner;

public class NumberFormatDemo {

    public static void generateException(String text) {

        int number = Integer.parseInt(text);
        System.out.println(number);
    }

    public static void handleException(String text) {

        try {

            int number = Integer.parseInt(text);
            System.out.println("Number = " + number);

        }
        catch (NumberFormatException e) {
            System.out.println("NumberFormatException Handled");
            System.out.println(e.getMessage());
        }
        catch (RuntimeException e) {
            System.out.println("RuntimeException Handled");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        try {
            generateException(text);
        }
        catch (Exception e) {
            System.out.println("Exception Generated and Caught in Main");
        }

        handleException(text);
    }
}