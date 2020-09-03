package PackageA;
import java.util.*;

public class Sereja_And_Dima_A {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int s = 0,d = 0,num, num2;
		num = scan.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		
	
		for(int i=0;i<num;i++) {
			num2=scan.nextInt();
			list.add(num2);
		}
		Collections.sort(list, Collections.reverseOrder());
		for(int i=0;i<list.size();i++) {
			if(i%2==0) {
				s += list.get(i);
			}
			else {
				d += list.get(i);
			}
		}
		if(d==0) {
			System.out.println(s);
		}
		else if(s==0) {
			System.out.println(d);
		}
		else {
			System.out.println(s+" "+d);
		}
	}
}
/*
import java.util.Scanner;

public class Main {
 
 
    public static void main(String[] args) {
 
        Scanner in=new Scanner(System.in);
 
        int n=in.nextInt();
 
        int[]value=new int[n];
 
        for(int i=0;i<value.length;i++)
        {
            value[i]=in.nextInt();
        }
 
        int l=0,r=n-1;
 
        int s=0,d=0;
 
        boolean p=true;
 
        while(l<=r)
        {
            if(value[l]>=value[r])
            {
              if(p)
                  s+=value[l];
              else
                  d+=value[l];
 
              l++;
 
            }
 
            else if(value[r]>value[l])
            {
                if(p)
                    s+=value[r];
                else
                    d+=value[r];
 
                r--;
            }
 
            if(p)
                p=false;
            else
                p=true;
        }
 
        System.out.println(s+" "+d);
 
   }
}
*/