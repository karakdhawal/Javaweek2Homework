package homework_week2;
//Write a Java program to compute the specified expressions and print the output.
// Test Data: ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)) Expected Output : 2.138888888888889
public class Que12 { //public class

    public static void main (String [] args){ //main method

        double a = (25.5*3.5-3.5*3.5); // local variable data type - double type
        double b = (40.5-4.5);
        double c = (a/b);

        System.out.println("Expected Output : " +c); // printing statement in double data type
    }
}
