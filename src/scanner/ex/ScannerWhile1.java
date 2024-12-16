package scanner.ex;

import java.util.Scanner;

public class ScannerWhile1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (true) {
			System.out.print("이름을 입력하세요 (종료를 입력하면 종료): ");
			String name = input.nextLine();

			if (name.equals("종료")) {
				System.out.println("프로그램을 종료합니다");
				break;
			}

			System.out.print("나이를 입력하세요: ");
			int age = input.nextInt();
			input.nextLine(); // nextInt() 끝에 남은 /n 개행값 없애줘야 함

			System.out.println("입력한 이름: " + name + ", 나이: " + age);
		}
	}
}
