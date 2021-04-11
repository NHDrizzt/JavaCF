package cFDiv2A;

import java.util.Scanner;

public class CF785div2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(),sum=0;
		for (int i = 0; i < a; i++) {
			String b = sc.next();
			if (b.charAt(0) == 'T') {
				sum+=4;
			} else if (b.charAt(0) == 'C') {
				sum+=6;
			} else if (b.charAt(0) == 'O') {
				sum+=8;
			} else if (b.charAt(0) == 'D') {
				sum+=12;
			}
			else if (b.charAt(0) == 'I') {
				sum+=20;
			}	
		}
		System.out.println(sum);
		sc.close();
	}
}
