package homework_week2;

//Write a Java programme using the following steps.
//4.1 Declare two instance and two static variables.
//4.2 Declare one instance method.
//4.3 Declare one static method.
//4.4 Call all four instance and static variables into both instance and static methods inside the print statement.
//4.5 Declare the Main method.
//4.6 Call both instance and static methods into the Main method and run the programme.

public class Que4 { // public class

    int a = 20; // instance variance
    int b = 10; // instance variance
    static int c = 5; // static variance
    static String name = "Lord UK"; //static variance

    void m (){ //instance method
        System.out.println(a); //print instance variance = a
        System.out.println(b); //print instance variance = b
        Que4 var = new Que4(); // create object to bring static variance into instance method
        System.out.println(c); // print static variance
        System.out.println(name); // print static variance
    }

    static void n () { // static method

        Que4 var = new Que4(); // create object to bring instance variance in to static method
        System.out.println(var.a); // print instance variance using object in static method
        System.out.println(var.b); // print instance variance using object in static method
        System.out.println(c); // print static variance direct to static method
        System.out.println(name); // print static variance direct to static method

    }

    public static void main(String[] args) { // main method
        Que4 var = new Que4(); //using object in main static method to call instance method
        var.m(); // call instance method using object in main static method
        n(); // call static method direct into main static method - no need of object
    }
}
