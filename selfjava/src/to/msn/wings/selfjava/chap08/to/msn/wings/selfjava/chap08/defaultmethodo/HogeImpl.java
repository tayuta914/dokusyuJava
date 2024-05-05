package to.msn.wings.selfjava.chap08.defaultmethodo;

public class HogeImpl implements Hoge, Hoge2 {
  @Override
  public void log(String msg) {
    Hoge.super.log(msg);
  }

}
