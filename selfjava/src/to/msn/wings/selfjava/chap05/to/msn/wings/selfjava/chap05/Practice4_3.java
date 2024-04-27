package to.msn.wings.selfjava.chap05;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Practice4_3 {
  public static void main(String[] args) {
    var filePath = Paths.get("/Users/iwasakenta/workSpace/data/data.dat");

    // ファイルに書き込む
    // window-31Jは設定できないので、UTF_8で対応
    try (var writer = Files.newBufferedWriter(filePath, StandardOpenOption.CREATE,
        StandardOpenOption.APPEND)) {
      writer.write(String.join(",", args));
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}