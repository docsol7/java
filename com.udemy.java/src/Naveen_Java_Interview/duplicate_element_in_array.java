package Naveen_Java_Interview;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class duplicate_element_in_array {
    public static void main(String[] args) {
        String langNames[]= {"Java","C","Python","Ruby","C","GO"};

        //1-for loop ----WORST WAY
        for(int i=0;i<langNames.length;i++){
            for(int j =i+1;j<langNames.length;j++){

                if(langNames[i].equals(langNames[j])){
                    System.out.println("The duplicate element is :" +langNames[i]+", found using for loop");
                }
            }
        }System.out.println("***************");

        //2-HashSet---- stores unique values 0(n)
        HashSet<String> hs= new HashSet<String>();
        for (String lname:langNames){
//            System.out.println(lname);--I am simply iterating the array i.e printing the values one by one
            if (hs.add(lname)==false){
                System.out.println("The duplicate element is :"+lname+", found using Hash Set");
            }
        }System.out.println("***************");

        //3-HashMap<langName,occurrence>--0(2n) & entrySET
        HashMap<String,Integer> hp = new HashMap<String,Integer>();
        /* ---In this for-loop we iterate the array and for every name we get we are counting it.
        then if the count is not zero we add the name and 1 key to the map else we add name and count++ to the map
        */
        for (String name:langNames) {
            Integer count = hp.get(name);
            if (count == null) {
                hp.put(name, 1);
            } else {
                hp.put(name, ++count);
            }
        }
          /*
          to get the values from hash map we use entrySet
          once entered set use for loop to iterate every value in the set
          and if the value is more than one , ge the key (lang names)of that value(number of times they occur in the array)
           */
        Set<Map.Entry<String,Integer>> entrySet =hp.entrySet();
        for (Map.Entry<String,Integer> entry :entrySet){
//            System.out.println(entry);
            if (entry.getValue()>1)
                System.out.println("The duplicate value is :"+entry.getKey()+" using hashMap");

        }







    }
}
