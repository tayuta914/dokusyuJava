package to.msn.wings.selfjava.chap07.constructor.init;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class Person {
  public String name;
  public int age;
  public LocalDateTime updated;

  // 初期化ブロック
  // 初期化ブロックは、基本的に複数のコンストラクターに共通するコードを取り出す時に使用する
  {
    this.updated = LocalDateTime.now();
  }

  // 性/名、誕生日から初期化
  public Person(String firstName, String lastName, LocalDate birth) {
    this.name = lastName + " " + firstName;
    this.age = Period.between(birth, LocalDate.now()).getYears();
  }
}
