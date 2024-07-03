package to.msn.wings.selfjava.chap10;

import java.util.ArrayList;
import java.util.List;

public class Practice10 {
  public static void main(String[] args) {
    // i -> {
    // return i + i;
    // }
    var list = new ArrayList<String>(
        List.of("バラ", "チューリップ", "あさがお"));
    list.removeIf(v -> v.length() < 5);
    System.out.println(list);
  }
}