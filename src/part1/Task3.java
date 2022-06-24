/**
 * Инвертирование букв и слов.
 * Написать программу, которая инвертирует буквы каждого слова, и программу,
 * которая инвертирует буквы каждого слова и сами слова
 */


package part1;

import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        System.out.println(inversionV1("Victoria"));
        System.out.println(inversionV2("Victoria"));
    }

    public static String inversionV2(String string) {
        StringBuilder stringBuilder = new StringBuilder(string);
        return stringBuilder.reverse().toString();

    }

    public static String inversionV1(String string) {
        String[] elements = string.split("");
        Deque<String> deque = new ArrayDeque<>();
        for (String el : elements) {
            deque.addFirst(el);
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (String str : deque) {
            stringBuilder.append(str);
        }
        return stringBuilder.toString();
    }

}
