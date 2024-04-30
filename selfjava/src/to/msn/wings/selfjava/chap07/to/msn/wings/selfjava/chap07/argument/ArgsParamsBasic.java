package to.msn.wings.selfjava.chap07.argument;

public class ArgsParamsBasic {
  public static void main(String[] args) {
    var v = new ArgsParams();
    System.out.println(v.totalProducts(12, 15, -1));
    System.out.println(v.totalProducts(5, 7, 8, 2, 4, 3));
    // 下記に書き換え可能(配列)
    // System.out.println(v.totalProducts(new int[] {12, 15, -1}));
  }
}
