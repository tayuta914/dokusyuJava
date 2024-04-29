package to.msn.wings.selfjava.chap06;

import java.util.ArrayList;
import java.util.List;

public class Practice1 {
  public static void main(String[] args) {
    var array = new ArrayList<Integer>(List.of(16, 24, 30, 39));
    array.toArray();
    System.out.println(array);
  }
}