package PackageA2;
import java.util.*;


public class Free_Ice_Cream {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int b=scan.nextInt();
        long sum=scan.nextLong();
        int c=0;
        while(b-->0)
        {
            String s=scan.next();
            int a=scan.nextInt();
            if(s.equals("+"))
            {
                sum+=a;
            }
            else if(s.equals("-"))
            {
                if(sum<a)
                {
                    ++c;
                }
                else
                {
                    sum-=a;
                }
             
            }
        }
        System.out.println(sum+" "+c);
    }
}
