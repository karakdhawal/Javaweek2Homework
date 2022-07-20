package homework_week2;

public class Que6 {// public class
    //  Write a program to enter any radius value of the circle and find out the area.(Formula of Area A=PI*r*r).

    public static void main (String [] args) { // main method

        double PI = 3.1415926535897932d; // value of PI, use double data type from floatingpoint - numeric - primitiv
        double r = 4d;

        System.out.println( "Formula of Area A = PI*r*r = " + (PI*r*r)); //printing statement answer with float
        A(5); // calling static method in main method and use parameter - answer in different way
    }

    public static void A (int r){ // static method with parameter
        System.out.println ("Formula of Area A = PI*r*r = " + (3.14*r*r)); // printing statement with string concatenation

    }
}
