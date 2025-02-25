package array;

public class ArrayDi0 {
	public static void main(String[] args) {
		// 2차원 배열
		// 2 x 3 배열(행 2, 열 3)
		int[][] arr = new int[2][3];

		arr[0][0] = 1; // 0행, 0열
		arr[0][1] = 2; // 0행, 1열
		arr[0][2] = 3; // 0행, 2열

		arr[1][0] = 4; // 1행, 0열
		arr[1][1] = 5; // 1행, 1열
		arr[1][2] = 6; // 0행, 2열

		// 0행 출력
		System.out.print(arr[0][0] + " "); // 0열 출력
		System.out.print(arr[0][1] + " "); // 1열 출력
		System.out.print(arr[0][2] + " "); // 2열 출력
		System.out.println(); // 개행

		// 1행 출력
		System.out.print(arr[1][0] + " "); // 0열 출력
		System.out.print(arr[1][1] + " "); // 1열 출력
		System.out.print(arr[1][2] + " "); // 2열 출력
	}
}
