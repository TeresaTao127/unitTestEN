package L11Example;

import java.util.stream.IntStream;

public class ReduceExample {
    public static void main(String[] args) {
        int sum = IntStream.range(0, 10).reduce(0, (a, b) -> a + b);
        System.out.println(sum);
    }
}
