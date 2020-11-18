package PackageB;

import java.util.*;
import java.util.Scanner;

public class Substring_Comparison {

    public static String getSmallestAndLargest(String s, int k) {
    	String b ;
    	SortedSet<String> a = new TreeSet<String>();
    	for(int i=0; i <= s.length()-k;i++) {
    		a.add(s.substring(i,i+k));
    	}
    	
    	b = a.first() + " " + a.last();

    	
        return b;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}