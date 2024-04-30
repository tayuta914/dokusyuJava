package to.msn.wings.selfjava.chap08.accessor;

public class Person {
  // フィールドはprivate扱い
  private String name;
  private int age;

  // nameフィールドのゲッター
  public String getName() {
    return this.name;
  }

  // nameフィールドのセッター
  public void setName(String name) {
    this.name = name;
  }

  // ageフィールドのゲッター
  public int getAge() {
    return this.age;
  }

  // ageフィールドのセッター
  public void setAge(int age) {
    if (age <= 0) {
      throw new IllegalArgumentException("年齢は整数で指定してください。");
    }
    this.age = age;
  }

  public String show() {
    return String.format("%s（%d歳）です。", getName(), getAge());
  }

}