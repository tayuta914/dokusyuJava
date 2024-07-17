package to.msn.wings.selfjava.chap10;

import java.util.stream.Stream;

public class StreamPeek {
  public static void main(String[] args) {
    Stream.of("さかな", "あか", "こだま", "きんもくせい")
        // peekメソッドはデバッグ用に用いることが多い
        .peek(System.out::println)
        .sorted()
        .forEach(System.out::println);
  }
}