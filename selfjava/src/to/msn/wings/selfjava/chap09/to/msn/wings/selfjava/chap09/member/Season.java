package to.msn.wings.selfjava.chap09.member;

public enum Season {
  SPRING(0, "春"),
  SUMMER(1, "夏"),
  AUTUMN(2, "秋"),
  WINTER(3, "冬");

  // フィールド定義
  private int code; // 季節コード
  private String jpName; // 表示名

  // コンストラクター
  private Season(int code, String jpName) {
    this.code = code;
    this.jpName = jpName;
  }

  // メソッド
  public int toSeasonValue() {
    return this.code;
  }

  @Override
  public String toString() {
    return this.jpName;
  }
}
