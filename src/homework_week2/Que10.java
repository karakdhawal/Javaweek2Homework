package homework_week2;

import java.util.Scanner;

public class Que10 { //public class

    public static void main(String[] args) { // main method

        int number, i; // variable
        Scanner input = new Scanner(System.in); //create scanner
        System.out.println("Enter the Number"); // print statement for asking number
        number = input.nextInt(); //

        for(i=1; i<11; i++) { // use of for loop for multiplication and number is increasing
            System.out.println(number + "X" + i + "=" + (number*i));
        }

    }
}