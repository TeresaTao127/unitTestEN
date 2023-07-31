package L4WeekdayNames;

public enum Weekday {

        Monday(" Monday"),
        Tuesday("Tuesday"),
        Wednesday("Wednesday"),
        Thursday("Thursday"),
        Friday("Friday"),
        Saturday("Saturday"),
        Sunday("Sunday");

    String name;

    Weekday(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }
}


