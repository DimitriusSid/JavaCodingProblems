/**
 * Отыскание символа с наибольшим числом появлений.
 * Написать программу, которая отыскивает символ с наибольшим числом появлений в заданной строке.
 */


package part1;

import java.util.HashMap;
import java.util.Map;

public class Task14 {
    public static void main(String[] args) {
        System.out.println(findTheMostAppearingCharacter("aavvcceeee"));
    }

    public static char findTheMostAppearingCharacter(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        char[] chars = str.toCharArray();
        int count = 1;
        for (char ch : chars) {
            if (map.containsKey(ch)) {
                map.replace(ch, map.get(ch) + 1);
            } else {
                map.put(ch, count);
            }
        }

        int maxValue = 0;
        char key = 0;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (maxValue < entry.getValue()) {
                maxValue = entry.getValue();
                key = entry.getKey();
            }
        }
        return key;
    }
}
