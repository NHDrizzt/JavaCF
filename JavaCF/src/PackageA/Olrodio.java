package PackageA;

import java.util.Scanner;

public class Olrodio {


	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n=in.nextShort(),t=in.nextShort();
		
		if(t==10 && n<2) {
			System.out.println("-1");
		}
		else {
			System.out.print(t);
			if(t==10) {
				for(int i=0; i<n-2;i++) {
					System.out.print(0);
				}
			}
			else {
				for(int i=0; i<n-1; i++) {
					System.out.print(0);
				}
			}
		}
	}
}