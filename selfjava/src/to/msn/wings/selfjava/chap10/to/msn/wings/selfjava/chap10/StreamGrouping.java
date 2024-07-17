package to.msn.wings.selfjava.chap10;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamGrouping {
  public static void main(String[] args) {
    System.out.println(
        Stream.of("バラ", "あさがお", "さざんか", "うめ", "さくら")
            .sorted()
            .collect(
                // 条件式のtrue,falseでシンプルな２分割で表せる
                Collectors.partitioningBy(str -> str.length() > 3)));
  }
}
