package to.msn.wings.selfjava.chap05;

public class StrIndex {
  public static void main(String[] args) {
    var str = "にわにわにわにわとりがいる";
    System.out.println(str.indexOf("にわ"));
    // 存在しない場合、-1を返す
    System.out.println(str.indexOf("にも"));
    System.out.println(str.lastIndexOf("にわ"));
    System.out.println(str.indexOf("にわ", 3));
    // 3文字目から後方検索を行う5
    System.out.println(str.lastIndexOf("にわ", 3));
  }
}