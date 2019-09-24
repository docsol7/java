import java.util.Scanner;

public class reverseString {

    public static void main (String[]args){

        //check if the string is a palindrome/reverse the string

        String s = "rahul";
        String result = new StringBuffer(s).reverse().toString();
        System.out.println(result);

        String s2 ="We can do it";
        String result2 = new StringBuffer(s2).reverse().toString();
        System.out.println(result2);

        String s3 ="madam";
        String t ="";
        for (int i = s3.length()-1 ;i >=0 ; i --){
            t = t + s3.charAt(i);
        }
        System.out.println(t);
        if (s3==t){
            System.out.println("It is a palindrome");
        }else {
            System.out.println("not a palindrome");
        }

        String s4="I am a software tester";
        String tt="";
        for (int i =s4.length()-1;i>=0;i--){
            tt= tt+ s4.charAt(i);
        }System.out.println(tt);



    }
}
