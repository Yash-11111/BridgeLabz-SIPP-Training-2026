interface TextModeration {

    boolean checkText(String post);

    default void displayModerationPolicy() {
        System.out.println("Policy: Offensive language is prohibited.");
    }

    static boolean containsRestrictedWords(String post) {

        String text = post.toLowerCase();

        return text.contains("bad") ||
               text.contains("hate") ||
               text.contains("abuse");
    }
}

interface SpamDetection {

    boolean checkSpam(String post);

    default void displayModerationPolicy() {
        System.out.println("Policy: Spam messages are prohibited.");
    }
}

class ContentModerator implements TextModeration, SpamDetection {

    @Override
    public boolean checkText(String post) {
        return TextModeration.containsRestrictedWords(post);
    }

    @Override
    public boolean checkSpam(String post) {

        String text = post.toLowerCase();

        return text.contains("buy now") ||
               text.contains("free") ||
               text.contains("click here");
    }

    // Resolve default method conflict
    @Override
    public void displayModerationPolicy() {
        System.out.println("Policy: No Spam and No Offensive Content.");
    }
}

public class ModerationSystem {

    public static void main(String[] args) {

        String[] posts = {

                "Buy now and get free gifts!",
                "I hate everyone.",
                "Good Morning Friends.",
                "Click here for free rewards.",
                "Have a nice day."
        };

        ContentModerator moderator = new ContentModerator();

        moderator.displayModerationPolicy();

        System.out.println();

        for (String post : posts) {

            if (moderator.checkSpam(post))
                System.out.println(post + " --> Spam Post");

            else if (moderator.checkText(post))
                System.out.println(post + " --> Offensive Post");

            else
                System.out.println(post + " --> Valid Post");
        }
    }
}
