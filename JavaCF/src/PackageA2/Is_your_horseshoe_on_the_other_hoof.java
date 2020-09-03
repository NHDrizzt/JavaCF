package PackageA2;
import java.util.*;

public class Is_your_horseshoe_on_the_other_hoof {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a,b,c,d;
		Set<Integer> set = new HashSet<>();
		set.add(scan.nextInt());
		set.add(scan.nextInt());
		set.add(scan.nextInt());
		set.add(scan.nextInt());
		System.out.println(4-set.size());
	}
}
