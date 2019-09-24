package keywordsInJava;

public class tryCatchDemo {
    /*
    one try block can be followed by multiple catch blocks
    every try block must be followed by a catch block
    when u have multiple or single catch blocks, you can write the kind of exception to handle as in be specific ,
            so the exception wil look look for  that one particular exception only.
    finally block always follows try and catch but can also be just try an finally.
    q- is there some place where the finally block may not get executed?
        ans- it will not execute when u stop jvm forcefully i.e when click on run and u hit the red stop button

     */

    public static void main(String[]args){
        int a=7;
        int b=0;

        try {

            int div =a/b;
            System.out.println(div);

        }

        catch (ArithmeticException ae){
            System.out.println(" arithmetic error");
        }
        catch (Exception e){
            System.out.println("error");
        }

        finally {
            System.out.println(a+b);
            System.out.println(a*b);
            System.out.print("delete cookies");
        }


    }
}
