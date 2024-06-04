package to.msn.wings.selfjava.chap09.practice;

public class Person2 implements Cloneable {
  private String firstName;
  private String lastName;
  private String[] memos;

  public Person2(String firstName, String lastName, String[] memos) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.memos = memos;
  }

  @Override
  public Person2 clone() {
    Person2 p = null;
    try {
      p = (Person2) super.clone();
      p.memos = memos;
    } catch (CloneNotSupportedException e) {
      throw new AssertionError();
    }
    return p;
  }

  @Override
  public String toString() {
    return String.format("Person： ,%s, %s", this.firstName, this.lastName);
  }
}
