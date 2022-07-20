package homework_week2;

// Write a program for a calculator with addition, subtraction, multiplication and division methods
// all with parameters and use string concatenation methods.(Note: Two static and Two instance methods.)

public class Que5 { // public class method

    public static void main ( String [] args ){ // main method
        Que5 z = new Que5(); // using object to call instance method in static main method
        z.addition(10,5); // call instance method in static main method - with the help of object
        substraction(25,5); // call static method in static main method - no need of object
        z.multiplication(3,6); // call instance method in static main method with the help of object
        division(30, 5); // call static method in static main method - no need of object

   }

    public void addition(int a, int b) { // instance method of addition
        System.out.println("Addition is " +(a+b)); // printing statement with concatenation strings

    }
    public static void substraction (int a, int b) { // Static method of substraction
        System.out.println("Substraction is " + (a-b)); // printing statement with concatenation strings

    }

    public void multiplication(int a, int b) { // instance method of multiplication
        System.out.println("Multinplication is "+ (a*b)); // printing statement with the concantenation strings
    }

    public static void division(int a, int b){ // static method of division
        System.out.println("Division is " +(a/b)); // printing statement with the concantenation strings
    }

}
