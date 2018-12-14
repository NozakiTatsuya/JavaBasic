package practice10;
/*
 * PTra10_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_06 {

	/*
	 * PTra10_05で作成したCarクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * carインスタンスを3件作成し、それぞれの色、ガソリンを入力して決定してください
		 * 各carインスタンスのrunメソッドを実行して、それぞれ「目的地にまでn時間かかりました。残りのガソリンは、xリットルです」を出力してください。
		 */
		Car[]car=new Car[3];

		Car car1=new Car();

		car1.gasoline =50;
	    car1.color="赤";

	    Car car2=new Car();
	    car2.gasoline =75;
	    car2.color="青";

	    Car car3=new Car();
	    car3.gasoline =100;
	    car3.color="緑";

	    car[0]=car1;
	    car[1]=car2;
	    car[2]=car3;

	    final int distance = 300;

	    for(int i=0; i<car.length;i++) {

			int x=0;
			int c =(0);
			while(distance>c) {
				int run = car[i].run();
				x++;
				c+=run;
				if (car[i].gasoline<= 0) {
					System.out.println("目的地に到達できませんでした");
				break;
				}

			}
			if (distance<=c) {
				System.out.println("目的地まで"+ x +"時間かかりました。残りのガソリンは、"+car[i].gasoline+"リットルです。");
			}
	    }

	}
}

