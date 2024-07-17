package to.msn.wings.selfjava.chap10;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Practice3 {
  // 設問①
  @FunctionalInterface
  public interface Hoge {
    void print(String str);
  }

  // 設問②
  @FunctionalInterface
  public interface Foo<T, R> {
    R process(T v1, T v2);
  }

  // 設問③
  public static void main(String[] args) {
    var list = new ArrayList<String>(List.of("ABCDE", "OP", "WXZ", "HIJKL"));
    // 各要素を処理して置き換え
    list.replaceAll(v -> {
      if (v.length() < 3) {
        return v;
      } else {
        return v.substring(0, 3);
      }
    });

    // 設問④
    Stream.of("シュークリーム", "プリン", "マドレーヌ", "ババロア")
        .sorted((str1, str2) -> str2.length() - str1.length())
        .forEach(System.out::println);

    // 設問⑤
    var summary = IntStream.of(60, 95, 75, 70)
        .collect(
            IntSummaryStatistics::new,
            IntSummaryStatistics::accept,
            IntSummaryStatistics::combine);
    System.out.println(summary.getMax());
    System.out.println(summary.getAverage());

    // テキスト回答
    var list2 = new int[] { 60, 95, 75, 70 };
    System.out.println(IntStream.of(list2).max().orElse(0));
    System.out.println(IntStream.of(list2).average().orElse(0));
  }
}
