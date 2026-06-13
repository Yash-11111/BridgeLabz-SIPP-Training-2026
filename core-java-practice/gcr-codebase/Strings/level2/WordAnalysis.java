import java.util.Scanner;

public class WordAnalysis {

    public static String[] splitWords(String text) {

        String[] words = new String[100];
        int index = 0;
        String word = "";

        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            if (ch != ' ') {
                word += ch;
            } else {
                if (!word.equals("")) {
                    words[index++] = word;
                    word = "";
                }
            }
        }

        if (!word.equals("")) {
            words[index++] = word;
        }

        String[] result = new String[index];

        for (int i = 0; i < index; i++) {
            result[i] = words[i];
        }

        return result;
    }

    public static int findLength(String str) {

        int count = 0;

        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }

        return count;
    }

    public static String[][] getWordLengths(String[] words) {

        String[][] data = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {

            data[i][0] = words[i];
            data[i][1] =
                    String.valueOf(findLength(words[i]));
        }

        return data;
    }

    public static int[] findShortestLongest(
            String[][] data) {

        int shortest = 0;
        int longest = 0;

        for (int i = 1; i < data.length; i++) {

            int len =
                    Integer.parseInt(data[i][1]);

            int shortestLen =
                    Integer.parseInt(data[shortest][1]);

            int longestLen =
                    Integer.parseInt(data[longest][1]);

            if (len < shortestLen)
                shortest = i;

            if (len > longestLen)
                longest = i;
        }

        return new int[]{shortest, longest};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] words = splitWords(text);

        String[][] data = getWordLengths(words);

        int[] result =
                findShortestLongest(data);

        System.out.println("\nWord\tLength");

        for (int i = 0; i < data.length; i++) {
            System.out.println(
                    data[i][0] + "\t" + data[i][1]);
        }

        System.out.println(
                "\nShortest Word : "
                        + data[result[0]][0]);

        System.out.println(
                "Longest Word : "
                        + data[result[1]][0]);
    }
}