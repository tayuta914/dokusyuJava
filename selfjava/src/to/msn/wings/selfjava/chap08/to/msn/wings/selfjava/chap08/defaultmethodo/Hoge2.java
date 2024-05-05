package to.msn.wings.selfjava.chap08.defaultmethodo;

public interface Hoge2 {
  default void log(String msg) {
    System.out.println("Hoge: " + msg);
  }

}
