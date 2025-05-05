package problems.array;

import java.util.HashMap;

public class LC1920 {
    public static boolean checkIfPangram(String sentence) {
        HashMap<Character, Integer> freq = new HashMap<>();

        for (char c : sentence.toCharArray()) {
            Integer currentCount = freq.get(c);
            if (currentCount == null) {
                currentCount = 0;
            } else {
                currentCount = freq.get(c) + 1;
                freq.put(c, currentCount);
            }

        }

        for (HashMap.Entry<Character, Integer> entry : freq.entrySet()) {
            if (entry.getValue() < 1) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(sentence));
    }
}
