package L11Example;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(3, 5, 10, 100, -3, 60, 90, 1232, 60,90,100,300,303);

        for (Integer number : numbers) {
            if (number % 3 == 0) {
                System.out.println(number + " is divisible by 3");
            }
        }

        Set<Integer> setOfFilterdNumbers = numbers.stream()
                .filter(number -> number % 3 == 0)
                .filter(number -> number % 10 == 0)
                .collect(Collectors.toSet());
        System.out.println(setOfFilterdNumbers);

        List<Integer>listOfFilterdNumbers=numbers.stream()
                .filter(number -> number % 3 == 0)
                .filter(number -> number % 10 == 0)
                .distinct()
                .limit(2)
                .skip(1)
                .collect(Collectors.toList());
        System.out.println(listOfFilterdNumbers);
    }
}
