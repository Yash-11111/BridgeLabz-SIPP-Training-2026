import java.util.HashSet;
import java.util.Set;

public class DuplicateTokenDetection {

    public static boolean hasDuplicateToken(String[] tokens) {

        Set<String> seen = new HashSet<>();

        for (String token : tokens) {

            if (!seen.add(token)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        String[] tokens = {
                "A123",
                "B456",
                "C789",
                "A123",
                "D890"
        };

        if (hasDuplicateToken(tokens)) {
            System.out.println("Duplicate Token Found");
        } else {
            System.out.println("No Duplicate Token");
        }
    }
}