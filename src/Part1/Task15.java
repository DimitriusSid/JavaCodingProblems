/**
 * Сортировка массива строк по длине.
 * Написать программу, которая сортирует заданный массив по длине строк
 */

package Part1;

import java.util.Arrays;
import java.util.Comparator;

public class Task15 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortArrayByStringLength(new String[] {"abc", "a", "bc"})));

    }

    public static String[] sortArrayByStringLength(String[] strings) {
        Arrays.sort(strings, Comparator.comparingInt(String::length));
        return strings;
    }

}
