/**
 * Отыскание первого неповторяющегося символа.
 * Написать программу, которая возвращает первый неповторяющийся (некратный) символ в заданной строке.
 */

package part1;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(returnFirstNonRepeatableChar("111222333qweqwezasdq"));
    }

    public static Character returnFirstNonRepeatableChar(String str) {
        LinkedHashMap<Character, Integer> linkedHashMap = new LinkedHashMap<>();
        char[] chars = str.toCharArray();
        for (char ch : chars) {
            int i = 0;
            if (!linkedHashMap.containsKey(ch)) {
                linkedHashMap.put(ch, ++i);
            } else {
                linkedHashMap.replace(ch, linkedHashMap.get(ch) + 1);
            }
        }
        Set<Map.Entry<Character, Integer>> entries = linkedHashMap.entrySet();
        for (Map.Entry<Character, Integer> entry : entries) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return null;
    }
}
