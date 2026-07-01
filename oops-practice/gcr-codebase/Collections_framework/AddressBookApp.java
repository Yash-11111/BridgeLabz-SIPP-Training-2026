import java.util.*;

class Contact {
    String name;
    String phone;
    String email;

    Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Name : " + name +
                "\nPhone: " + phone +
                "\nEmail: " + email;
    }
}

public class AddressBookApp {

    static ArrayList<Contact> contacts = new ArrayList<>();
    static HashMap<String, Contact> map = new HashMap<>();
    static HashSet<String> phoneSet = new HashSet<>();

    static Scanner sc = new Scanner(System.in);

    static void addContact() {

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Phone: ");
        String phone = sc.nextLine();

        if (phoneSet.contains(phone)) {
            System.out.println("Duplicate phone number! Contact not added.");
            return;
        }

        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        Contact c = new Contact(name, phone, email);

        contacts.add(c);
        map.put(name, c);
        phoneSet.add(phone);

        System.out.println("Contact Added Successfully.");
    }

    static void searchContact() {

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        if (map.containsKey(name)) {
            System.out.println(map.get(name));
        } else {
            System.out.println("Contact Not Found.");
        }
    }

    static void deleteContact() {

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        Contact c = map.get(name);

        if (c == null) {
            System.out.println("Contact Not Found.");
            return;
        }

        contacts.remove(c);
        map.remove(name);
        phoneSet.remove(c.phone);

        System.out.println("Contact Deleted.");
    }

    static void displayContacts() {

        Collections.sort(contacts, (a, b) -> a.name.compareToIgnoreCase(b.name));

        System.out.println("\n----- Address Book -----");

        for (Contact c : contacts) {
            System.out.println(c);
            System.out.println("-------------------");
        }
    }

    public static void main(String[] args) {

        while (true) {

            System.out.println("\n1.Add Contact");
            System.out.println("2.Search Contact");
            System.out.println("3.Delete Contact");
            System.out.println("4.Display Contacts");
            System.out.println("5.Exit");

            System.out.print("Choice: ");
            int ch = Integer.parseInt(sc.nextLine());

            switch (ch) {

                case 1:
                    addContact();
                    break;

                case 2:
                    searchContact();
                    break;

                case 3:
                    deleteContact();
                    break;

                case 4:
                    displayContacts();
                    break;

                case 5:
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}