/**
 * Проверка ссылок на null в функциональном и императивном стилях программирования.
 * Написать программу, которая выполняет проверки заданных ссылок на null в функциональном и императивном стилях программирования
 */

package part2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Task40 {
    public static void main(String[] args) {

    }

    public static List<Integer> evenIntegers(List<Integer> integers) {
        if (Objects.isNull(integers)) {
            return Collections.EMPTY_LIST;
        }

        List<Integer> evens = new ArrayList<>();
        for (Integer n : integers) {
            evens.add(n);
        }
        return evens;
    }

    public static int sumIntegers(List<Integer> integers) {
        if (integers == null) {
            throw new IllegalArgumentException("List cannot be null");
        }
        return integers.stream().filter(Objects::nonNull).mapToInt(Integer::intValue).sum();
    }

    public static boolean integersContainsNulls(List<Integer> integers) {
        if (Objects.isNull(integers)) {
            return false;
        }
        return integers.stream().anyMatch(Objects::isNull);
    }
}
