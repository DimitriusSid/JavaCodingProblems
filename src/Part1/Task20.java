/**
 * Конкатенирование одной и той же строки n раз.
 * Написать программу, которая конкатенирует одну и ту же строку заданное число раз
 */

package Part1;

public class Task20 {
    public static void main(String[] args) {
        System.out.println(concatStringNTimes1("a", 10));
        System.out.println(concatStringNTimes2("a", 10));
    }

    public static String concatStringNTimes1(String string, int n) {
        return string.repeat(n);
    }

    public static String concatStringNTimes2(String string, int n) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            stringBuilder.append(string);
        }
        return stringBuilder.toString();
    }
}
