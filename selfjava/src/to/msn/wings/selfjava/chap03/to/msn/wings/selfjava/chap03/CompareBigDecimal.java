package to.msn.wings.selfjava.chap03;

import java.math.BigDecimal;

public class CompareBigDecimal {
  public static void main(String[] args) {

    var bd1 = new BigDecimal("0.2");
    var bd2 = new BigDecimal("3");
    var bd3 = new BigDecimal("0.6");

    /**
     * compareTo
     * 大きい場合は結果→1
     * 小さい場合は結果→-1
     * 値が等しい→0
     */
    System.out.println(bd1.multiply(bd2).compareTo(bd3));
  }
}