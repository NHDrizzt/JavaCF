package PackageA;
import java.util.Scanner;

public class Word {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		int b=0,c=0;
		for(int i=0;i<a.length();i++) {
			if(Character.isUpperCase(a.charAt(i))) {
				b++;
			}
			else {
				c++;
			}
		}
		if(b>c) {
			System.out.println(a=a.toUpperCase());
		}else {
			System.out.println(a=a.toLowerCase());
		}
		
	}

}
