package to.msn.wings.selfjava.chap05;

public class Practice2_2 {
  public static void main(String[] args) {
    var str = "お問い合わせはsupport@example.comまで";
    System.out.println(str.replaceAll("(?i)[a-z0-9.!#$%'*+/=?^_{|}~-]+@([a-z0-9-]+(?:¥\\.[a-z0-9-]+)*)",
        "<a href=\"mailto:$0\">$0</a>"));
  }
}