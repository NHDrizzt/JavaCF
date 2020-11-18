package PackageB;

import java.util.*;
import java.util.Scanner;

public class test {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0,k);
        String largest = "";
        String abc = new String("abc");
        String abc1 = new String("abcd");
        int x = abc.compareTo(abc1);

        System.out.println("O valor é: "+x);

       
      
        
        for(int i=0;i<s.length()-k+1;i++){
        	int ab= s.substring(i,i+k).compareTo(smallest);
        	  System.out.println(ab);
        	  System.out.println(s.substring(i,i+k));
        if(s.substring(i,i+k).compareTo(smallest) <0) smallest = s.substring(i,i+k);
        if(s.substring(i,i+k).compareTo(largest) >0) largest = s.substring(i,i+k); 
        }
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}