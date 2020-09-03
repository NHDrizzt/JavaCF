package PackageA;
import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;


public class BoyorGirl {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		int c;
		c = a.length();
		Set<Character> act = new HashSet<Character>();
		for(int i=0;i<c;i++) {
			act.add(a.charAt(i));
		}
		if(act.size()%2 != 0) {
			System.out.println("IGNORE HIM!");
		}
		else {
			System.out.println("CHAT WITH HER!");
		}	
	}

}
