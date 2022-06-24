/**
 * Подсчет появлений некоторого символа.
 * Написать программу, которая подсчитывает появления того или иного символа в заданной строке.
 */


package part1;

import java.util.HashMap;
import java.util.Map;

public class Task6 {
    public static void main(String[] args) {
        System.out.println(countOfTheCharacter("qwertyzz"));

    }

    public static Map<Character, Integer> countOfTheCharacter(String s) {
        Map<Character, Integer> map = new HashMap<>();
        char[] chars = s.toCharArray();
        int count = 1;
        for (char ch : chars) {
            if (map.containsKey(ch)) {
                map.replace(ch, count + 1);
            } else {
                map.put(ch, count);
            }
        }
        return map;
    }

}
