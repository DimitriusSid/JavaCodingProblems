/**
 * Проверка, содержит ли строковое значение только цифры.
 * Написать программу, которая проверяет, что заданная строка содержит только цифры.
 */


package Part1;

public class Task4 {
    public static void main(String[] args) {
        System.out.println(hasOnlyNumbersV1("123"));
        System.out.println(hasOnlyNumbersV2("2321"));
    }


    public static boolean hasOnlyNumbersV2(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }


    public static boolean hasOnlyNumbersV1(String str) {
        try {
            Integer.valueOf(str);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

}
