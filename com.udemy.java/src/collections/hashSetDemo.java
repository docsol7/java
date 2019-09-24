package collections;

import java.util.HashSet;
import java.util.Iterator;

public class hashSetDemo {
    /*
    The set collections unlike the list does not allow duplicate value, we cannot find index because the data is not stored sequentially.
    set returns the value in random order unlike list.
    use of iterator is imp
     */

    public static void main(String[]args){
        HashSet hs = new HashSet<>();
        hs.add("India");
        hs.add("Turkey");
        hs.add("U.S.A");
        hs.add("mumbai");
        hs.add("amsterdam");
        System.out.println(hs);
        hs.remove("turkey");
        hs.add("India");
        System.out.print(hs);
        System.out.println(hs.isEmpty());
        System.out.println(hs.clone());
        System.out.println(hs);
         Iterator i = hs.iterator();
         while (i.hasNext()){
             System.out.println(i.next());
         }
//        System.out.println(i.next());
//        System.out.println(i.next());
//        System.out.println(hs.spliterator());

    }
}
