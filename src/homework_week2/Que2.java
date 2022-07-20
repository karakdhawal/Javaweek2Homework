package homework_week2;

//Write a Java programme using the following steps.
//2.1 Declare two static variables
//2.2 Declare one static method
//2.3 Call both static variables into the static method inside the print statement. 2.4 Declare the Main method.
//2.5 Call the static method into the Main method and Run the programme.


public class Que2 { //public class

    static int a = 20;  // static variance
    static String name = "Lord EU";  // static variance

    static void add (){ // static method
        System.out.println(a); // print static variance in static method
        System.out.println(name); // print static variance in static method

    }

    public static void main (String [] args) {// main method
        add(); // called static method in main method - no object needed as both are static



    }


}
