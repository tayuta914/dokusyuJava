package to.msn.wings.selfjava.chap04;

public class MainTest {
  public static void main(String[] args) {
    // launch.jsonで指定した引数を渡す
    for (var value : args) {
      System.out.println("こんにちは、" + value + "さん!");
    }
  }
}