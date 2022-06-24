/**
 * Проверка индекса в интервале от 0 до длины.
 * Написать программу, которая проверяет, находится ли заданный индекс между 0 (включительно) и заданной длиной (исключительно).
 * Если заданный индекс находится вне интервала [0; заданной длины], ТО выбросить исключение IndexOutOfBoundsException.
 */

package part2;

import java.util.Objects;

public class Task44 {
    private final static int X_UPPER_BOUND = 11;
    private final static int Y_UPPER_BOUND = 16;
    private static int x;

    public static void main(String[] args) {
        x = 12;
        Objects.checkIndex(x, X_UPPER_BOUND);
    }
}
