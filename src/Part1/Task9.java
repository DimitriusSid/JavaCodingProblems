/**
 * Соединение нескольких строк с помощью разделителя.
 * Написать программу, которая соединяет заданные строки с помощью заданного разделителя.
 */

package Part1;

import java.util.StringJoiner;

public class Task9 {
    public static void main(String[] args) {

    }

    public static String concatStrings2(char delimiter, String... s) {
        StringJoiner stringJoiner = new StringJoiner(String.valueOf(delimiter));
        for (String st : s) {
            stringJoiner.add(st);
        }
        return stringJoiner.toString();
    }

    public static String concatStrings1(char delimiter, String... s) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String st : s) {
            stringBuilder.append(st).append(delimiter);
        }
        return stringBuilder.toString();
    }
}
