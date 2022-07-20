package homework_week2;

//Write a Java program to add two binary numbers.
// Input Data:Input first binary number: 10 Input second binary number: 11
// Expected Output:Sum of two binary numbers: 101 17.

import java.util.Scanner; // scanner required java programme to be import

public class Que16 { // public class

    public static void main(String[] args) { // main method
        Scanner a = new Scanner (System.in); // use of Scanner object
        System.out.println("Input Data");
        System.out.print( "      Input first binary number:"); // print First binary statement
        String x = a.next(); // save in String variable x
        System.out.print ("      Input Secont binary number:"); //print Second birnay number
        String y = a.next(); // Save in String variable y

        int n1 = Integer.parseInt(x, 2); // addition of binary number need by using integer class
        int n2 = Integer.parseInt(y, 2); // conversion of String binary to corresponding integer number by integer parseint class
        int n3 = n1 + n2; // addition of n1 & n2

        System.out.println("Expected Output:"); //print statement

        System.out.println("         Sum of two binary numbers : " +Integer.toBinaryString(n3)); //print outcome statement

    }

}
