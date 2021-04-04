package PackageA;

import java.util.HashSet;
import java.util.Scanner;

public class BeTheGuy {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int p = sc.nextInt();
		HashSet<Integer> dset = new HashSet<>();
		for(int i=0; i<p;i++) {
			dset.add(sc.nextInt());
		}
		int q = sc.nextInt();
		for(int i=0; i<q;i++) {
			dset.add(sc.nextInt());
		}
		 if(dset.size() == n) {
			 System.out.println("I become the guy.");
		}
		 else {
			 System.out.println("Oh, my keyboard!");
				
		 }
	}
}
