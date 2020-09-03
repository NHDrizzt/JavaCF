package PackageA;
import java.util.*;

public class Games {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int ans=0,n;
		n=scan.nextInt();
		ArrayList<Integer> h= new ArrayList<>();
		ArrayList<Integer> g= new ArrayList<>();
		for(int i=0;i<n;i++) {
			h.add(scan.nextInt());
			g.add(scan.nextInt());
		}
		for(int j=0;j<n;j++) {
			for(int i=0;i<n;i++) {
				if(h.get(j) == g.get(i)) {
					ans++;
				}
			}
		}
		System.out.println(ans);
	}
}
