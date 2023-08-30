package L10Example;

import java.time.LocalTime;
import java.time.ZoneId;

public class LocalTimeExample {
    public static void main(String[] args) {
        LocalTime localTime= LocalTime.now();
        System.out.println(localTime);

        LocalTime localTime1=LocalTime.of(14,55,33,555);
        System.out.println(localTime1);


        LocalTime polishNow=LocalTime.now(ZoneId.of("Europe/Warsaw"));
        LocalTime irishNow=LocalTime.now(ZoneId.of("Europe/Dublin"));

        System.out.println(polishNow);
        System.out.println(irishNow);


        int hour =polishNow.getHour();
        polishNow.plusHours(12);

    }



}
