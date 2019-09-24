package Naveen_Java_Interview;

public class reverseInteger {
    /*

     */
    public static void main(String[] args) {
        int value= 123456;
        int result=0;

        while(value !=0){
           result = result*10 + value%10;
           value= value/10;
        }
        System.out.println(result);

        //using stringBuffer

        int val= 98765;
        StringBuffer res = new StringBuffer(String.valueOf(val)).reverse();
        System.out.println(res);

    }
}
