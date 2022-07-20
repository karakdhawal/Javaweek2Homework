package homework_week2;

import java.util.Locale;

// Make class save your name in string variable and use all string methods.
public class que21 {

    public static void main (String [] args){

        String name = " Dhawal Karak ";


        System.out.println("Length of String is " +name.length());
        System.out.println("Character At 4 is " +name.charAt(4));
        System.out.println("Concat of String is "+name.concat(name));
        System.out.println("String Contains v? " +name.contains("v"));
        System.out.println("String Starts with D? "+name.startsWith("D"));
        System.out.println("String Ends with K? " +name.endsWith("K"));
        System.out.println("Strings are Equals?" + name.endsWith(name));
        System.out.println("Index of l is " +name.indexOf("l"));
        System.out.println("Is String empty? " +name.isEmpty());
        System.out.println("Replace String Character w with v - " +name.replace("w", "v"));
        System.out.println("Return Substring from 0 to 4 " +name.substring(0,4));
        System.out.println("Convert String into Character Array is " +name.toCharArray());
        System.out.println("Lower Case : " +name.toLowerCase());
        System.out.println("Upper Case : " +name.toUpperCase());
        System.out.println("Trim the String - " +name.trim());




    }
}
