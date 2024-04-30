package to.msn.wings.selfjava.chap07.optional2;

import java.util.Optional;

public class OptionalExample {

  public static void main(String[] args) {
    var opt1 = Optional.of("サンプル1");
    var opt2 = Optional.ofNullable(null);
    var opt3 = Optional.empty();

    System.out.println(opt1.isPresent());

    // nullチェック
    opt1.ifPresent(value -> {
      System.out.println(value);
    });

    System.out.println(opt2.orElse("null値です"));

    // Optionalが非null値の場合はその値を、そうでなければラムダ式のotherを戻り値で返す
    System.out.println(opt3.orElseGet(() -> {
      return "null値です";
    }));
  }
}
