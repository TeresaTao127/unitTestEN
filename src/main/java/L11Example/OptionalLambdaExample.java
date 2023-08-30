package L11Example;

import L10Example.OptionalExample;

import java.util.Optional;

public class OptionalLambdaExample {
    public static void main(String[] args) {
        Optional<String> fileContent = OptionalExample.readTextContentOpt("src\\main\\resources\\textFile");

        if (fileContent.isPresent()) {
            System.out.println("file content is present: " + fileContent.get());
        } else {
            System.out.println("file content is not present");
        }

        fileContent.ifPresent(content -> System.out.println(content));

        fileContent.ifPresent(content -> {
            System.out.println("We are in lambda expression");
            System.out.println(content);
            content = content.toUpperCase();
            System.out.println(content);
        });

        String capitalContent=fileContent.map(content->content.toUpperCase()).orElse("---");
        System.out.println("CAPITALS: "+ capitalContent);


//       @Test
//       void shouldVerifyDoctorNames() {
//       FamilyDoc doc = new FamilyDoc("John", "Smith");
//       Assertions.assertAll("Should verify doctor names",
//                  () -> Assertions.assertEquals("John", doc.getName()),
//                  () -> Assertions.assertEquals("Smith", doc.getSurname()));
//}

//        Doctor doc = null;
//        Assertions.assertThrows(NullPointerException.class,
//                () -> doc.introduce());
    }
}
