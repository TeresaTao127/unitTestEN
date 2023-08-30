package L10Example;

import java.sql.SQLOutput;
import java.time.LocalDateTime;
import java.time.Period;

public class LocalDateTimeExample {
    public static void main(String[] args) {
        LocalDateTime localDateTime =LocalDateTime.now();
        LocalDateTime localDateTime1=LocalDateTime.now().minusYears(5);

        System.out.println(localDateTime.isAfter(localDateTime1));


        Period period=Period.between(localDateTime1.toLocalDate(), localDateTime.toLocalDate());
        System.out.println(period);
        System.out.println(period.getDays());
    }
}
