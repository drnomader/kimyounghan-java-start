package loop.ex;

public class ForEx2 {
	public static void main(String[] args) {
		// for (초기식; 조건식; 증감식)

		// ver.1
		for (int num = 2, count = 1; count <= 10; num += 2, count++) {
			System.out.println(num);
		}

		// ver.2
		// for loop 내에서 수를 세는 용도로만 count 사용
		// 가독성 더 좋음
		int num = 2;
		for (int count = 1; count <= 10; count++) {
			System.out.println(num);
			num += 2;
		}
	}
}
