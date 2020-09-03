package PackageA2;
import java.util.*;
public class Die_Roll {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a,b;
		String arr[]= {"1/6","1/3","1/2","2/3","5/6","1/1"};
		a=scan.nextInt();
		b=scan.nextInt();
		a = Math.max(a, b);
		System.out.println(arr[6-a]);
	}

}
