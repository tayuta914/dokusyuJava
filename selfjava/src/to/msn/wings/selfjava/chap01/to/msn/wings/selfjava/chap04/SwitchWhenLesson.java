package to.msn.wings.selfjava.chap04;

public class SwitchWhenLesson {
  public static void main(String[] args) {

    Object obj = 75;

    switch (obj) {
      case Integer i when i >= 90 -> System.out.println("優");
      case Integer i when i >= 70 -> System.out.println("良");
      case Integer i when i >= 50 -> System.out.println("可");
      default -> System.out.println("不可");
    }
  }
}