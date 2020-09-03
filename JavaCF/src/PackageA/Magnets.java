package PackageA;
import java.util.Scanner;

public class Magnets {

	public static void main(String[] args) {
		int n,num,ans=1;
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		int[] arr = new int[n]; 
		for(int i=0; i<n;i++) {
			num = scan.nextInt();
			arr[i] = num;
		}
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i] != arr[i+1]) {
				ans++;
			}
		}
		System.out.println(ans);
	}

}
		