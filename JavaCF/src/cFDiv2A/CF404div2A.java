package cFDiv2A;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CF404div2A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.nextLine();
		String b;
		String[] n = new String[a];
		Set<Character> set1 = new HashSet<>();
		Set<Character> set2 = new HashSet<>();
		for(int i=0; i<a;i++) {
			n[i] = sc.next();
			for(int j=0; j<a;j++) {
				if(i==j || i+j==a-1) {
					set1.add(n[i].charAt(j));
				}
				else {
					set2.add(n[i].charAt(j));
				}
			}
		}
		System.out.println(set1.size() == 1 &&  set2.size()==1 && !set1.containsAll(set2) ? "YES":"NO");
	}
}
