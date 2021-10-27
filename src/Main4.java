
public class Main4 {
	public static void main(String args[]) {
		int sansu = 20;
		int kokugo = 30;
		int rika = 40;
		int eigo = 50;
		int syakai = 80;

		int sum = sansu + kokugo + rika + eigo + syakai;
		int avg = sum / 5;
		System.out.println("合計点:" + sum);
		System.out.println("平均点:" + avg);

		int[] scores = { 20, 30, 40, 50, 80 };

		int num = scores.length;
		System.out.println("要素の数:" + num);
		scores[1] = 30;
		System.out.println(scores[1]);
		System.out.println(scores[0]);
		int scores1[] = new int[] { 20, 30, 40, 50, 60 };
		int scores2[] = { 20, 30, 40, 50, 60 };
		System.out.println(scores1[4]);
		System.out.println(scores2[3]);

		int sum1 = scores[0] + scores[1] + scores[2] + scores[3] + scores[4];
		int avg1 = sum / scores.length;
		System.out.println("合計点:" + sum1);
		System.out.println("平均点:" + avg1);

		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
		}

		int sum2 = 0;
		for (int i = 0; i < scores.length; i++) {
			sum2 += scores[i];
		}
		int avg2 = sum2 / scores.length;
		System.out.println("合計点:" + sum2);
		System.out.println("平均点:" + avg2);

		int count = 0;
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] >= 50) {
				count++;
			}
		}
		System.out.println("50点以上の科目の数は:" + count);

		int seq[] = new int[10];
		for (int i = 0; i < seq.length; i++) {
			seq[i] = new java.util.Random().nextInt(4);
		}
		for (int i = 0; i < seq.length; i++) {
//			switch(seq[i]) {
//			case 0:
//				System.out.println("A");
//				break;
//			case 1:
//				System.out.println("T");
//				break;
//			case 2:
//				System.out.println("G");
//				break;
//			case 3:
//				System.out.println("C");
//				break;
//			}
			char[] base = { 'A', 'T', 'G', 'C' };
			System.out.println(base[seq[i]]);
		}

		for (int value : scores) {
			System.out.println(value);
		}

		int[] arrayA = { 1, 2, 3 };
		int[] arrayB;
		arrayB = arrayA;
		arrayB[0] = 100;
		System.out.println(arrayA[0]);
	}
}
