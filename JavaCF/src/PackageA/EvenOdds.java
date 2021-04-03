package PackageA;


import java.util.Scanner;


public class EvenOdds {

	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		long a=sc.nextLong(), b=sc.nextLong(), c=0, d = a/2;
		if(a%2 == 1) {
			d++;
		}
		
		if(b <= d) {
			c = b*2-1;
		}
		else {

			c = (b-d)*2; 
		}
		System.out.println(c);
	}
}
