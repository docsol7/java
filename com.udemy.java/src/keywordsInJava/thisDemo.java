package keywordsInJava;

public class thisDemo {
    /*
    A THIS keyword is used to define a global variable and call that global variable in a method which has a local variable.
  Q- get the sum of local and global variable
     */

    int a = 5; // this is global variable
     public void getData(){
         int a = 2; // this is a local variable
         System.out.println(a); // this wil print 2 from local variable
         //to print the global variable
         System.out.println("printing global variable " +this.a);
         //to get sum of local and global variable
         int sum= this.a + a;
         System.out.println("the sum  is " +sum);
     }

     public static void main (String[]args){
         thisDemo td = new thisDemo();
         td.getData();
     }
}
