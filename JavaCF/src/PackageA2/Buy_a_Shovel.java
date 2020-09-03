package PackageA2;
import java.util.*;

public class Buy_a_Shovel {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a,b,c;
		a=scan.nextInt();
		b=scan.nextInt();
		c=a%10;
		for(int i=1;i<10;i++) {
			if(c*i%10==0 || c*i%10==b) {
				System.out.println(i);
				break;
			}
		}
	}

}
