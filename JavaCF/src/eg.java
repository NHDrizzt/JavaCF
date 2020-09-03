
import java.util.Scanner;

public class eg {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		a=a.toLowerCase();
		b=b.toLowerCase();	
		if(b.compareTo(a)>0) {
			System.out.println("-1");
		}
		else if(a.compareTo(b)>0) {
			System.out.println("1");
		}
		else {
			System.out.println("0");
		}
		
	}

}
