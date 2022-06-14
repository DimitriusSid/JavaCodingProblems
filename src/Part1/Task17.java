/**
 * Подсчет числа появлений подстроки в строке.
 * Написать программу, которая подсчитывает число появлений заданной строки в другой заданной строке.
 */

package Part1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task17 {
    public static void main(String[] args) {
        System.out.println(countOfAppearanceOfSubstringInString1("111", "11"));
        System.out.println(countOfAppearanceOfSubstringInString2("111", "11"));
    }

    public static int countOfAppearanceOfSubstringInString1(String string, String substring) {
        int result = string.split(Pattern.quote(substring), -1).length - 1;
        return result < 0 ? 0 : result;
    }

    public static int countOfAppearanceOfSubstringInString2(String string, String substring) {
        Pattern pattern = Pattern.compile(Pattern.quote(substring));
        Matcher matcher = pattern.matcher(string);

        int position = 0;
        int count = 0;

        while (matcher.find(position)) {
            position = matcher.start() + 1;
            count++;
        }
        return count;
    }
}
