package homework_week2;

// Write a Java program to convert a decimal number to binary number.
//Input Data: Input a Decimal Number : 5
//Expected Output
import java.util.Scanner; //import Java Scanner

public class Que17 { //public class

    public static void main (String [] args){ // main method

        int number, i = 0;
        int binary [] = new int[5];
        Scanner x = new Scanner( System.in);
        System.out.println("Input Data:");
        System.out.print( "      Input a Decimal Number :");
        number = x.nextInt();

        while (number!=0){
            binary[i]=number%2;
            number = number/2;
            i++;

        }

        System.out.println( "Expected Output");
        System.out.print("Binary number is: ");
        for (int j=i; j>=0;j--)
        {

            System.out.print("" + binary[j] );
        }



        // Scanner user input

    }


}
