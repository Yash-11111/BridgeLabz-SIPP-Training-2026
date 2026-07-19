import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {

    public static int[] nextBusierDay(int[] visitors) {

        int n = visitors.length;

        int[] answer = new int[n];

        Arrays.fill(answer, -1);

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {

            while (!stack.isEmpty() && visitors[i] > visitors[stack.peek()]) {
                answer[stack.pop()] = visitors[i];
            }

            stack.push(i);
        }

        return answer;
    }

    public static void main(String[] args) {

        int[] visitors = {4, 5, 2, 10, 8};

        System.out.println("Visitor Counts:");
        System.out.println(Arrays.toString(visitors));

        int[] ans = nextBusierDay(visitors);

        System.out.println("Next Greater Elements:");
        System.out.println(Arrays.toString(ans));
    }
}