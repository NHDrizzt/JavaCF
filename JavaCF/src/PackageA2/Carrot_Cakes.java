package PackageA2;
import java.util.*;
public class Carrot_Cakes {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n,t,k,d, test=0, count=0,a,b,c;
		n = scan.nextInt();
		t = scan.nextInt();
		k = scan.nextInt();
		d = scan.nextInt();
		a = (t+d)/t;
		System.out.println(a);
		if(a*k<n) 
			System.out.println("YES");
		
		else
			System.out.println("NO");
	}
}
