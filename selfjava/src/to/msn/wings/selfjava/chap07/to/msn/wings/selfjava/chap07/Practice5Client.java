package to.msn.wings.selfjava.chap07;

public class Practice5Client {
  public static void main(String[] args) {
    var value = new int[] { 10, 20, 30 };
    var p = new Practice5();
    System.out.println(p.change(value)[0]);
    System.out.println(value[0]);
  }
}
