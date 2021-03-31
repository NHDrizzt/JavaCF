package JavaC;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Hash {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        
        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }
    HashSet<String> dset = new HashSet<>();
    for(int i=0; i<t;i++){
        dset.add(pair_left[i] +","+ pair_right[i]);
        System.out.println(dset.size());
    }
	}

}
