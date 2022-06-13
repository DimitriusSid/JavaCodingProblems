/**
 * Генерирование всех перестановок.
 * Написать программу, которая генерирует все перестановки заданной строки.
 */

package Part1;

import java.util.HashSet;
import java.util.Set;

public class Task10 {
    public static void main(String[] args) {
        System.out.println(solution("", "ABC"));
    }

    public static Set<String> solution(String prefix, String s) {
        Set<String> variants = new HashSet<>();
        int n = s.length();
        if (n == 0) {
            variants.add(prefix);
        } else {
            for (int i = 0; i < n; i++) {
                variants.addAll(solution(prefix + s.charAt(i), s.substring(i + 1, n) + s.substring(0, i)));
            }
        }
        return variants;
    }
}
