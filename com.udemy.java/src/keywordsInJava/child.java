package keywordsInJava;

public class child extends parent {

    /*
    SUPER Keyword is used when u want to call a method/variable/constructor from parent class but have the same one in child.
     */

    public child(){
        super();//whenever u invoke a parent constructor in child class, the super keyword should always be written in  the first line of the constructor method.
        System.out.println("This is a child class constructor");
    }

    String name ="manavi";
    public void getStringData ( ){
        System.out.println("this is data from child class method "+name);
        //if i want to  print name from parent class i will write super.name
        System.out.println("printed in child classs: " + super.name);
        //if u want to use a method from parent class
        super.getStringData();
    }

    public static void main (String[]args){
        child cc = new child();
        cc.getStringData();
        System.out.println(cc.name);
    }


}
