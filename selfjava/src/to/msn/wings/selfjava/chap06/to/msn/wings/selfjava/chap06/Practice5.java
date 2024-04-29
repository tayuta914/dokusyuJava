package to.msn.wings.selfjava.chap06;

import java.util.ArrayList;
import java.util.List;

public class Practice5 {
  public static void main(String[] args) {
    var list = new ArrayList<Integer>(List.of(1, 2, 3, 4));
    list.add(100);
    list.set(2, 30);
    list.remove(4);

    for (var i : list) {
      System.out.println(i);
    }
  }

}