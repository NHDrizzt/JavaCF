package PackageA2;
import java.util.*;
public class Juicer {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a,b,c,d=0,e, ans=0;
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		
		for(int i=0; i<a;i++) {
			e = scan.nextInt();
			if(e <= b) {
				d += e;
			}
			if(d > c) {
				d = 0;
				ans++;
			}
		}
		System.out.println(ans);
		
	}
}
