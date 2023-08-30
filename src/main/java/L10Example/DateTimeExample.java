package L10Example;


import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class DateTimeExample {
    public static void main(String[] args) {
        LocalDate dateNow= LocalDate.now();
        System.out.println(dateNow);

        LocalDate firstDayOfYear= LocalDate.of(2020, Month.JANUARY, 1);
        LocalDate dayOfTheYear=LocalDate.ofYearDay(2021,45);
        System.out.println(firstDayOfYear);
        System.out.println(dayOfTheYear);

        LocalDate pastDate=dateNow.minusDays(1500);
        LocalDate futureDate=dateNow.plusDays(1500);
        System.out.println(pastDate);
        System.out.println(futureDate);

        Period period=Period.between(firstDayOfYear,dayOfTheYear);
        System.out.println(period.getDays());
        System.out.println(period);
    }
}
