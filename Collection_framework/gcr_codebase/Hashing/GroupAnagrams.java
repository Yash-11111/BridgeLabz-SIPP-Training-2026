import java.util.*;

public class GroupAnagrams {

    public static List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> groups = new HashMap<>();

        for (String s : strs) {

            char[] chars = s.toCharArray();

            Arrays.sort(chars);

            String key = new String(chars);

            groups.computeIfAbsent(key,
                    x -> new ArrayList<>()).add(s);
        }

        return new ArrayList<>(groups.values());
    }

    public static void main(String[] args) {

        String[] words = {
                "eat",
                "tea",
                "tan",
                "ate",
                "nat",
                "bat"
        };

        List<List<String>> ans = groupAnagrams(words);

        for (List<String> group : ans) {
            System.out.println(group);
        }
    }
}