package to.msn.wings.selfjava.chap05;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;

public class StreamWrite {
  public static void main(String[] args) {
    // macOSではドライブレターは不要なので、完全なパスを指定する
    var filePath = Paths.get("/Users/iwasakenta/workSpace/data/data.log");

    // ファイルに書き込む
    // StandardOpenOption.APPENDは実行した回数分追記される
    try (var writer = Files.newBufferedWriter(filePath, StandardOpenOption.APPEND)) {
      writer.write(LocalDateTime.now().toString());
      writer.newLine();
    } catch (IOException e) {
      e.printStackTrace();

    }
  }
}