package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

  public static void main(String[] args) {
//    文字列結合と数値計算結果の結合をして
//    自分の名前 ＋ 自分の年齢 ＋ ”歳です。”が出力されるようにする
    String name = "間瀬英紀";
    int age = 20 + 7 - 1;
    System.out.println(name + age + "歳です");

//    自己紹介を少し追加してコンソールに出力
//    "私の趣味は" + hobby[1] + "," + … + "です"が出力されるようにする
    String[] hobby = {"野球", "ゴルフ", "サカナクション", "旅行" };
    StringBuilder hobbies = new StringBuilder();
    int iter = 0;
    for (String s : hobby) {
      iter++;
      hobbies.append(s);
      if (iter != hobby.length) {
        hobbies.append(",");
      }
    }
    System.out.println("私の趣味は" + hobbies + "です");
  }
}
