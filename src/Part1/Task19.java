/**
 * Объявление многострочных строковых литералов (или текстовых блоков).
 * Написать программу, которая объявляет многострочные строковые литералы или текстовые блоки
 */

package Part1;

public class Task19 {
    public static void main(String[] args) {
        String text = """
                qwerty
                zxcvbn
                qwerty1
                zxcbn1.
                """;

        String LS = System.lineSeparator();
        String text1 = String.join(LS, "Abc", "qwert");
        System.out.println(text1);

    }
}
