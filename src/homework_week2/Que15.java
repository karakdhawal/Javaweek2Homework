package homework_week2;

// Write a Java program to swap two variables.

public class Que15 { // public class

    public static void main (String [] args) { //main method

        int a = 10; //Local variables
        int b = 5;
        int temp; // use temp variable with null value to swap

        temp = a; // allocating value to temp variable
        a = b; // allocating value to a variable
        b = temp; // allocating value to b variable

        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }


}
