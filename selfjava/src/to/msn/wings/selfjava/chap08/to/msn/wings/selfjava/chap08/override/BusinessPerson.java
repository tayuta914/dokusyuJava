package to.msn.wings.selfjava.chap08.override;

import to.msn.wings.selfjava.chap08.Person;

public class BusinessPerson extends Person {

  public BusinessPerson() {
  }

  // 基底クラスの同名のメソッドのオーバーライド（上書き）
  @Override
  public String show() {
    return String.format("会社員の%s（%d歳）です。", this.name, this.age);
  }

  public String work() {
    return String.format("%d歳の%sは、働きます。", this.age, this.name);
  }
}
