/**
 * Удаление начальных и замыкающих пробелов.
 * Написать программу, которая удаляет начальные и замыкающие пробелы заданной строки
 */

package Part1;

public class Task21 {
    public static void main(String[] args) {
        System.out.println(removingLeadingAndTrailingSpaces1("  abc  "));
        System.out.println(removingLeadingAndTrailingSpaces2("  abc  "));
    }

    public static String removingLeadingAndTrailingSpaces1(String string) {
        return string.trim();
    }

    public static String removingLeadingAndTrailingSpaces2(String string) {
        return string.strip();
    }
}
