package L4WeekdayNames;

public class WeekdayNameConverter {
    public static String getWeekdayName(Weekday weekday) {
        return weekday.getName();
    }

    public static void main(String[] args) {
        Weekday weekday1 = Weekday.Monday;
        Weekday weekday2 = Weekday.Tuesday;
        Weekday weekday3 = Weekday.Wednesday;
        Weekday weekday4 = Weekday.Thursday;
        Weekday weekday5 = Weekday.Friday;
        Weekday weekday6 = Weekday.Saturday;
        Weekday weekday7 = Weekday.Sunday;

        String weekdayName1 = WeekdayNameConverter.getWeekdayName(weekday1);
        String weekdayName2 = WeekdayNameConverter.getWeekdayName(weekday2);
        String weekdayName3 = WeekdayNameConverter.getWeekdayName(weekday3);
        String weekdayName4 = WeekdayNameConverter.getWeekdayName(weekday4);
        String weekdayName5 = WeekdayNameConverter.getWeekdayName(weekday5);
        String weekdayName6 = WeekdayNameConverter.getWeekdayName(weekday6);
        String weekdayName7 = WeekdayNameConverter.getWeekdayName(weekday7);


        System.out.println(weekdayName1);
        System.out.println(weekdayName2);
        System.out.println(weekdayName3);
        System.out.println(weekdayName4);
        System.out.println(weekdayName5);
        System.out.println(weekdayName6);
        System.out.println(weekdayName7);


    }


}
