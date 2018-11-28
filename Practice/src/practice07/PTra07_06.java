package practice07;
/*
 * PTra07_07.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra07_06 {
	public static void main(String[] args) {

		// ★ ※2次元配列を用いています
		int[][] array = {
				{500,40,6},
				{70,8,90,1000}
		};

		// ★ 配列arrayに格納されている全ての数字の平均を出力してください

		int sum=0;
		int count = 0;
		for(int i=0;i<array.length;i++) {

	//メモ
			//ここに int sum,count=0を入れてしまうと、１回目と２回目の和の時に初期化されてしまう為
			//			複数の列の合計を足したい時は、繰り返しを行うforの前に初期条件を設定しておく


			for(int j=0;j<array[i].length;j++) {
				sum += array[i][j];
				count++;
			}



//	間違い	for(int j=0;j<array.length;j++) {
//			sum += array[i][j];
//		　　}
//	　　　	System.out.println(sum);

		}
		System.out.println(sum/count);

	}
}
//　for以下を繰り返す為
