package org.example.lambda;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaTask {
    public static void main(String[] args) {
//     1. Напишите лямбда-выражение, которое умножает каждый элемент списка на 2.
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Function<Integer, Integer> function = x -> x * 2;
        numbers.stream().map(function).forEach(x -> System.out.print(x + " "));
//     2. Напишите лямбда-выражение, которое находит сумму двух чисел.
        BinaryOperator<Integer> binaryOperator = (a, b) -> a + b;
        System.out.println(binaryOperator.apply(5, 7));
//     3. Напишите лямбда-выражение, которое возвращает True, если переданное число больше 10.
        Predicate<Integer> predicate = (x) -> x > 10;
        System.out.println(predicate.test(17));
//     4. Напишите лямбда-выражение, которое возвращает True, если переданная строка содержит более 5 символов.
        Predicate<String> predicate1 = (x) -> x.length() > 5;
        System.out.println(predicate1.test("Privet"));
        System.out.println(predicate1.test("PRIVEEETTT!"));
//     5. Напишите лямбда-выражение, которое возвращает длину переданной строки.
        Function<String, Integer> function1 = x -> x.length();
        System.out.println(function1.apply("Yasir"));
//     6. Напишите лямбда-выражение, которое возвращает квадрат переданного числа.
        Function<Integer, Integer> function2 = x -> x * x;
        System.out.println(function2.apply(5));
//     7. Напишите лямбда-выражение, которое возвращает сумму элементов списка.
        Function<List<Integer>, Integer> function3 = (x) -> x.stream().mapToInt(Integer::intValue).sum();
        System.out.println(function3.apply(List.of(1, 2, 3, 4, 5)));
//     8. Напишите лямбда-выражение, которое возвращает True, если переданная строка начинается с буквы "A".
        Predicate<String> predicate2 = x -> x.startsWith("A");
        System.out.println(predicate2.test("Mercedes"));
        System.out.println(predicate2.test("Audi"));
//     9. Напишите лямбда-выражение, которое возвращает список квадратов элементов исходного списка.
        Function<List<Integer>, List<Integer>> function4 = x -> x.stream().map(y -> y * y).toList();
        System.out.println(function4.apply(List.of(1, 2, 3, 4, 5)));
    }
}

