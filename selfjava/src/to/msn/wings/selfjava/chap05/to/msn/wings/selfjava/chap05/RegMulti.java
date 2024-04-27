
package to.msn.wings.selfjava.chap05;

import java.util.regex.Pattern;

public class RegMulti {
  public static void main(String[] args) {
    var str = "10人のインディアン。\n1年生になったら";
    // var ptn = Pattern.compile("^\\d*");
    // 複数行(マルチラインモード有効)、大文字、小文字区別なし
    var ptn = Pattern.compile("^[a-z0-9._-]*", Pattern.MULTILINE | Pattern.CASE_INSENSITIVE);
    var match = ptn.matcher(str);
    while (match.find()) {
      System.out.println(match.group());
    }
  }
}