package cFDiv2A;

import java.util.Scanner;

public class CF556div2A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		String input = sc.next();

		int count0 = 0;
		int count1 = 0;
		for (int i = 0; i < n; i++) {
			if (input.charAt(i) == '1') {
				count1++;
			} else {
				count0++;
			}
		}

		int pairs = Math.min(count0, count1);

		System.out.println(n - pairs * 2);
	}

}
