package PackageA2;
import java.util.*;
public class Anton_and_Letters {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Set<Character> dset = new LinkedHashSet<Character>();
		String a = scan.nextLine();
		
		a = a.replace("{", "");
		a = a.replace("}", "");
		a = a.replace(",", "");
		a = a.replaceAll("\\s+","");
		for(int i=0;i<a.length();i++) {
			dset.add(a.charAt(i));
		}
		System.out.println(dset.size());
	}
}

