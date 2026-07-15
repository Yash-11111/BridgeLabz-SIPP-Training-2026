public class PasswordChecker {

    static void checkPassword(String password) {

        try {

            if (password == null)
                throw new NullPointerException();

            if (password.isEmpty())
                System.out.println("Password cannot be empty.");

            else if (password.length() < 8)
                System.out.println("Password must contain at least 8 characters.");

            else if (!Character.isUpperCase(password.charAt(0)))
                System.out.println("First character must be uppercase.");

            else if (!Character.isDigit(password.charAt(password.length() - 1)))
                System.out.println("Last character must be a digit.");

            else if (!(password.contains("@") ||
                       password.contains("#") ||
                       password.contains("$") ||
                       password.contains("%") ||
                       password.contains("&") ||
                       password.contains("*")))
                System.out.println("Password must contain at least one special character.");

            else
                System.out.println("Strong password!");

        }

        catch (NullPointerException e) {
            System.out.println("Password cannot be null.");
        }
    }

    public static void main(String[] args) {

        checkPassword(null);
        checkPassword("");
        checkPassword("Abc12");
        checkPassword("abcdef@1");
        checkPassword("Abcdefgh@");
        checkPassword("Abcdefgh1");
        checkPassword("Abcdefgh@1");
    }
}