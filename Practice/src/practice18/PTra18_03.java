/*
 * PTra18_03.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import practice18.entity.Player;

public class PTra18_03 {

	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) {

		ArrayList<Player> array = new ArrayList<>();

		/*
		 * ①
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */


		// ★ ①のArrayListの中から"レアル・マドリード", "バルセロナ"の選手を除外してください
		try(Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))) {
	           while (scanner.hasNext()) {

	               String line = scanner.nextLine();

	               Player player = new Player();

	               String[] aaa = line.split(",");


	               player.setPosition(aaa[0]);
	               player.setName(aaa[1]);
	               player.setCountry(aaa[2]);
	               player.setTeam(aaa[3]);

	               array.add(player);
	           }

	           } catch (FileNotFoundException e) {
	               System.out.println("ファイルが見つかりません");
	           }
		for(int i=array.size()-1;i>0;i--){


	         Player player= array.get(i);
	            	   String team = player.getTeam();
	            	   if(player.getTeam().equals("レアル・マドリード")||player.getTeam().equals("バルセロナ")){
	            		   array.remove(i);
	            		   

	                	}


	            	 //  array.remove(array.indexOf("レアル・マドリード"));
	                	//array.remove(array.indexOf("バルセロナ"));
	                	}
		for(Player name:array ) {


	                	   System.out.println(name);
	                   }
	}
	                   }


		// ★ 削除後のArrayListの中身を全件出力してください




