package to.msn.wings.selfjava.chap05;

public class StrSubstring {
  public static void main(String[] args) {
    var mail = "yamada@example.com";
    // ドメイン部分のみ抜き出し
    System.out.println(mail.substring(mail.lastIndexOf("@") + 1));
    // 1文字だけ抜き出したい場合、charAtを使う
    System.out.println(mail.charAt(0));
    // 文字列からすべての文字を取得する
    for (int i = 0; i < mail.length(); i++) {
      System.out.println(mail.charAt(i));
    }
  }
}