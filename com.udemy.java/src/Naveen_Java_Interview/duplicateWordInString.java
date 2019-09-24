package Naveen_Java_Interview;

import java.util.HashMap;
import java.util.Set;

public class duplicateWordInString {
    public static void main(String[] args) {
        System.out.println("start");

        String rep="Happy people stay happy always and find the smallest happy place";
        String[] repWordArray = rep.split(" ");
        HashMap<String,Integer>hp= new HashMap<>();
        for (String word:repWordArray){
            word = word.toLowerCase();
            Integer count=hp.get(word);
            if(hp.get(word)==null){
                hp.put(word,1);
            }else{
                hp.put(word,++count);
            }
        }
        Set<String> strings = hp.keySet();
        for (String repKey:strings){
            if (hp.get(repKey) > 1) {
                System.out.println("word: " + repKey+ ", count: "+hp.get(repKey));
            }
        }


//        String sa = "Happy people stay happy always and find the smallest happy place";
//        //string to array
//        String[] line= sa.split(" ");
//        //intd hashMap
//        HashMap<String, Integer> hp1 = new HashMap<>();
//        for (String words:line){
//            Integer count = hp1.get(words);
//            if (count==0){
//                hp1.put(words,1);
//
//            }else {
//                hp1.put(words,++count);
//            }
//        }
//        //keyset
//        Set<String> setVal= hp1.keySet();
//        for (String val:setVal){
//            if (hp1.get(val)>1){
//                System.out.println("The repeated word is==>"+val+" repeating "+ hp1.get(val)+" times.");
//            }
//        }


    }
}
