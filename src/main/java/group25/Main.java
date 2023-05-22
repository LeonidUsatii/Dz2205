package group25;
/*
        Задание 1
        Создайте абстрактный класс StringTools, со статическими методами:

        String FirstToUpperCase(String str);
        Данный метод должен возвращать новую строку, в которой первый символ возведен в верхний регистр.
        Например, FirstToUpperCase("apple") -> "apple';

        boolean isStartingFromCapital(String str); Данный метод должен показывать,
        начинается ли строка с большой буквы. Например, isStartingFromCapital("Apple") -> true;
        isStartingFromCapital("apple") -> false;

        Напишите тесты для данных методов.
 */

public class Main {
    public static void main(String[] args) {
        System.out.println(StringTools.FirstToUpperCase("apple"));
        System.out.println(StringTools.isStartingFromCapital("Apple"));
    }
}