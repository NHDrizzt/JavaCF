package cFDiv2A;

import java.util.Scanner;

public class CF289div2A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(),k = sc.nextInt();
		int a, b, sum = 0, cnt = 0;
		while (n-->0) {
			a = sc.nextInt();
			b = sc.nextInt();
			sum += (b - a) + 1;
			}
		if (sum % k == 0) {
			System.out.println("0");
		}
		else {
			System.out.println(k - (sum % k));
		}

	}

}
