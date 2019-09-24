package Naveen_Java_Interview;

public class StringManipulation_points {
    public static void main(String[] args) {
        String a="She sells sea shells on the sea shore";

        //nos of letter in the string
        System.out.println(a.length());

        //no of words
        String[] words =a.split(" ");
        System.out.println(words.length);
        for (String print:words){
            System.out.println(print);
        }
        System.out.println("***************");
        //reverse each word
        StringBuilder bg= new StringBuilder();
        for (String word:words){
            String res = new StringBuffer(word).reverse().toString();
            bg.append(res + " ");
        }
        System.out.println(bg.toString());
    }


}
