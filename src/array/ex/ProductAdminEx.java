package array.ex;

import java.util.Scanner;

public class ProductAdminEx {
	public static void main(String[] args) {
		int maxProducts = 10;
		String[] productNames = new String[maxProducts];
		int[] productPrices = new int[maxProducts];
		int productCount = 0;

		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.print("1. 상품 등록 | 2. 상품 목록 | 3. 종료\n메뉴를 선택하세요:");
			int menu = scanner.nextInt();
			/*
			nextInt(): # + /n 형태로 입력됨
			# 만 int 값으로 담기고, /n 은 남아있게 됨
			이어서 nextLine() 으로 입력값 받을 때 남아있는 /n 이 자동 대입돼버림
			이를 방지하기 위해 nextLine() 바로 붙여서 /n 값 날려줘야 함
			*/
			scanner.nextLine();

			if (menu == 1) {
				if (productCount >= maxProducts) {
					System.out.println("더 이상 상품을 등록할 수 없습니다.");
					continue;
				}

				System.out.print("상품 이름을 입력하세요:");
				productNames[productCount] = scanner.nextLine();

				System.out.print("상품 가격을 입력하세요:");
				productPrices[productCount] = scanner.nextInt();

				productCount++;
			} else if (menu == 2) {
				if (productCount == 0) {
					System.out.println("등록된 상품이 없습니다.");
					continue;
				}

				for (int i = 0; i < productCount; i++) {
					System.out.println(productNames[i] + ": " + productPrices[i] + "원");
				}
			} else if (menu == 3) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("잘못된 메뉴를 선택하셨습니다.");
			}
		}
	}
}
