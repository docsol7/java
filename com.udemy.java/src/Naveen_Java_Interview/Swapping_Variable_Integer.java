package Naveen_Java_Interview;

public class Swapping_Variable_Integer {
    public static void main(String[] args) {

        int x= 99;
        int y = 25;

        //with third variable
//        int a;
//        a = x;
//        x= y;
//        y=a;
//        System.out.println("with third variable value of x is: "+x+" and y is: "+y);

        //without third variable---- using +and - operators
//        x=x+y;
//        y=x-y;
//        x=x-y;
//        System.out.println("with third variable value of x is: "+x+" and y is: "+y);

        //without variables using *operator
//        x=x*y;
//        y=x/y;
//        x=x/y;
//        System.out.println("using the * operator, x value is : "+ x+" & y value is :"+y);

        //using XOR^
        x=x^y;
        y=x^y;
        x=x^y;
        System.out.println("using XOR^, x value is : "+ x+" & y value is :"+y);


    }
}
