package L4WeekdayNames;

public enum Weekday {

    MONDAY("Monday"),
    TUESDAY("Tuesday"),
    WEDNESDAY("Wednesday"),
    THURSDAY("Thursday"),
    FRIDAY("Friday"),
    SATURDAY("Saturday"),
    SUNDAY("Sunday");

    String name;

    Weekday(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


}


