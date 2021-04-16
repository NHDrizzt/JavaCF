package cFDiv2A;

import java.util.Scanner;

public class CF225div2A {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), top = in.nextInt();
		int bot;
		int f1, f2;
		for (int i = 0; i < n; i++) {
			f1 = in.nextInt();
			f2 = in.nextInt();
			bot = 7 - top;
			if (bot == f1 | bot == 7 - f1 | bot == f2 | bot == 7 - f2) {
				System.out.println("NO");
				System.exit(0);
			}

		}
		System.out.println("YES");

	}

}