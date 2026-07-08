import java.util.*;

public class ClassroomAttendanceTracker {

    static HashMap<String, ArrayList<String>> attendance = new HashMap<>();
    static Scanner sc = new Scanner(System.in);

    static void markAttendance() {

        System.out.print("Enter Subject: ");
        String subject = sc.nextLine();

        System.out.print("Enter Student Name: ");
        String student = sc.nextLine();

        attendance.putIfAbsent(subject, new ArrayList<>());

        ArrayList<String> students = attendance.get(subject);

        if (students.contains(student)) {
            System.out.println("Attendance Already Marked.");
        } else {
            students.add(student);
            System.out.println("Attendance Marked Successfully.");
        }
    }

    static void displayAttendance() {

        if (attendance.isEmpty()) {
            System.out.println("No Attendance Records.");
            return;
        }

        System.out.println("\n===== Attendance Report =====");

        for (String subject : attendance.keySet()) {

            ArrayList<String> students = attendance.get(subject);

            System.out.println("\nSubject: " + subject);

            for (String student : students) {
                System.out.println(student);
            }

            System.out.println("Total Students Present: " + students.size());
        }
    }

    public static void main(String[] args) {

        while (true) {

            System.out.println("\n===== Smart Classroom Attendance Tracker =====");
            System.out.println("1. Mark Attendance");
            System.out.println("2. Display Attendance");
            System.out.println("3. Exit");

            System.out.print("Enter Choice: ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {

                case 1:
                    markAttendance();
                    break;

                case 2:
                    displayAttendance();
                    break;

                case 3:
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}