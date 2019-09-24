package revision_self;

import java.util.*;

public class String_qtns {

    public void reverseWord(String name){
        String reversedWord = new StringBuffer(name).reverse().toString();
        System.out.println("The reversed word is "+ reversedWord);
    }

    public void palindromeCheck(String name){
        for (int i =0;i<name.length()/2;i++){
            if (name.charAt(i)!=name.charAt(name.length()-i-1)){
                System.out.println("Yes the word "+name+ " is not a  palindrome");
            }
        }System.out.println("The word "+name+" is  a palindrome");

    }

    public void repeatedWordInArray(String[] name){
        List<String> li = Arrays.asList(name);
        HashMap<String,Integer> hp= new HashMap<>();
        for (String everyWord:li){
            if (hp.get(everyWord)!= null){
                System.out.println("The repeated word in the array is -->"+ everyWord);
            }else
                hp.put(everyWord,1);
        }
    }

    public void repeatedWordInString(String name){
        String[] inArray = name.split(" ");
        //to get number of words in string?
//        int numberOfWords = name.length();
//        System.out.println("The number of words in the string are "+numberOfWords);
        System.out.println("The number of words in the string are "+ inArray.length);
        HashSet<String> hs= new HashSet<>();
        for (String word:inArray){
            if (hs.add(word)==false){
                System.out.println("The repeated word in the string is --->"+word);
            }
        }
    }

    public void reverseWordInString(String name){
        String[] everyWord= name.split(" ");
        StringBuilder build = new StringBuilder();
        for (String word:everyWord){
            String buffWord = new StringBuffer(word).reverse().toString();
            System.out.println(buffWord);
            build.append(buffWord+" ");
        }
        System.out.println(build.toString());
    }

    public void swapVariable(){
        String a ="hello";
        String b ="namaste";

        a= a+b;//hellonamaste
        b= a.substring(0,a.length()-b.length());//hello
        a= a.substring(b.length());
        System.out.println("The new words are a==>"+a+" & b==>"+b);
    }

    public void removeJunk(String line){
       String result=  line.replaceAll("[^a-zA-Z0-9]"," ");
        System.out.println(result);
    }


    public static void main(String[] args) {
        String_qtns str = new String_qtns();
        str.palindromeCheck("madam");
        String color[]={"red","blue","white","purple","blue"};
        str.repeatedWordInArray(color);
        str.reverseWord("LovelyWorld");
        String repeat="Happy people stay happy always and find the smallest happy place";
        str.repeatedWordInString(repeat);
        str.reverseWordInString(repeat);
        str.swapVariable();
        String s ="%&%&%^&&% happy &(&^(^(%% Birthday %*&&^%&%%56546";
        str.removeJunk(s);

        String rep="Happy people stay happy always and find the smallest happy place";
        String[] repWordArray = rep.split(" ");
//        for (int i =0;i<repWordArray.length;i++){
//            for (int j =i+1;j<repWordArray.length;j++){
//                if (repWordArray[i].equals(repWordArray[j])){
//                    System.out.println(repWordArray[i]);
//                }
//            }
//        }

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
//        Set<Map.Entry<String, Integer>> entrySet = hp.entrySet();
//        for (Map.Entry<String,Integer> word1:entrySet){
//            if (word1.getValue()>1){
//                System.out.println("The repeated word is "+word1.getKey()+" is repeated"+word1.getValue());
//            }
//        }


    }




}
