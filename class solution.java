import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n;
       n=sc.nextInt();
       if(n%2==1)
       System.out.print("Weird");
       else if(n>=2&&n<=5)
       System.out.print("Not Weird");
       else if(n>=6&&n<=20)
       System.out.print("Weird");
       else if(n>20)
       System.out.print("Not Weird");
    }
}
