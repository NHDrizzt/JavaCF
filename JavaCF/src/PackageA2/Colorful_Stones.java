package PackageA2;
import java.util.*;
public class Colorful_Stones {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s,s1;
		s = scan.next();
		s1 = scan.next();
		char arr1[] = s.toCharArray();
		char arr2[] = s1.toCharArray();
		int ans=0;
		for(int i=0;i<s1.length();i++) {
			if(arr1[ans] == arr2[i]) {
				ans++;
			}
		}
		System.out.println(ans+1);
	}

}
