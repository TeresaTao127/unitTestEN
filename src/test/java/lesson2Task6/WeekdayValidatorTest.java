package lesson2Task6;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class WeekdayValidatorTest {

  @Test
  void returnADayOfWeek() {
    Assertions.assertEquals("Monday", WeekdayValidator.printDayOfWeek(1));
    Assertions.assertEquals("Tuesday", WeekdayValidator.printDayOfWeek(2));
    Assertions.assertEquals("Wednesday", WeekdayValidator.printDayOfWeek(3));
    Assertions.assertEquals("Thursday", WeekdayValidator.printDayOfWeek(4));
    Assertions.assertEquals("Friday", WeekdayValidator.printDayOfWeek(5));

  }
  @Test
  void returnWeekend() {
    Assertions.assertEquals("Weekend", WeekdayValidator.printDayOfWeek(6));
    Assertions.assertEquals("Weekend", WeekdayValidator.printDayOfWeek(7));
  }
  @Test
  void returnNoSuchADay() {
    Assertions.assertEquals("There is no such a day!", WeekdayValidator.printDayOfWeek(8));
  }
}