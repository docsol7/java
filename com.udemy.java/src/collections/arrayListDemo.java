package collections;

import java.util.ArrayList;

public class arrayListDemo {


    public static void main(String[]args){

        ArrayList al = new ArrayList();
        al.add("Rahul");
        al.add("saurabh");
        al.add("vijay");
        al.add("vicky");
        al.add("shivum");
        System.out.println(al);
        al.remove("vicky");
        al.add(2,"krishan");
        al.add("saurabh");
        System.out.println(al);
        System.out.println("The size of the array list is " +al.size());
        System.out.println("the position os saurabh in the list is " +al.indexOf("saurabh"));
        System.out.println("the arrayList contains the name manavi : "+al.contains("manavi"));

    }
}
