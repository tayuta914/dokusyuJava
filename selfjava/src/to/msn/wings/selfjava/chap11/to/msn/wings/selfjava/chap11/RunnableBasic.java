package to.msn.wings.selfjava.chap11;

public class RunnableBasic {
  public static void main(String[] args) {
    // スレッドを生成
    var th1 = new Thread(new MyRunner());
    var th2 = new Thread(new MyRunner());
    var th3 = new Thread(new MyRunner());

    // スレッド開始
    th1.start();
    th2.start();
    th3.start();
  }
}