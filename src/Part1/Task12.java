/**
 * Удаление повторяющихся символов.
 * Написать программу, которая удаляет повторяющиеся символы из заданной строки
 */

package Part1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;

public class Task12 {
    public static void main(String[] args) {
        System.out.println(removeDuplicateCharacters1("ABBCCADD"));
        System.out.println(removeDuplicateCharacters2("ABBCCADD"));
    }


    public static String removeDuplicateCharacters2(String str) {
        return Arrays.stream(str.split("")).distinct().collect(Collectors.joining());
    }

    public static String removeDuplicateCharacters1(String str) {
        String[] chs = str.split("");
        HashSet<String> set = new HashSet<>(Arrays.asList(chs));
        StringBuilder stringBuilder = new StringBuilder();
        for (String s : set) {
            stringBuilder.append(s);
        }
        return stringBuilder.toString();
    }
}
