/**
 * Подсчет гласных и согласных.
 * Написать программу, которая подсчитывает число гласных и согласных букв в заданной строке.
 * Сделать это для английского языка, который имеет пять гласных (а, е, i, o, u)
 */

package Part1;

import java.util.*;
import java.util.function.IntPredicate;

public class Task5 {

    private static final String A = "a";
    private static final String E = "e";
    private static final String I = "i";
    private static final String O = "o";
    private static final String U = "u";

    public static void main(String[] args) {
        System.out.println(countConsonantAndVowelLetters1("aabbcc"));
        System.out.println(countConsonantAndVowelLetters2("aabbcc"));

    }

    public static Map<Long, Long> countConsonantAndVowelLetters2(String s) {
        Map<Long, Long> map = new HashMap<>();
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        long vowelLetters = s.toLowerCase().chars()
                .filter(value -> vowels.contains((char) value))
                .count();
        long consonantLetters = s.toLowerCase().chars()
                .filter(value -> !vowels.contains((char) value))
                .filter(value -> value >= 'a' && value <= 'z')
                .count();
        map.put(vowelLetters, consonantLetters);
        return map;
    }


    public static Map<Integer, Integer> countConsonantAndVowelLetters1(String s) {
        Map<Integer, Integer> map = new HashMap<>();
        String[] letters = s.toLowerCase().split("");
        int consonantLetters = 0;
        int vowelLetters = 0;
        for (String str : letters) {
            char ch = str.charAt(0);
            if (str.equals(A) || str.equals(E) || str.equals(I) || str.equals(O) || str.equals(U)) {
                vowelLetters++;
            } else if (ch >= 'a' && ch <= 'z') {
                consonantLetters++;
            }
        }
        map.put(vowelLetters, consonantLetters);
        return map;
    }
}
