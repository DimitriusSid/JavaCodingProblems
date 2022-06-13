/**
 * Удаление заданного символа.
 * Написать программу, которая удаляет заданный символ из заданной строки.
 */


package Part1;

import java.util.regex.Pattern;

public class Task13 {
    public static void main(String[] args) {
        System.out.println(deleteGivenCharacter1("ABCDEE", 'E'));
        System.out.println(deleteGivenCharacter2("ABCDEE", 'E'));
    }

    public static String deleteGivenCharacter2(String str, char charToBeDeleted) {
        return str.replaceAll(Pattern.quote(String.valueOf(charToBeDeleted)), "");
    }

    public static String deleteGivenCharacter1(String str, char charToBeDeleted) {
        char[] chs = str.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (char ch : chs) {
           if (ch != charToBeDeleted) {
               stringBuilder.append(ch);
           }
        }
        return stringBuilder.toString();
    }
}
