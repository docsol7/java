package Naveen_Java_Interview;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class trial {
    public static void main(String[] args) {
        String a[]={"she"," sells"," sea ","shells"};
        ArrayList<String> al= new ArrayList<>();
        for (String e:a){
            System.out.println(e);
        }
        System.out.println("***********");

        ListIterator li= al.listIterator(al.size());
        while(li.hasPrevious()){
            System.out.println(li.previous());}

//        Iterator it =al.iterator();
//       it.forEach(show -->{
//           System.out.println(show)
//       });
    }
}
