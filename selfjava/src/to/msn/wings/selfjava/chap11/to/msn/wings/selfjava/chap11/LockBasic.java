package to.msn.wings.selfjava.chap11;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockBasic {
  // private int value = 0;
  // private final Lock lock = new ReentrantLock();

  // void increment() {
  // // ロックを取得
  // lock.lock();
  // try {
  // this.value++;
  // } finally {
  // // ロックを解除
  // lock.unlock();
  // }
  // }

  // if(lock.tryLock(10,TimeUnit.SECONDS))

  // {
  // try {
  // // 排他制御すべき処理
  // } finally {
  // lock.unlock();
  // }
  // }else
  // {
  // // ロックを獲得できない場合の処理
  // }
}