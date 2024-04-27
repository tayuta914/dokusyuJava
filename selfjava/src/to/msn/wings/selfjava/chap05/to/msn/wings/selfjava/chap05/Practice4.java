package to.msn.wings.selfjava.chap05;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class Practice4 {
  public static void main(String[] args) {
    var str1 = "となりのきゃくはよくかきくうきゃくだ";
    // 「きゃく」の位置を文字列検索する
    System.out.println(str1.lastIndexOf("きゃく"));

    var locale = "千葉";
    var temp = 17.256;
    // 小数点以下2桁まで表示
    System.out.println(String.format("%sの気温は、%.2fです。", locale, temp));

    var str2 = "彼女の名前は花子です。";
    // 「彼女」を「妻」に置き換える
    System.out.println(str2.replace("彼女", "妻"));

    var dateTime = LocalDateTime.now();
    System.out.println(dateTime.plus(Duration.parse("P5DT6H")));

    LocalDate beginDate = LocalDate.of(2024, 3, 12);
    LocalDate endDate = LocalDate.of(2024, 11, 5);
    var diff = Period.between(beginDate, endDate);
    // 日付の差を出力
    System.out.println(diff.getMonths() + "ヶ月" + diff.getDays() + "日間");
  }
}