package practice08;
/*
 * PTra08_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra08_04 {
	public static void main(String[] args) {

		String message = "Hello, world!";

		// ★ メソッドconvertMessageを（変数message）で呼び出してください
		convertMessage(message);
	}

	/*
	 * ★ 以下の仕様でメソッドを作成してください
	 *
	 * 戻り値		：なし
	 * メソッド名	：convertMessage
	 * 引数			：String str
	 *
	 * 引数で渡された値の前後に 「 」 を付与して出力するメソッド（"「"と引数と"」"の連結）
	 */
	public static void convertMessage(String str) {
		System.out.println("「" + str + "」");
	}

}

//戻り値がない時は戻り値の型をvoidに変更して戻り値がないって事はも取らないのでretunも要らない。
//１５も戻らないので＝で繋がないでconvertMessage(message);と呼び出して和えるだけ
//（Hello, world!）送るだけ。
