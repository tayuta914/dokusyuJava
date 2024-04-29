package to.msn.wings.selfjava.chap06;

import java.util.List;
import java.util.TreeSet;

public class SetTree {
  public static void main(String[] args) {
    var ts = new TreeSet<Integer>(List.of(1, 20, 30, 10, 60, 15));
    // TreeSetクラスが順番を持っていることからソートされる
    System.out.println(ts);
    // セット内を逆順に並び替える
    System.out.println(ts.descendingSet());
    // 指定の要素以上の要素の中で最小のもを取得
    System.out.println(ts.ceiling(15));
    // 指定の要素より小さい要素の中で最小のものを取得
    System.out.println(ts.lower(15));
    // 指定の要素以上の要素を取得
    System.out.println(ts.tailSet(15));
    // 指定の要素より小さい要素を取得
    System.out.println(ts.headSet(30, true));
  }
}