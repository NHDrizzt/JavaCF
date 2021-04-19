package cFDiv2A;

import java.util.*;

public class MoutainScenery {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[2*n+2];
        int count = 0;
        for(int i =1; i  <arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 1; i < arr.length; i++) {
            
            if(i%2==0 && count < k){
                
                if(arr[i] - arr[i-1] >= 2 && arr[i] - arr[i+1] >=2 ){
                
                    System.out.print(arr[i] - 1 +" ");
                    count++;
                }
                else {
                    System.out.print(arr[i] + " ");
                }
                
            } else {
                    System.out.print(arr[i] + " ");
                }
        }   
    }
}
