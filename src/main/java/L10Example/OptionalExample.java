package L10Example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        String filePath = "src\\main\\resources\\textFile";
        Optional<String> fileContentOpt = readTextContentOpt(filePath);

//        fileContentOpt.ifPresent(fileContent-> System.out.println(fileContent));

        if(fileContentOpt.isPresent()){
            System.out.println(fileContentOpt.get());
        }

//        System.out.println(fileContentOpt);
    }

    private static Optional<String> readTextContentOpt(String filePath) {

        try {
            String textContent = Files.readString(Path.of(filePath));
            return Optional.of(textContent);
        } catch (IOException e) {
            return Optional.empty();
        }
    }
}
