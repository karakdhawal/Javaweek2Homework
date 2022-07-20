package homework_week2;

//Write a Java programme using the following steps.
//3.1 Declare one instance and one static variable.
//3.2 Declare one instance method.
//3.3 Declare one static method.
//3.4 Call both instance and static variables i
//nto both instance and static methods inside the print statement.
//3.5 Declare the Main method.
//3.6 Call both instance and static methods into the Main method and run the programme.

public class Que3 {
 // public class
    int a = 10; // instance or global variable
    static int b = 5; // static variable

    void ins () { // instance  method
        Que3 obj = new Que3(); // create object to call static variable in to instance method
        System.out.println(a); // print instance variable
        System.out.println(b); // print static variable

    }

    static void met () { // static method
        Que3 obj = new Que3(); // create object to call instance variable in to static method
        System.out.println(obj.a); // print instance variable using object
        System.out.println(b); // print static variable
      }

    public static void main (String [] args){ // main method

        Que3 obj = new Que3(); // created object to call instance method
        obj.ins(); // call instance method using object
        met(); // call static method no objective required as static to static
    }



}
