package PackageA;

import java.util.Scanner;

public class IsRated {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		short a = sc.nextShort();
		short d=0, aux=Short.MAX_VALUE;
		boolean e = false,f=false; 
		for(int i=0; i<a; i++) {
			short b = sc.nextShort();
			short c = sc.nextShort();
			
			if(b != c) {
				e = true;
			}
			if(b==c) {
				d++;
			}
			if(aux < b) {
				f = true;
			}
			aux = b;
		}
		if(e) {
			System.out.println("rated");
		}
		else if(f) {
			System.out.println("unrated");
		}
		else if(d==a) {
			System.out.println("maybe");
		}
	}
}
