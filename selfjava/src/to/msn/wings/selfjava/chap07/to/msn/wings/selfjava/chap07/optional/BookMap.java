package to.msn.wings.selfjava.chap07.optional;

import java.util.Map;

public class BookMap {
  // 「ISBNコード：署名」の形式で書籍情報を管理
  private Map<String, String> data;

  // 引数mapで書籍情報を初期化
  public BookMap(Map<String, String> map) {
    this.data = map;
  }

  public String getTitleByIsbn(String isbn) {
    return this.data.get(isbn);
  }

}
