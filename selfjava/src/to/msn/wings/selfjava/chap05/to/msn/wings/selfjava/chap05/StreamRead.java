package to.msn.wings.selfjava.chap05;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class StreamRead {
  public static void main(String[] args) {
    // macOSではドライブレターは不要なので、完全なパスを指定する
    var filePath = Paths.get("/Users/iwasakenta/workSpace/data/sample.txt");
    // ファイルに書き込む
    try (var reader = Files.newBufferedReader(filePath)) {
      var line = "";
      while ((line = reader.readLine()) != null) {
        System.out.println(line);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}