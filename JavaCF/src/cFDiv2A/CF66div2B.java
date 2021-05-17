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
			int PositionRightSide = i + 1;
			while (PositionRightSide < sizeArray && arr[PositionRightSide] <= arr[PositionRightSide - 1]) {
				countMaxRectangles++;
				PositionRightSide++;
			}

			// checks possible rectangles to the left side of the array from the position i
			int PositionLeftSide = i - 1;
			while (PositionLeftSide >= 0 && arr[PositionLeftSide] <= arr[PositionLeftSide + 1]) {
				countMaxRectangles++;
				PositionLeftSide--;
			}
			// save the highest valid rectangles found
			max = Math.max(max, countMaxRectangles);
		}
		System.out.println(max);
		sc.close();
	}

}
