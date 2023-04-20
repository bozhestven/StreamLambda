package org.example.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamTask {
    public static void main(String[] args) {
//     1. Найти среднее значение чисел в списке:
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(numbers.stream().mapToDouble(Integer::doubleValue).average().orElse(0));
//     2. Получить список квадратов чисел в списке:
        List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5);
        numbers1.stream().map(x -> x * 2).forEach(x -> System.out.print(x + " "));
//     3. Отфильтровать элементы списка, оставив только четные числа:
        List<Integer> numbers2 = Arrays.asList(1, 2, 3, 4, 5);
        numbers2.stream().filter(x -> x % 2 == 0).forEach(x -> System.out.print(x + " "));
//     4. Проверить, содержит ли список число 3:
        List<Integer> numbers3 = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(numbers3.stream().anyMatch(x -> x == 3));
//     5. Соединить элементы списка в одну строку через запятую:
        List<String> strings = Arrays.asList("one", "two", "three", "four", "five");
        strings.stream().map(x -> x + ", ").forEach(System.out::print);
//     6. Получить первые три элемента списка:
        List<Integer> numbers4 = Arrays.asList(1, 2, 3, 4, 5);
        numbers4.stream().limit(3).forEach(x -> System.out.print(x + " "));
//     7. Извлечь из списка все уникальные элементы:
        List<Integer> numbers5 = Arrays.asList(1, 2, 3, 4, 5, 3, 4, 6);
        numbers5.stream().distinct().forEach(x -> System.out.print(x + " "));
//     8. Найти максимальное значение в списке:
        List<Integer> numbers6 = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(numbers6.stream().mapToInt(Integer::intValue).max().orElse(0));
//     9. Отсортировать список в обратном порядке:
        List<Integer> numbers7 = Arrays.asList(1, 2, 3, 4, 5);
        numbers7.stream().sorted(Comparator.reverseOrder()).forEach(x -> System.out.print(x + " "));
    }
}
