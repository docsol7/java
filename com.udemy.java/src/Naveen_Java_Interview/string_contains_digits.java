package Naveen_Java_Interview;

public class string_contains_digits {

    public static void chechkingForDigits(String line){
        int length= line.length();
        for (int i=0;i<length;i++){
            if (Character.isDigit(line.charAt(i))){
                System.out.println("contains digit");
            }
            else
                System.out.println("no digits");
        }

    }

    public static boolean isempty(CharSequence line){
        return line==null || line.length()==0;
    }

    public static boolean isNumeric(CharSequence line){
       if (isempty(line)){
           return false;
       }
       int len= line.length();
       for (int i=0;i<len;i++){
           if (! Character.isDigit(line.charAt(i))){
               return false;
           }
       }
        return true;
    }

    public static void isNumber(String line){
        if (line.length()==0 || line==null){
            System.out.println("String is empty");
        }
        for (int i=0;i<line.length();i++){
            if (!Character.isDigit(line.charAt(i))){
                System.out.println("no digit");
                return;
            }
        }
        System.out.println("digit present");
    }
    public static void main(String[] args) {
//                  chechkingForDigits("123agaha12");
        System.out.println(isNumeric(""));
        System.out.println(isNumeric("123"));
        System.out.println(isNumeric("abc123"));
        System.out.println(isNumeric("\u0967"));
        System.out.println(isNumeric("9870"));
        isNumber("27a890");
    }
}
