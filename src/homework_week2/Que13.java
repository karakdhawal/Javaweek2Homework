package homework_week2;

//Write a Java program that takes three numbers as input to calculate and print the average of the numbers.

public class Que13 { // public class

    public static void main (String [] args ) { // main method

        int a = 5; // local variable
        int b = 10;
        int c = 9;
        int d = ((a+b+c)/3);

        System.out.println(d); // printing statement from local variable
        avg(4,9,8); // calling static method into main method - no return with parameter
    }

    public static void avg (int a, int b, int c){ // static method - no return with parameter

        System.out.println((a+b+c)/3); // printing statement


    }


}
