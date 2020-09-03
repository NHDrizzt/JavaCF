package PackageA2;
import java.util.*;
public class Helpful_Maths {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String s = scan.next();
		int b=0;
		s = s.replace("+", "");
		char arr[] = s.toCharArray();
		Arrays.sort(arr);
		for(char x : arr) {
			System.out.print(x);
			if(b != arr.length-1) {
				System.out.print("+");
			}
			b++;
		}
	}
}
