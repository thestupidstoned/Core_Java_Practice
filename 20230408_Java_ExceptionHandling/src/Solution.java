import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args)  throws ArithmeticException{
      
      
      Scanner read = new Scanner(System.in);
     

      try {
        System.out.println("Enter value 1: ");
      
      int x= read.nextInt();
      System.out.println("Enter value 2: ");
      int y= read.nextInt();

      int z=x/y;
      
    } catch (Exception e) {
        System.out.println("e :");
        System.out.println(e.getClass().getName());
        System.out.println();


        System.out.println("getMessage() output:");
        System.out.println(e.getMessage());
        System.out.println();
        
        System.out.println("toString() output:");
        System.out.println(e.toString());
        System.out.println();
        
        System.out.println("printStackTrace() output:");
        e.printStackTrace();
    }
   
      
      
    }
}