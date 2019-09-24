package keywordsInJava;

import sun.jvm.hotspot.tools.FinalizerInfo;

public class finalDemo {
    //a final keyword can be used when u do not want to change the value of a particular variable in your script,
    // give it a constant value by writing the word final in front of the variable
/*
when u mark a class as final u cannot extend that class
so instead of public className u write final className
when u mark  a method as final u cannot call it elsewhere and it cannot be overridden
so instead of public methodName u write final methodName
 */

    public void addnum(){
          final int a =5;
//        int a=2;
        int b=8;
        System.out.print(a+b);
    }
     public static void main(String[]args){
        finalDemo fd = new finalDemo();
        fd.addnum();

     }
}
