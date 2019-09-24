package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hasMapDemo {

    public static void main(String[]args){


        HashMap hp = new HashMap();
        hp.put(1, "january");
        hp.put(2,"february");
        hp.put(3,"march");
        hp.put(5,"april");
        hp.put(4,"may");
        hp.put(6,"sunday");
        System.out.println(hp);
        hp.remove(6);
        System.out.println(hp);
        System.out.println(hp.get(3));
        System. out.println(hp.size());
        System.out.println("**********");
           Set aa=hp.entrySet();
           Iterator it= aa.iterator();
           while (it.hasNext()){

               Map.Entry em = (Map.Entry )it.next();
               System.out.println(em.getKey());
               System.out.println(em.getValue());
//               System.out.println(em.getClass());
           }
        System.out.println("************");//returning set view of the entire map
           Set<Map.Entry<Integer,String>>setVal =hp.entrySet();
           for (Map.Entry<Integer,String> val:setVal){
               System.out.println(val.getKey());
               System.out.println(val.getValue());
           }
        System.out.println("************");


    }

}
