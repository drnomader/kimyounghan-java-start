package method;

public class MethodCasting2 {
	public static void main(String[] args) {
		int number = 100;
		printNumber(number); // 자동 형변환 통해 int -> double
	}

	public static void printNumber(double n) {
		System.out.println("숫자: " + n);
	}
}
