package PackageA;
import java.util.*;

public class Black_Square {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a,b,c,d,ans=0,e;
		String s;
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		d = scan.nextInt();
		s = scan.next();
		
	
		for(int i=0;i<s.length();i++) {
			e = s.charAt(i);
			e = Character.getNumericValue(e); 
			if(e == 1){
				ans += a;
			}
			else if(e == 2){
				ans += b;
			}
			else if(e == 3){
				ans += c;
			}
			else if(e == 4){
				ans += d;
			}
		}
		System.out.println(ans);
	}

}
