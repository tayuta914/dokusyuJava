package to.msn.wings.selfjava.chap09;

public class Tryrethow {
  // 例外再スロー
  public static void rethow(boolean flag) throws MySampleException, MyLibException {
    try {
      if (flag) {
        throw new MySampleException();
      } else {
        throw new MyLibException();
      }
    } catch (Exception e) {
      throw e;
    }
  }
}
