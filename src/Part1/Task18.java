/**
 * Проверка, являются ли две строки анаграммами.
 * Написать программу, которая проверяет, являются ли две строки анаграммами.
 * Учесть, что анаграммой строки является строка, образованная перестановкой букв в обратном порядке с игнорированием заглавных букв и пробелов.
 */

package Part1;


import java.util.Arrays;

public class Task18 {
    public static void main(String[] args) {
        System.out.println(areStringAnagrams("abc",  "cba"));
    }

    public static boolean areStringAnagrams(String st1, String st2) {
        st1 = st1.replaceAll(" ", "").toLowerCase();
        st2 = st2.replaceAll(" ", "").toLowerCase();
        char[] chars1 = st1.toCharArray();
        char[] chars2 = st2.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        return Arrays.equals(chars1, chars2);
    }
}
