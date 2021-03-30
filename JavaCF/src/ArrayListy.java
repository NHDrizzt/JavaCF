import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListy {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        int n = scan.nextInt();

        for (int i=0;i<n;i++) {
            ArrayList<Integer> row = new ArrayList<>();
            int d = scan.nextInt();
            
            for(int j=0; j<d;j++) {
                row.add(scan.nextInt());
            }
            graph.add(row);
        }
        int q = scan.nextInt();
        for(int i=0; i<q; i++) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            try {
                System.out.println(graph.get(x-1).get(y-1));
            }catch(IndexOutOfBoundsException e) {
                System.out.println("ERROR!");
            }
        }

	}

}
