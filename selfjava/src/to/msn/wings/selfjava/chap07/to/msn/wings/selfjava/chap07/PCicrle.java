package to.msn.wings.selfjava.chap07;

public class PCicrle {
  public double radius;

  public PCicrle(double radius) {
    this.radius = radius;
  }

  // 7-2(2)
  public PCicrle() {
    this(1);
  }

  public double getArea() {
    return this.radius * this.radius * Math.PI;
  }
}
