package PackageA;
import java.util.*;

public class PoliceRecruits {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a,b,c=0,d=0,e=0;
		a = scan.nextInt();
		for(int i=0;i<a;++i) {
			b = scan.nextInt();
			if(b>0) {
				c+=b;
			}
			if(b<0) {
				if(c<=0) {
					d++;
				}else 
				c--;
			}
			
		}
		System.out.println(d);
	}
}
	 
