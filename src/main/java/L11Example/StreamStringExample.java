package L11Example;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamStringExample {
    public static void main(String[] args) {
        List<String> names = List.of("John", "Michael", "Toby", "Pam", "John");

        Set<String> mappedName = names.stream()
                .distinct()
                .filter(name -> name.contains("h") || name.contains("a"))
                .map(name -> {
                            String lastChar = String.valueOf(name.charAt(name.length() - 1));
                            return name.replace(lastChar, lastChar.toUpperCase());
                        }
                ).collect(Collectors.toSet());
        System.out.println(mappedName);
    }
}
