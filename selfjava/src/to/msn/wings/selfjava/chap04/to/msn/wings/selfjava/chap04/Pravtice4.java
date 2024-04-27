package to.msn.wings.selfjava.chap04;

public class Pravtice4 {
  public static void main(String[] args) {

    var language = "Kotlin";

    System.out.println(switch (language) {
      case "Scala", "Kotlin", "Groovy" -> "JVM言語";
      case "C", "Visual Basic", "F#" -> ".NET言語";
      default -> "不明";
    });
  }
}
