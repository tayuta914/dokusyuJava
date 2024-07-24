package to.msn.wings.selfjava.chap11;

public class MyRunner implements Runnable {
  // スレッド実処理
  @Override
  public void run() {
    for (var i = 0; i < 30; i++) {
      System.out.println(Thread.currentThread().getName() + ":" + i);
    }
  }
}