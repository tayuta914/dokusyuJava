package to.msn.wings.selfjava.chap05;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Practice3 {
  public static void main(String[] args) {
    var date = LocalDateTime.now();
    var period = Period.ofDays(20);
    System.out.println(date.getMonthValue() + "月");
    System.out.println(date.getMinute() + "分");
    // 今日を基点に20日後の日付
    System.out.println(date.plus(20, ChronoUnit.DAYS));
    System.out.println("20日後は、" + date.plus(period));
  }
}