
public class practice54 {
	public static void main(String args[]) {
		double triangleArea = calcTriangleArea(127, 127);
		double circleArea = calcCircleArea(100);
		System.out.println("三角形の、面積は" + triangleArea);
		System.out.println("円の面積は" + circleArea);
	}

	public static double calcTriangleArea(double bottom, double height) {
		double area = (bottom * height) / 2;
		return area;
	}

	public static double calcCircleArea(double radious) {
		double area = radious * radious * 3.14;
		return area;
	}
}
