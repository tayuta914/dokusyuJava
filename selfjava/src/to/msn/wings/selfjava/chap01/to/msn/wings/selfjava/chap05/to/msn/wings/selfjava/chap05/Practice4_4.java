package to.msn.wings.selfjava.chap05;

import java.util.Arrays;

public class Practice4_4 {
  public static void main(String[] args) {
    // 1. 6の3乗
    System.out.println(Math.pow(6, 3));

    // 2. -15の絶対値
    System.out.println(Math.abs(-15));

    // 3. 110, 14, 28, 32の値をもつ配列をソート
    var array = new int[] { 110, 14, 28, 32 };
    Arrays.sort(array);
    System.out.println(Arrays.toString(array));
  }
}