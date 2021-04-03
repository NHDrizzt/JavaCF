import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ExceptionHand {

    public static void main(String[] args) {
       try (Scanner scanner = new Scanner(System.in)) {
          System.out.println(scanner.nextInt()/scanner.nextInt());
        } catch (ArithmeticException ex) {
            System.out.println(ex);
        } catch (InputMismatchException e){
            System.out.println(e.getClass().getName());   
        }
    }
}
