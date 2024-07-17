package to.msn.wings.selfjava.chap10;

import java.util.stream.Stream;

public class StreamReduce {
  public static void main(String[] args) {
    System.out.println(
        Stream.of("バラ", "あさがお", "チューリップ", "さくら")
            .sorted()
            // resultに対して要素順にソートする
            .reduce((result, str) -> result + "," + str)
            .orElse(""));
  }
}
