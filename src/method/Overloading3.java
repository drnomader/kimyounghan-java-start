package method;

public class Overloading3 {
	public static void main(String[] args) {
		System.out.println("1: " + add(1,2));
		System.out.println("2: " + add(1.2, 1.5));
	}

	// 해당 메서드 없으면 2번 메서드 호출됨
	// 2번 메서드는 자동 형변환되기에 호출 가능
	public static int add(int a, int b) {
		System.out.println("1번 호출");
		return a + b;
	}

	public static double add(double a, double b) {
		System.out.println("2번 호출");
		return a + b;
	}
}
