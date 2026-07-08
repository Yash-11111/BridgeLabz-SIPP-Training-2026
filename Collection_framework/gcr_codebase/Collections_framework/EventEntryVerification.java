import java.util.*;

public class EventEntryVerification {

    static HashSet<String> participants = new HashSet<>();
    static Scanner sc = new Scanner(System.in);

    static void registerParticipant() {

        System.out.print("Enter Email ID: ");
        String email = sc.nextLine();

        if (participants.add(email)) {
            System.out.println("Registration Successful.");
        } else {
            System.out.println("Duplicate Registration! Entry Rejected.");
        }
    }

    static void displayParticipants() {

        System.out.println("\nRegistered Participants:");

        if (participants.isEmpty()) {
            System.out.println("No Participants Registered.");
        } else {
            for (String email : participants) {
                System.out.println(email);
            }
        }

        System.out.println("\nTotal Eligible Attendees: " + participants.size());
    }

    public static void main(String[] args) {

        while (true) {

            System.out.println("\n===== Event Entry Verification =====");
            System.out.println("1. Register Participant");
            System.out.println("2. Display Participants");
            System.out.println("3. Exit");

            System.out.print("Enter Choice: ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {

                case 1:
                    registerParticipant();
                    break;

                case 2:
                    displayParticipants();
                    break;

                case 3:
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}