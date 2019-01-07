/*
 * PTra18_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import practice18.entity.Player;

public class PTra18_04 {

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
		try (Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))) {
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
		ArrayList<Player> gkList = new ArrayList<>();
		ArrayList<Player> dfList = new ArrayList<>();
		ArrayList<Player> mfList = new ArrayList<>();
		ArrayList<Player> fwList = new ArrayList<>();

		for (int i = array.size() - 1; i > 0; i--) {
			Player player= array.get(i);
			switch (player.getPosition()) {
			case "GK":
				gkList.add(player);
				break;

			case "DF":
				dfList.add(player);

					break;
			case "MF":
				mfList.add(player);

				break;
			case "FW":
				fwList.add(player);

				break;
			}

			//player.getPosition().equals("GK");
			//player.getPosition().equals("DF");
			//player.getPosition().equals("MF");
			//player.getPosition().equals("FW");

		}

		Collections.shuffle(gkList);

		for(int i=0; i<1;i++) {
			System.out.println(gkList.get(i));
		}

		Collections.shuffle(dfList);
		for(int i=0;i<4;i++) {

			System.out.println(dfList);

		}
		Collections.shuffle(mfList);
		for(int i=0;i<4;i++) {
			System.out.println(mfList);

		}

		Collections.shuffle(fwList);
		for(int i=0;i<2;i++) {
			System.out.println(fwList);

		}



		// ★ ①のArrayListの中からGK1名、DF4名、MF4名, FW2名をランダムで出力してください
		//	player.getTeam().equals("レアル・マドリード")
	}



}

//各ポジションのリストを作る   for switch case if
//そのリストから人数分の人を呼び出す。
