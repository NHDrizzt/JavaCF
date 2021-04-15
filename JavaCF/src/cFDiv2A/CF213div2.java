package cFDiv2A;

import java.util.Scanner;

public class CF213div2 {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		String[] s = sc.nextLine().split(" ");
		int n = Integer.parseInt(s[0]);
		int k = Integer.parseInt(s[1]);

		int res = 0;
		int t;
		for (int i = 0; i < n; i++) {
			String tmp = sc.nextLine();
			for (int j = 0; j <= k; j++) {
				t = tmp.indexOf(Integer.toString(j));
				if (t == -1)
					break;
				if (j == k)
					res++;
			}
		}
		System.out.println(res);

	}
}
