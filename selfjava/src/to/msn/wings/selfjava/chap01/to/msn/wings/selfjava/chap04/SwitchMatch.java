package to.msn.wings.selfjava.chap04;

public class SwitchMatch {
  public static void main(String[] args) {

    Object obj = -123;

    switch (obj) {
      // 変数objがInteger型の場合、絶対値求める
      case Integer i -> System.out.println(Math.abs(i));
      // 変数objがString型の場合、先頭文字を取得
      case String str -> System.out.println(str.substring(0, 1));

      case null -> System.out.println("nullです。");

      default -> System.out.println("意図しない値です。");
    }

  }
}