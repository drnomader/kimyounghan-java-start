package method;

public class MethodCasting1 {
	public static void main(String[] args) {
		double number = 1.5;
		// printNumber(number); // double -> int: incompatible types
		printNumber((int) number); // 명시적 형변환 통해 double -> int
	}

	public static void printNumber(int n) {
		System.out.println("숫자: " + n);
	}
}
