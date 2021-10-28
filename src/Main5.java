
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
		System.out.println(add(100, 20, 7));
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

}
