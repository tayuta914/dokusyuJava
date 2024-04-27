package to.msn.wings.selfjava.chap04;

public class PFor {
  public static void main(String[] args) {
    for (var i = 1; i < 10; i++) {
      for (var j = 1; j < 10; j++) {
        var result = i * j;
        System.out.println(result + " ");
      }
    }
    System.out.println();
  }
}