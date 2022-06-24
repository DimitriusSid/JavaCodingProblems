/**
 * Подсчет повторяющихся символов.
 * Написать программу, которая подсчитывает повторяющиеся символы в заданной строке
 *
 */

package part1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {


    }

    /**
     * Solution 1
     */
    public static Map<Character, Integer> countDuplicateCharactersV1(String str) {
        Map<Character, Integer> result = new HashMap<>();
        char[] chars = str.toCharArray();
        for (char ch : chars) {
            if (!result.containsKey(ch)) {
                int n = 0;
                result.put(ch, ++n);
            } else {
                result.replace(ch, result.get(ch) + 1);
            }
        }
        return result;
    }

    /**
     * Solution 2
     */
    public static void countDuplicateCharactersV2(String str) {
        char[] chars = str.toCharArray();
        List<Character> list = new ArrayList<>();
        for (char ch : chars) {
            list.add(ch);
        }
        list = list.stream().sorted().collect(Collectors.toList());
        for (Character character : list) {
            int count = 0;
            for (Character character1 : list) {
                if (character.equals(character1)) {
                    count++;
                }
            }
            System.out.println(character + " = " + count);
        }
    }





}
