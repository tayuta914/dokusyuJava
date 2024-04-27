package to.msn.wings.selfjava.chap05;

public class Practice1 {
  public static void main(String[] args) {
    var str1 = "プログラミング言語";
    var str2 = "鈴木\t太郎\t男\t50歳\t広島県";
    var result = str2.split("\t");
    System.out.println(str1.substring(4, 7));
    System.out.println(String.join("&", result));
  }
}