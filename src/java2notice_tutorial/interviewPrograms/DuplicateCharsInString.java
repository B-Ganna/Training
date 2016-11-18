package java2notice_tutorial.interviewPrograms;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharsInString {
    public void findDuplicateChars(String str) {
        Map<Character, Integer> dupMap = new HashMap<>();
        char[] chars = str.toCharArray();
        for (Character ch : chars) {
            if (dupMap.containsKey(ch)) {
                dupMap.put(ch, dupMap.get(ch) + 1);
            } else {
                dupMap.put(ch, 1);
            }
        }
        Set<Character> keys = dupMap.keySet();
        for (Character ch : keys) {
            if (dupMap.get(ch) > 1) {
                System.out.println(ch + " ---> " + dupMap.get(ch));
            }
        }
    }


    public static void main(String[] args) {
        DuplicateCharsInString dhs = new DuplicateCharsInString();
        dhs.findDuplicateChars("java2novice");
    }
}


