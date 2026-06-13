import java.util.*;

public class UniqueCharacterFrequency {

    public static char[] uniqueCharacters(
            String text) {

        char[] unique = new char[text.length()];

        int count = 0;

        for (int i = 0; i < text.length(); i++) {

            char current = text.charAt(i);

            boolean found = false;

            for (int j = 0; j < count; j++) {

                if (unique[j] == current) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                unique[count++] = current;
            }
        }

        char[] result = new char[count];

        for (int i = 0; i < count; i++) {
            result[i] = unique[i];
        }

        return result;
    }

    public static String[][] frequencyTable(
            String text) {

        int[] frequency = new int[256];

        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }

        char[] unique =
                uniqueCharacters(text);

        String[][] result =
                new String[unique.length][2];

        for (int i = 0;
             i < unique.length; i++) {

            result[i][0] =
                    String.valueOf(unique[i]);

            result[i][1] =
                    String.valueOf(
                            frequency[unique[i]]);
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[][] result =
                frequencyTable(text);

        System.out.println(
                "\nCharacter\tFrequency");

        for (int i = 0;
             i < result.length; i++) {

            System.out.println(
                    result[i][0]
                            + "\t\t"
                            + result[i][1]);
        }
    }
}