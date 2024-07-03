package to.msn.wings.selfjava.chap10;

public class MethodLamdaBasic {
  public static void main(String[] args) {
    var data = new String[] { "春はあけぼの", "夏は夜", "秋は夕暮れ" };
    var ml = new MethodLamda();
    ml.walkArray(data, value -> {
      System.out.printf("[%s]\n", value);
    });
  }

}