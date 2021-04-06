package PackageA;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FootBall {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, Integer> map = new HashMap<String, Integer>();
		short a = sc.nextShort();
		for(int i=0; i<a; i++) {
			String b = sc.next();
			if(!map.containsKey(b)) {
				map.put(b, 1);
			}else {
				map.put(b, map.get(b)+1);
			}
		}
		int max = Integer.MIN_VALUE;
        String ans = null;
        for(Map.Entry<String,Integer> e: map.entrySet())
        {
            if(e.getValue()>max){
                max= e.getValue();
                ans = e.getKey();
            }
        }
        System.out.println(ans);	
	}
}
