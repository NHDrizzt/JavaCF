package PackageA;
import java.util.*;
public class StonesOnTheTable2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a,b,c=0;
		a = scan.nextInt();
		String s;
		s = scan.next();
		char d;
		for(int i=0; i<a-1;i++) {
			d = s.charAt(i);
			if(d == s.charAt(i+1)) {
				c++;
			}
		}
		System.out.println(c);
	}

}
