package to.msn.wings.selfjava.chap10;

import java.util.Comparator;
import java.util.stream.Stream;

public class StreamSortComporator {
  public static void main(String[] args) {
    Stream.of("バラ", "あさがお", "チューリップ", "さくら")
        // 文字列を辞書逆順でソートする
        // ソートの前に置くことでソート前の状態を確認できる
        .sorted(Comparator.reverseOrder())
        .forEach(System.out::println);
  }
}