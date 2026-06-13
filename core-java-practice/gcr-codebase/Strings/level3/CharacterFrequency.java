import java.util.Scanner;

public class CharacterFrequency {

    public static String[][] findFrequency(
            String text) {

        int[] frequency = new int[256];

        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }

        String[][] result = new String[text.length()][2];

        int index = 0;

        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            boolean alreadyAdded = false;

            for (int j = 0; j < index; j++) {

                if (result[j][0].equals(
                        String.valueOf(ch))) {

                    alreadyAdded = true;
                    break;
                }
            }

            if (!alreadyAdded) {

                result[index][0] = String.valueOf(ch);

                result[index][1] = String.valueOf( frequency[ch]);

                index++;
            }
        }

        String[][] finalResult = new String[index][2];

        for (int i = 0; i < index; i++) {

            finalResult[i][0] = result[i][0];

            finalResult[i][1] = result[i][1];
        }

        return finalResult;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[][] frequency = findFrequency(text);

        System.out.println("\nCharacter\tFrequency");

        for (int i = 0; i < frequency.length; i++) {

            System.out.println(frequency[i][0] + "\t\t" + frequency[i][1]);
        }
    }
}