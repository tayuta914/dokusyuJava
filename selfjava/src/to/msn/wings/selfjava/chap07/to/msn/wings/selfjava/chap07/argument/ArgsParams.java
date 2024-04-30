package to.msn.wings.selfjava.chap07.argument;

public class ArgsParams {
  // 可変長は...(ピリオド３個)で表現できる
  public int totalProducts(int... values) {
  // 下記に書き換えも可能
  // public int totalProducts(int[] values) {
    var result = 1;
    for (var value : values) {
      result *= value;
    }
    return result;
  }
}
