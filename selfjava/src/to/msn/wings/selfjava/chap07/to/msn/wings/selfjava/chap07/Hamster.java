package to.msn.wings.selfjava.chap07;

public class Hamster {
  public String name;
  public int age;

  public Hamster(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public Hamster() {
    this("権兵衛", 0);
  }

  public void show() {
    System.out.printf(String.format("%s（%d歳）です。\n", this.name, this.age));
  }
}
