package to.msn.wings.selfjava.chap11;

public class ThreadVirtual {
  public static void main(String[] args) throws InterruptedException {
    // 仮想スレッドを作成するファクトリーを準備
    var factry = Thread.ofVirtual().name("MyThread").factory();
    // スレッドを生成
    var th = factry.newThread(new MyRunner());
    // スレッドを開始＆待機
    th.start();
    th.join();
  }
}