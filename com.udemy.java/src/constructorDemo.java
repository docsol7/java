public class constructorDemo {
    /*A constructor is a block of code that is executed when an object for the class is created.
    The constructor should have the sam name as the class and it does not return a value.
    if we do not define a constructor the compiler wil call on an implicit default constructor.
    there is a default and parametrized constructor

     */

    public static void main(String[]args){
        constructorDemo cd = new constructorDemo(100,5);
        constructorDemo cd1= new constructorDemo("hello");
        constructorDemo cd2= new constructorDemo();

        cd.getData();
    }

    public  constructorDemo(){
        System.out.println("This is a user created constructor");
    }

    public void getData(){
        System.out.println("data");
    }

    public constructorDemo(int a, int b ){
        int c= a * b;
        System.out.println("Parametrized constructor with int : " +c);
    }

    public constructorDemo(String ss){

        System.out.println("Parametrized constructor with string : " +ss);
    }
}
