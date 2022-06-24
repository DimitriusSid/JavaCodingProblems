/**
 * Отыскание наибольшего общего префикса.
 * Написать программу, которая отыскивает наибольший общий префикс заданных строк
 */

package part1;

public class Task22 {
    public static void main(String[] args) {

    }

    public static String longestCommonPrefix(String... strings) {
        if (strings.length == 1) {
            return strings[0];
        }

        int firstLength = strings[0].length();

        for (int prefixLength = 0; prefixLength < firstLength; prefixLength++) {
            char ch = strings[0].charAt(prefixLength);
            for (int i = 1; i < strings.length; i++) {
                if (prefixLength >= strings[i].length() || strings[i].charAt(prefixLength) != ch) {
                    return strings[i].substring(0, prefixLength);
                }
            }
        }
        return strings[0];
    }
}
