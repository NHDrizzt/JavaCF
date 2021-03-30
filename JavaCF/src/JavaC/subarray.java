package JavaC;

import java.util.Scanner;

public class subarray {
 
  
 
    // Driver code
    public static void main(String args[])
    {
    	Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int c=0;
        for (int i = 0; i < n; i++) {
            int sum=0;
        	for (int j = i; j < n; j++) {
                sum += arr[j];
        
                if(sum<0) {
                	c++;
                }

            }
        }
        System.out.println(c);
    }
}