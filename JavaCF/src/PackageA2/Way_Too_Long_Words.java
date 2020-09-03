package PackageA2;
import java.util.*;
public class Way_Too_Long_Words {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a=scan.nextInt();
		for(int i=0;i<a;i++) {
			String s = scan.next();
			
			if(s.length() > 10) {
				s = s.charAt(0) + "" + (s.length()-2) + s.charAt(s.length()-1); 
				System.out.println(s);
			}
			else {
				System.out.println(s);
			}
			
		}
	}

}
