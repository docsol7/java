package Naveen_Java_Interview;

import java.util.*;

public class dupliacte_word_string_prac {

    static String a[]={"red","blue","red","purple","green","white"};


    public static void hashset_use(){
        HashSet<String> hs= new HashSet<>();
        for(String color:a){
            if (hs.add(color)==false){
                System.out.println("The duplicate color present in array is "+color);
            }

        }
    }

    public static void hashMap_use(){
        HashMap<String, Integer> hp = new HashMap<>();
        for (String colorName: a){
            Integer count = hp.get(colorName);
            if (count == null){
                hp.put(colorName,1);
            }else {
                hp.put(colorName,++count);
            }
        }
        Set<Map.Entry<String,Integer>> printSet =hp.entrySet();
        for (Map.Entry<String, Integer> name:printSet){
            if (name.getValue()>1) {
                System.out.println("The duplicate color in array is -->"+name.getKey());
            }
        }
    }

    public static void hashmap_list(){
         List<String>   listVal=  Arrays.asList(a);
         HashMap<String,Integer> map = new HashMap<>();
         for (String name:listVal){
             if (map.get(name)!= null){
                 System.out.println("The duplicate name is --->"+name);
             }else{
                 map.put(name,1);
             }
         }
    }


    public static void attempt(String c){
        String[] store =c.split(" ");
//        List<String>   lsitName= Arrays.asList(store);
        HashSet<String> hs = new HashSet<>();
        for (String name:store){
            if (hs.add(name)==false){
                System.out.println("The word that repeats in the string is -->"+name);
            }
        }
    }

    public static void main(String[] args) {
        hashset_use();
        System.out.println("***********");
        hashMap_use();
        System.out.println("***********");
        hashmap_list();
        System.out.println("***********");
        String b ="She sells sea shells on sea shore";
        attempt(b);
    }
}
