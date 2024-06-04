package to.msn.wings.selfjava.chap09.practice;

public class WeekdayClinet {

  public static void main(String[] args) {
    var day = Weekday.valueOf("Monday");
    System.out.println(day instanceof Weekday);
  }
}
