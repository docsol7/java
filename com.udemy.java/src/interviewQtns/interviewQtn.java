package interviewQtns;

import java.util.*;

public class interviewQtn {

    public static void main(String[]args){
        //given an array of numbers print the unique number  and duplicate values
        //given a string of letters find the unique letter
        //rearrange numbers in ascending order

        int a []={5,4,8,4,4,2,5,8,9,2,2};

        //Step1; Import arraylist
        ArrayList al = new ArrayList();

        //step2: start a for loop to through the numbers in the array
        for (int i =0;i< a.length;i++){
            //once in the loop we check for numbers starting from index 0 and then we apply an if condition seeing if it contains a number and return as false to go into loop
            int k =0;

            if (!al.contains(a[i])){

              //add the number to this block
                al.add(a[i]);
                k++;

                     for (int j = i+1;j< a.length;j++){
                         if (a[i]==a[j]){
                             k++;
                         }

                     }
                     System.out.println("The number repeating is "+a[i]+ " and it repeats "+k+" number of times.");
                     if (k==1){
                         System.out.println(a[i]+ " is the unique number.");
                     }
            }
        }
        System.out.println("********************");
            String s[]={"j","k","j","l"};
            for (int i=0;i<s.length;i++)
            {
                for (int j=i+1;j<s.length;j++){
                    if (s[i].equals(s[j]) )
                        System.out.println(s[i]);

                }
            }

            HashSet<String> hs=new HashSet<>();
            for (String e:s){
                if (hs.add(e)==false)
                    System.out.println(e+" duplicate value using hashet");
            }

        HashMap<String,Integer>hp = new HashMap<>();
            for (String e:s){
                Integer count = hp.get(e);
                if (count==null){
                    hp.put(e,1);
                }else {
                    hp.put(e, 1+count);
                }
            }
        Set<Map.Entry<String, Integer>> val= hp.entrySet();
            for (Map.Entry<String,Integer> it:val){
                if(it.getValue()>1)
                    System.out.println(it.getKey()+"duplicate value Hashmap");
            }
    }
}
