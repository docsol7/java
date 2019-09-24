package Naveen_Java_Interview;

public class remove_junk_string {
    /*
    how to remove junk/unwanted characters from your string? --BY USING REGULAR EXPRESSION AND REPLACE ALL FUNCTION
     */
    public static void main(String[] args) {

        String s ="%&%&%^&&% happy &(&^(^(%% Birthday %*&&^%&%%56546";

        //regular expression [azAZO9]- im saying replace all regular expressions with this type

        String s1= s.replaceAll("[azAZO9]"," ");
        System.out.println(s1);
        //-%&%&%^&&% h ppy &(&^(^(%% Birthd y %*&&^%&%%56546

        String s2 = s.replaceAll("[a-zA-Z0-9]"," ");
        System.out.println(s2);
        //%&%&%^&&%       &(&^(^(%%          %*&&^%&%%

        String s3 = s.replaceAll("[^a-zA-Z0-9]"," ");
        System.out.println(s3);
        // happy           Birthday          56546
        //--mention^ that says i want everything mentioned here in the[..] in this expression



    }
}
