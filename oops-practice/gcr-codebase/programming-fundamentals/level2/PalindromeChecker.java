class PalindromeChecker {
    String text;

    PalindromeChecker(String text) {
        this.text = text;
    }

    boolean isPalindrome() {
        String reversed = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            reversed += text.charAt(i);
        }

        return text.equalsIgnoreCase(reversed);
    }

    void displayResult() {
        if (isPalindrome()) {
            System.out.println(text + " is a Palindrome.");
        } else {
            System.out.println(text + " is not a Palindrome.");
        }
    }

    public static void main(String[] args) {
        PalindromeChecker p = new PalindromeChecker("Madam");
        p.displayResult();
    }
}