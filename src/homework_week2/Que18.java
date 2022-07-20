package homework_week2;

// Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
// Test Data:
// Input first number: 125
// Input second number: 24
// Expected Output :
// 125 + 24 = 149
// 125 - 24 = 101
// 125 x 24 = 3000
// 125 / 24 = 5
// 125 mod 24 = 5

import java.util.Scanner;

public class Que18 {

    public static void main (String [] args){

    Scanner a = new Scanner( System.in);
    System.out.println("    Test Data:");
    System.out.print("Input first number: ");
    String x = a.next();
    System.out.print("Input second number: ");
    String y = a.next();

    int n1 = Integer.parseInt(x);
    int n2 = Integer.parseInt(y);
    int n3 = n1+n2;

    System.out.println("Expected Output:");
    System.out.println(n1+"+"+n2 +"="+ n3);
    System.out.println(n1+"-"+n2+"="+(n1-n2));
    System.out.println(n1+"X"+n2+"="+(n1*n2));
    System.out.println(n1+"/"+n2+"="+(n1/n2));
    System.out.println(n1+"mod"+n2+"="+(n1%n2));

    }
}
