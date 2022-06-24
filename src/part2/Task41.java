/**
 * Проверка ссылок на null и выбрасывание собственного исключения NullPointerException.
 * Написать программу, которая выполняет проверку заданных ссылок на null и выбрасывает исключение NullPointerException со специализированными сообщениями.
 */


package part2;

import java.util.Objects;

public class Task41 {
    public static void main(String[] args) {
        Task41 task41 = new Task41(null, null);
        System.out.println(task41);
    }
    private final String field1;
    private final String field2;

    public Task41(String field1, String field2) {
        this.field1 = Objects.requireNonNull(field1, "Field1 cannot be null");
        this.field2 = Objects.requireNonNull(field2, "Field1 cannot be null");
    }
}
