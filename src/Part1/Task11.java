/**
 * Проверка, что строка является палиндромом.
 * Написать программу, которая выясняет, является ли данная строка палиндромом или нет.
 */

package Part1;

import java.util.ArrayDeque;
import java.util.Deque;

public class Task11 {
    public static void main(String[] args) {
        System.out.println(isPalindrome2("madam"));
        System.out.println(isPalindrome1("madam"));
    }

    public static boolean isPalindrome2(String str) {
        String newString = new StringBuilder(str).reverse().toString();
        return newString.equals(str);
    }

    public static boolean isPalindrome1(String str) {
        Deque<String> deque = new ArrayDeque<>();
        String[] chs = str.toLowerCase().split("");
        for (String s : chs) {
            deque.addFirst(s);
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (String s : deque) {
            stringBuilder.append(s);
        }
        return stringBuilder.toString().equals(str);
    }
}
