package to.msn.wings.selfjava.chap10;

import java.util.stream.Stream;

public class StreamSort {
  public static void main(String[] args) {
    Stream.of("バラ", "あさがお", "チューリップ", "さくら")
        .sorted()
        .forEach(System.out::println);
  }
}