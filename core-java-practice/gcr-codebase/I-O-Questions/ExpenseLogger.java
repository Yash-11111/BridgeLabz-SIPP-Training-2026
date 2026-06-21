import java.io.*;
import java.util.*;

public class ExpenseLogger {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        FileWriter fw = new FileWriter("expenses.txt", true); // append mode

        System.out.print("Enter category: ");
        String category = sc.nextLine();

        System.out.print("Enter amount: ");
        int amount = sc.nextInt();

        fw.write(category + " - " + amount + "\n");

        fw.close();

        System.out.println("Expense saved successfully.");
        sc.close();
    }
}