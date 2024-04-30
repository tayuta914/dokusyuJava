package to.msn.wings.selfjava.chap07;

public class Practice4 {
  public double getAverage(double... values) {
    var result = 0.0;
    for (var value : values) {
      result += value;
    }
    return result / values.length;
  }

}
