package cFDiv2A;

import java.util.Scanner;

public class CF66div2B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sizeArray = sc.nextInt();
		int[] arr = new int[sizeArray];

		for (int i = 0; i < sizeArray; i++) {
			arr[i] = sc.nextInt();
		}
		int max = 0;

		for (int i = 0; i < sizeArray; i++) {
			int countMaxRectangles = 1;

			// checks possible rectangles to the right side of the array from the position i
			int PositionToTheRightSide = i + 1;
			int a = PositionToTheRightSide;
			while (a < sizeArray && arr[a] <= arr[a - 1]) {
				countMaxRectangles++;
				a++;
			}

			// checks possible rectangles to the left side of the array from the position i
			int PositionToTheLeftSide = i - 1;
			int b = PositionToTheLeftSide;
			while (b >= 0 && arr[b] <= arr[b + 1]) {
				countMaxRectangles++;
				b--;
			}
			// save the highest valid rectangles found
			max = Math.max(max, countMaxRectangles);
		}
		System.out.println(max);
		sc.close();
	}

}
