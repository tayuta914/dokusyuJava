package to.msn.wings.selfjava.chap05;

public class StrBlank {
  public static void main(String[] args) {
    var str1 = "";
    var str2 = " 　 ";

    /**
     * isBlankメソッド
     * 空白だけでなく、空白だけの文字列も「空」とみなす。
     * 具体的なものは以下参照。
     * 半角、全角
     * タブ
     * ラインフィード(\n)
     * キャリッジリターン(\r)
     * フォームフィード(\f)
     */
    System.out.println(str1.isEmpty());
    System.out.println(str1.isBlank());
    System.out.println(str2.isEmpty());
    System.out.println(str2.isBlank());
  }
}