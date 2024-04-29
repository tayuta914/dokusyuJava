package to.msn.wings.selfjava.chap06;

import java.util.HashMap;
import java.util.Map;

public class Practice4 {
  public static void main(String[] args) {
    var map = new HashMap<String, String>(Map.of("cucumber", "キュウリ", "lettuce", "レタス", "spinach", "ホウレンソウ"));
    map.put("carrot", "ニンジン");
    map.remove("spinach");
    map.replace("cucumber", "胡瓜");

    for (var entry : map.entrySet()) {
      System.out.println(entry.getKey() + ":" + entry.getValue());
    }

  }
}