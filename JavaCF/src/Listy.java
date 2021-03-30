import java.io.*;
import java.util.*;

public class Listy {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
        LinkedList<Integer> list = new LinkedList<>();
        for(int i=0; i<n;i++){
            list.add(sc.nextInt());
        }
        int q = sc.nextInt();
        for(int i=0; i<q; i++){
            if(sc.next().equals("Insert")){
                int a = sc.nextInt();
                int b = sc.nextInt();
                list.add(a,b);
            }
            else{
                int c = sc.nextInt();
                list.remove(c);
            }
        }
        for (Integer num : list) {
            System.out.print(num + " ");
        }
	}

}
