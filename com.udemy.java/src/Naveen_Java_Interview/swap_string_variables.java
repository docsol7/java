package Naveen_Java_Interview;

public class swap_string_variables {

    public static void main(String[] args) {
        String a ="hello";
        String b= "namaste";

        System.out.println("the value before swapping is:");
        System.out.println("The value of a is-->"+a);
        System.out.println("The value of b is-->"+b);

        //the would append the two strings and get a new a
        a=a+b;    //-hellonamaste
        //i would store initial string a in b
        b=a.substring(0,a.length()-b.length());   //substring from point 0 and hellonamaste-namaste;
        //now i store the initial b in a
        a=a.substring(b.length());
        System.out.println("the value after swapping is:");
        System.out.println("The value of a is-->"+a);
        System.out.println("The value of b is-->"+b);

    }
}
