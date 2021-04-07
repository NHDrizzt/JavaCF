package CFDiv2;

import java.util.Scanner;

public class CF368div2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt();
		boolean test = false;
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				String c = sc.next();
				if (c.equals("C") || c.equals("M") || c.equals("Y")) {
					test=true;
				}
			}
		}
		System.out.println((test) ?"#Color":"#Black&White");
	}
}
