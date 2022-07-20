package homework_week2;
//1. Write a Java programme using the following steps.
//1.1 Declare two instance variables.
//1.2 Declare one instance method.
//1.3 Call both instance variables into the instance method inside the print statement. 1.4 Declare the Main method.
//1.5 Call the above instance method into the Main method and Run the programme.
public class Que1 { //public class

    int a = 10; // instance or Global Variables
    String name = "Lord UK"; // instance or Global variable

    public static void main (String [] args){ // main method

        Que1 var = new Que1(); //create object
        var.add(); // called instance method in main method


    }

    void add (){ // instance method

        System.out.println(a); // printing instance variable
        System.out.println(name);


    }



}
