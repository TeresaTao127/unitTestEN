package L10Example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {
    public static void main(String[] args) {
        boolean isPolishZipCode = isPolishZipCode("97-tesz");
//      boolean isPolishZipCode = isPolishZipCode("97-360");

        System.out.println(isPolishZipCode);

    }

    public static boolean isPolishZipCode(String zipcodeCandidate) {
//        zipcode 97-360
//        dd-ddd
//        Pattern pattern = Pattern.compile("\\d\\d-\\d\\d\\d");
//        Pattern pattern = Pattern.compile("\\d\\d-test");
        Pattern pattern = Pattern.compile("\\d\\d-...z");
        Matcher matcher = pattern.matcher(zipcodeCandidate);
        return matcher.matches();
    }
}
