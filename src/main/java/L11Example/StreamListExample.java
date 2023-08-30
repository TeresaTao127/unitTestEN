package L11Example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamListExample {
    public static void main(String[] args) {

        List<String> specializations = Arrays.asList("Radiologist:Surgeon:Maxillary Surgeon", "Internist:Perdiatrician");
        System.out.println(specializations);

        List<String> preparedSpecs=specializations.stream()
                .map(specialization -> specialization.split(":"))
                .flatMap(array-> Arrays.stream(array))

                .collect(Collectors.toList());

        System.out.println(preparedSpecs);


        System.out.println(preparedSpecs.stream().anyMatch(spec -> "Vet".equals(spec)));
        System.out.println(preparedSpecs.stream().anyMatch(spec -> "Internist".equals(spec)));

        System.out.println(preparedSpecs.stream().count());
        System.out.println(preparedSpecs.stream().filter(spec ->spec.contains("Surgeon")).count());
        System.out.println(preparedSpecs.stream().filter(spec -> spec.contains("Surgeon")).findAny());

        System.out.println("-------------");
        System.out.println(preparedSpecs);

    }
}
