
public class Main3 {
	public static void main(String args[]) {
		boolean tenki = true;
		if (tenki == true) {
			System.out.println("洗濯をします");
			System.out.println("散歩に行きます");
		} else {
			System.out.println("DVDを見ます");
		}

		boolean doorClose = true;
		while (doorClose == false) {
			System.out.println("ノックする");
			System.out.println("１分待つ");
		}

		System.out.println("あなたの運勢を占います");
		int fortune = new java.util.Random().nextInt(5) + 1;
		switch (fortune) {
		case 1:
		case 2:
			System.out.println("いいね");
			break;
		case 3:
			System.out.println("普通です");
			break;
		case 4:
		case 5:
			System.out.println("うーん");
		}

		for (int i = 0; i < 2; i++) {
			System.out.println("こんにちは");
		}
		for (int i = 0; i < 10; i += 2) {
			System.out.println("現在" + i + "周目→");
		}
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.println(i * j);
			}
			System.out.println("");
		}

		int isHungry = 1;
		String food = "桃";
		System.out.println("こんにちは");
		if (isHungry == 0) {
			System.out.println("お腹がいっぱいです");
		} else {
			System.out.println("はらぺこです");
		}
		if (isHungry == 1) {
			System.out.println(food + "をいただきます");
		}
		System.out.println("ごちそうさまでした");

		boolean tenki1 = false;
		if (tenki1 == true) {
			System.out.println("洗濯をします");
			System.out.println("散歩に行きます");
		} else {
			System.out.println("DVDを見ます");
			System.out.println("寝ます");
		}

		System.out.println("[メニュー]1:検索2:登録3:削除4:変更2");
//		int selected = new java.util.Scanner(System.in).nextInt();
//		switch (selected) {
//		case 1:
//			System.out.println("検索します");
//			break;
//		case 2:
//			System.out.println("登録します");
//			break;
//		case 3:
//			System.out.println("削除します");
//			break;
//		case 4:
//			System.out.println("変更します");
//			break;
//		}

		System.out.println("【数当てゲーム】");
//		int ans = new java.util.Random().nextInt(10);
//		for (int i = 0; i < 5; i++) {
//			System.out.println("0-9の数字を入力してください");
//			int num = new java.util.Scanner(System.in).nextInt();
//			if (num == ans) {
//				System.out.println("アタリ");
//			} else {ß
//				System.out.println("違います");
//			}
//		}
		System.out.println("ゲームを終了します");
	}
}