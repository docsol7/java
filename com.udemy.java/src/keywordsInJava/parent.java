package keywordsInJava;

public class parent {


    public parent(){

        System.out.println("This is a parent class constructor 1");
        System.out.println("This is a parent class constructor 2");
    }

    String name ="Solanki";
    public void getStringData ( ){
        System.out.println("data from parent class method "+ name);
    }

    public static void main (String[]args){
        parent pp = new parent();
        pp.getStringData();
        System.out.println(pp.name);
    }
}
