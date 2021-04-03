import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHand2 {

	public static void main(String[] args) {
	       try (Scanner scanner = new Scanner(System.in)) {
	          int n =scanner.nextInt();
	          int p = scanner.nextInt();
	          if(n < 0 && p <0) {
	        	  throw new Exception (" n or p should not be negative");
	          }
	          else if(n == 0 && p == 0) {
	        	  throw new Exception (" n and p should not be zero");
	          }
	          else {
	        	  System.out.println(Math.pow(n, p));
	          }

	        } catch (Exception ex) {
	            System.out.print(ex.getClass().getName());
	            System.out.print(ex.getMessage());
	        } 
	    }
}
