/**
 * Конвертирование строки в значение типа int, long, float или double.
 * Написать программу, которая конвертирует заданный объект типа string (представляющий число) в значение типа int, long, float или double
 */

package part1;

public class Task7 {
    public static void main(String[] args) {

    }

    public static int convertToInt(String s) {
        return Integer.parseInt(s);
    }

    public static long convertToLong(String s) {
        return Long.parseLong(s);
    }

    public static float convertToFloat(String s) {
        return Float.parseFloat(s);
    }

    public static double convertToDouble(String s) {
        return Double.parseDouble(s);
    }

}
