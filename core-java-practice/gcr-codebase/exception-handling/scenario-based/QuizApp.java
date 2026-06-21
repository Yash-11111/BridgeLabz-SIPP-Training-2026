public class QuizApp {

    static void checkAnswers(String[] answers) {
        for (int i = 0; i < answers.length; i++) {
            try {
                if (answers[i].equals("A")) {
                    System.out.println("Answer " + i + " is correct.");
                }
            }
            catch (NullPointerException e) {
                System.out.println("Answer at index " + i + " is null.");
            }
        }

        try {
            System.out.println(answers[5].equals("A"));
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid answer index!");
        }
    }

    public static void main(String[] args) {
        String answers[] = {"A", "B", "C", "D"};
        checkAnswers(answers);
    }
}