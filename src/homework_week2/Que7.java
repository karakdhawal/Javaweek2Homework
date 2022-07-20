package homework_week2;

public class Que7 {//class method
    // Write a program to insert any temperature value in degree Fahrenheit
    // and convert to degree Celsius ((F − 32) × 5/9 = 0°C).

    public static void main(String[] args) { // main method

        int F = 100; // local variable
        int C = ((F-32)*5/9 ); // local variable

        System.out.println("Celcius = " +C); // printing statement of local variable - answer 1st way
        c(104); // calling static method in main method - no return type with parameter

    }

    public static void c (int f){ // static method
        System.out.println("Celcius = "+ ((f-32)* 5/9)); // printing statement of static void method

    }
}