package lesson2Task6;

public class WeekdayValidator {
  public static void main(String[] args) {
    printDayOfWeek(1);
  }

  public static String printDayOfWeek (int dayOfWeek) {
    String nameOfDay;
    switch (dayOfWeek) {
      case 1:
        nameOfDay="Monday";
        System.out.println("Monday");
        break;
      case 2:
        nameOfDay="Tuesday";
        break;
      case 3:
        nameOfDay="Wednesday";
        break;
      case 4:
        nameOfDay="Thursday";
        break;
      case 5:
        nameOfDay="Friday";
        break;
      case 6:
      case 7:
        nameOfDay="Weekend";
        break;
      default:
        nameOfDay="There is no such a day!";
        break;
    }
    return nameOfDay;
  }
}
