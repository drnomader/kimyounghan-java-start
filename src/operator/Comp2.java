package operator;

public class Comp2 {
	public static void main(String[] args) {
		// 문자열 비교 메서드 : equals()
		String str1 = "문자열1";
		String str2 = "문자열2";

		boolean result1 = "hello".equals("hello");
		boolean result2 = str1.equals("문자열1");
		boolean result3 = str1.equals(str2);

		// 라인 완성 단축키 : Ctrl + Shift + Enter
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);

		System.out.println("hello" == "hello"); // 항상 true가 보장되지 않음
	}
}
