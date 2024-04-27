package to.msn.wings.selfjava.chap05;

import java.util.regex.Pattern;

public class RegSingle {
  public static void main(String[] args) {
    var str = "初めまして。\nよろしくお願いします。";
    // \n行を除く任意の文字列にマッチ。(改行前まで)
    // var ptn = Pattern.compile("^.+");
    // 「.」が行末記号を含む任意の文字列 → 改行をまたがったすべての文字列を取得
    var ptn = Pattern.compile("^.+", Pattern.DOTALL);
    var match = ptn.matcher(str);
    while (match.find()) {
      System.out.println(match.group());
    }
  }
}