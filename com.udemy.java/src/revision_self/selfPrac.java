package revision_self;

import java.util.*;

public class selfPrac {

    public static void repeatNumArray(int[] num){
        HashSet<Integer> hs= new HashSet<>();
        for (Integer repNum:num){
            if (hs.add(repNum)==false){
                System.out.println(repNum+" is repeated");
            }
        }
    }

    public static void UniqueNum(int[]num){


        ArrayList<Integer> al = new ArrayList<>();
        for (int i =0;i<num.length;i++){
            int count=0;
            if (!al.contains(num[i])){
                al.add(num[i]);count++;
                for (int j =i+1;j<num.length;j++){
                    if (num[i]==num[j]){
                        count++;
                    }
                }
            }if (count==1)
            System.out.println("unique num is===>"+num[i]);
        }
    }
    static void UniqueName(String[] names){
        List<String> listNames = Arrays.asList(names);
        HashMap<String,Integer> map = new HashMap<>();
        for (String name:listNames){
            Integer count = map.get(name);
            if (count==null){
                map.put(name,1);
            }else{
                map.put(name,++count);
            }
        }
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        for (Map.Entry<String,Integer> repName:entrySet){
            if (repName.getValue()==1){
                System.out.println("The unique name in list is ==>"+repName.getKey());
            }
        }
    }

    static void unique(String[]name){
        List<String> listVal = Arrays.asList(name);
        HashSet<String> hs= new HashSet<String>(listVal);
        for (String fruit:hs){
            System.out.println(fruit);
        }
    }

    public static void palindrome(String word){
        for (int i=0;i<word.length()/2;i++){
            if (word.charAt(i)!=word.charAt(word.length()-i-1)){
                System.out.println("it is  not  palindrome");
            }
        }
        System.out.println("yes palindrome");
    }

    public static void main(String[] args) {
        int a[]={1,2,3,4,4,3,2,6,6,9,9,6,7,4,7};
        String[] fruit ={"mango","apple","apple","pear","apple"};
        UniqueName(fruit);
        unique(fruit);
        repeatNumArray(a);
        UniqueNum(a);
        palindrome("madam");

    }
}
