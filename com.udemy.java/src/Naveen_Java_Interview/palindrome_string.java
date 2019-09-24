package Naveen_Java_Interview;

public class palindrome_string {

     public static boolean is_word_palindrome(String word) {
          for(int i =0; i<word.length()/2;i++){
              if (word.charAt(i)!= word.charAt(word.length()-i-1)){
                  return  false;
              }
          }
         return  true;
     }

    public static void is_word_palindrome2(String word){
         for (int i =0;i<word.length()/2;i++){
             if (word.charAt(i) != word.charAt(word.length()-i-1)){
                 System.out.println("it is not a  palindrome2");
             }

         }System.out.println("it is a palindrome2");
    }

    public static void number_palindrome(int num){

         int sum=0;
         int t;
         t=num;
         while(num>0){

             sum= sum*10+num%10;
             num=num/10;
         }
         if (t==sum){
             System.out.println("number is a palindrome");
         }else{
             System.out.println("number is not a palindrome");}
    }

    public static void main(String[] args) {
       /* String m ="madams";

        for (int i =0;i <m.length()/2;i++){
            if (m.charAt(i)!= m.charAt(m.length()-i-1)){
                System.out.println("not");
                return;
            }
        }
        System.out.println("yes");*/
        System.out.println(is_word_palindrome("madam"));
        System.out.println("**********");
        is_word_palindrome2("madam");
        System.out.println("***************");
        number_palindrome(78987);



        Integer a =78987;
        String a_str = a.toString();
        for (int i=0;i<a_str.length()/2;i++){
            if (a_str.charAt(i)!= a_str.charAt(a_str.length()-i-1)){
                System.out.println("not");
                return;
            }
        }
        System.out.println("yes");


    }
}
