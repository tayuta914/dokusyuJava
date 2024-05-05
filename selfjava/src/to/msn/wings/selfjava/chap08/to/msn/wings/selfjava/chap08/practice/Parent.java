package to.msn.wings.selfjava.chap08.practice;

import to.msn.wings.selfjava.chap08.Person;

public class Parent extends Person implements Father, Mother {
  public void run() {
    Father.super.run(); // Fatherの実装の呼び出し
    Mother.super.run(); // Motherの実装の呼び出し
  }
}
