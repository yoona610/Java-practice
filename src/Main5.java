
public class Main5 {
	public static void main(String args[]) {
		System.out.println("メソッドを呼び出します");
		hello("ジェヒョン");
		hello("テヨン");
		hello("マーク");
		System.out.println("メソッドの呼び出しが終わりました");
		methodA();
		System.out.println(add(add(10, 20), add(30, 40)));
		System.out.println(add(100, 27));
		System.out.println(add(3.5, 2.7));
		System.out.println(add("NCT", "127"));
//		int[] array = { 1, 2, 3 };
//		printArray(array);
//		incArray(array);
//		for (int i : array) {
//			System.out.println(i);
//		}
		int[] array = makeArray(3);
		for (int i : array) {
			System.out.println(i);
		}

	}

	public static void hello(String name) {
		System.out.println(name + "さん、こんにちは");
	}

	public static void methodA() {
		System.out.println("methodA");
		methodB();
	}

	public static void methodB() {
		System.out.println("methodB");
	}

	public static int add(int x, int y) {
		return x + y;
	}

	public static double add(double x, double y) {
		return x + y;
	}

	public static String add(String x, String y) {
		return x + y;
	}

	public static int add(int x, int y, int z) {
		return x + y + z;
	}

	public static void printArray(int[] array1) {
		for (int element : array1) {
			System.out.println(element);
		}
	}

	public static void incArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i]++;
		}
	}

	public static int[] makeArray(int size) {
		int[] newArray = new int[size];
		for (int i = 0; i < newArray.length; i++) {
			newArray[i] = i;
		}
		return newArray;
	}
}
