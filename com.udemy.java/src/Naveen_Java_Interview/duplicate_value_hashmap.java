package Naveen_Java_Interview;

import java.util.*;

public class duplicate_value_hashmap {
    public static void main(String[] args) {
        String a[]={"Java","C","Python","Ruby","C","GO"};

        List inputList = Arrays.asList(a);
        printDuplicates(inputList);

        System.out.println("***************");
        HashMap<String,Integer> hp = new HashMap<>();
        for (String name:a){
            Integer count = hp.get(name);
            if (count == null){
                hp.put(name,1);
            }else {
                hp.put(name,++count);
            }
        }

//        for (String s : hp.keySet()) {
//            System.out.println(s);
//        }

        Set<Map.Entry<String,Integer> >ll =hp.entrySet();
        for (Map.Entry<String,Integer> val:ll){
            if (val.getValue()>1){
                System.out.println(
                        val.getKey()
                );
            }
        }

    }

    public static void printDuplicates(List<String> inputList) {
        Map<String, Integer> dupCheckMap = new HashMap<>();
        for (String word : inputList) {
            if (dupCheckMap.get(word) != null) {
                System.out.println(word + " is duplicate");
            } else {
                dupCheckMap.put(word, 1);
            }
        }
    }
}
