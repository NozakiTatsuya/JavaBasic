package practice08;
/*
 * PTra08_03.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra08_03 {
	public static void main(String[] args) {

		// ★ 0～100のランダムな値を取得して、変数numberに代入してください
			int number = new java.util.Random().nextInt(100);
			System.out.println(number);
		// ★ 変数resultを宣言し、メソッドisEvenNumberを（変数number）で呼び出した結果を代入してください
			boolean result = isEvenNumber(number);

		if (result) {
			System.out.println("偶数です");
		} else {
			System.out.println("奇数です");
		}
	}

	/*
	 * ★ 以下の仕様でメソッドを作成してください
	 *
	 * 戻り値		：boolean
	 * メソッド名	：isEvenNumber
	 * 引数			：int x
	 *
	 * 引数で渡された内容が偶数ならtrue、奇数ならfalseを返すメソッド
	 */
	public static boolean isEvenNumber(int x) {
		return  x %2 ==0;

	}
}

//コメント
//13数値をランダムで選ぶ34それが奇数なのか偶数なのかを検査する（引数）に代入する
//検査した数を16に代入、その数値が18に代入されて、35で割り切れたら（偶数なら）trueなら偶数表記
//それ以外ならelse奇数表記


