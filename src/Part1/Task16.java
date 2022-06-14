/**
 * Проверка наличия подстроки в строке.
 * Написать программу, которая проверяет, содержит ли заданная строка заданную подстроку.
 */

package Part1;

import java.util.Arrays;

public class Task16 {
    public static void main(String[] args) {
        System.out.println(checkSubstringInString("Hello world", "wor"));
    }

    public static boolean checkSubstringInString(String string, String substring) {
         return string.contains(substring);
    }

}
