package Naveen_Java_Interview;

public class reverseString {
     /*
     how to reverse a string?

     diff between string buffer and string
     -string bugger is immutable and has reverse function
     -string is immutable and does not have a reverse function
     */
    public static void main(String[] args) {

        String a ="holocast";

        String result = new StringBuffer(a).reverse().toString();
        System.out.println(result);

        System.out.println("***********");

        String result2="";
        for (int i =a.length()-1;i>=0;i--){
            result2 = result2+ a.charAt(i);
        }System.out.println(result2);

    }
}
