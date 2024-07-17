package to.msn.wings.selfjava.chap10;

import java.util.List;

public class StreamFlat {
  public static void main(String[] args) {
    var list = List.of(
        List.of("あいう", "かきく", "さしす"),
        List.of("たちつ", "なにぬ"),
        List.of("はひふ", "まみむ"));
    list.stream()
        // streamを連結する
        .flatMap(v -> v.stream())
        .forEach(System.out::println);
  }
}