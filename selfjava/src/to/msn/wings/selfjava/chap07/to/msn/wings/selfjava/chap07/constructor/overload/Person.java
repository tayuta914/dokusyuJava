package to.msn.wings.selfjava.chap07.constructor.overload;

public class Person {
  public String name;
  public int age;

  // コンストラクター
  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  // コンストラクター(引数なし)
  public Person() {
    // this呼び出しはコンストラクターの先頭に記述する(注意)
    this("名無権兵衛", 20);
  }

  public void show() {
    System.out.printf("%s（%d歳）です。", this.name, this.age);
  }
}
