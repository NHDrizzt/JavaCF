package JavaC;

import java.io.*;
import java.util.*;

public class token {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String result = "[!._,'@? ]";
        StringTokenizer str = new StringTokenizer(s,result);
        System.out.println(str.countTokens());
         while(str.hasMoreTokens()) {
         System.out.println(str.nextToken());
        }
        scan.close();
    }
}

