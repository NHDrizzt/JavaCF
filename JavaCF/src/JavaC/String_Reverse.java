package JavaC;

import java.util.*;

public class String_Reverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        String A=sc.next();
        StringBuilder in = new StringBuilder();
        in.append(A);
        in = in.reverse();
        if(A.equals(in.toString())) {
        	System.out.println("Yes");
        }
        else {
        	System.out.println("No");
        } 
    }
}
