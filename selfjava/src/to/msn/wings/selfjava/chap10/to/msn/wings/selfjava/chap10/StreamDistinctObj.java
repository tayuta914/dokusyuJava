package to.msn.wings.selfjava.chap10;

import java.util.HashSet;
import java.util.stream.Stream;

import to.msn.wings.selfjava.chap10.lambda.Person;

public class StreamDistinctObj {
  public static void main(String[] args) {
    var set = new HashSet<String>();
    Stream.of(
        new Person("山田", 40),
        new Person("高野", 30),
        new Person("大川", 35),
        new Person("山田", 45))
        // Hash setで重複していた値に関しては、falseを返すので、結果として除去できる
        .filter(p -> set.add(p.name))
        .forEach(System.out::println);
  }
}