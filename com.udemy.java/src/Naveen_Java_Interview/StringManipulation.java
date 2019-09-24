package Naveen_Java_Interview;

public class StringManipulation {
    public static void main(String[] args) {
        String str = "I will get a good jobg";
        String str1 = "I will get a good jobg";

        System.out.println(str.length());
        System.out.println(str.indexOf("g"));
        System.out.println(str.charAt(12));
        System.out.println(str.substring(4,19));
        System.out.println(str.indexOf("job"));
        System.out.println("When the work is not present in string ans is-->"+str.indexOf("happy"));
        System.out.println(str.indexOf('g',str.indexOf('g')+1)); // g occurring second time
        //compare strings
        System.out.println(str.equalsIgnoreCase(str1));
        //trim
        String str2="   GOOD JOB IS MINE   ";
        System.out.println(str2.trim());//this will trim front and back space not middle
        //replace
        System.out.println(str2.replace(" ","_"));//for middle space
        String date="25-09-2019";
        System.out.println(date.replace("-",":"));
        //split
        String str3 ="I will get my desired job";
        String val[]=str3.split(" ");
        for (String st:val){
            System.out.println(st);
        }
        //reverse
        String reverse = new StringBuffer(str3).reverse().toString();
        System.out.println(reverse);
        System.out.println("****************");
        String dummy=" ";
        for (int i=str3.length()-1;i>=0;i--){
            dummy= dummy+str3.charAt(i);
        }System.out.println(dummy);
        //concatinate
        String str4 ="Full";
        System.out.println(str4.concat("Time"));

        String str5 ="Successful";
        String str6="Job";
        int a=100;
        int b=100;
        System.out.println(str5+str6+a+b); //-->SuccessfulJob100100
        System.out.println(str5+str6+(a+b));//--->SuccessfulJob200



    }
}
