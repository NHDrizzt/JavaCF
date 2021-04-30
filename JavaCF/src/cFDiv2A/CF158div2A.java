package cFDiv2A;

import java.util.Scanner;

public class CF158div2A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int count = 0;
		if (k <= n) {
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
			int min = a[k - 1];
			if (min >= 0) {
				for (int i = 0; i < n; i++) {
					if (a[i] == 0) {
						count = count + 1;
						count--;
					} else if (a[i] >= min)
						count++;
				}
			}
			System.out.println(count);
		}

	}

}
