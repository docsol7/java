package revision_self;

import java.util.*;

public class revision {

    static void reverseWord(String name){
        String result = new StringBuffer(name).reverse().toString();
        System.out.println(result);
    }

    static void palindrome(String word){
        for(int i =0; i<word.length()/2;i++){
            if (word.charAt(i)!= word.charAt(word.length()-i-1)){
                System.out.println("not a palindrome");
            }
        }
        System.out.println("palindrome");
    }

    static void reverseString(String line){
        String[] lineArray = line.split(" ");
        StringBuilder st = new StringBuilder();
        for (int i=lineArray.length-1;i>0;i--){
             st.append(lineArray[i] + " ");
        }
        System.out.println(st.toString());
    }

    static void reverseMirrorString(String line){
        String[] lineArray = line.split(" ");
        StringBuilder st = new StringBuilder();
        for (String word:lineArray){
            String result = new StringBuffer(word).reverse().toString();
            st.append(result+" ");
        }
        System.out.println(st.toString());
    }

    static void duplicate_word_in_Array(String[] line){
        HashSet<String> hs= new HashSet<>();
        for (String word:line){
            if (hs.add(word)==false){
                System.out.println(word+"is duplicate");
            }
        }
    }

    static void dupicate_unique_word_in_String(String line){
        String[] lineArray = line.split(" ");
        HashMap<String,Integer> hp = new HashMap<>();
        for (String word:lineArray){
            Integer count = hp.get(word);
            if (count== null){
                hp.put(word,1);
            }else
                hp.put(word,++count);
        }
        Set<Map.Entry<String, Integer>> entrySetVal = hp.entrySet();
        for (Map.Entry<String, Integer> word:entrySetVal){
           if(word.getValue()>1) {
               System.out.println(word.getKey()+" is repeated :"+word.getValue());
           }else if (word.getValue()==1){
               System.out.println(word.getKey()+" is unique");
           }
        }

    }

    static void reverseNum(int val){
        String result= new StringBuffer(String.valueOf(val)).reverse().toString();
        System.out.println(result+" using StringBuffer");

        int z=0;
        while(val!=0){
            z=z*10+val%10;
            val=val/10;
        }
        System.out.println(z+" using dummy int and while condition");
    }

    static void palindromNum(int i){
        int z=0;
        int a;
        a=i;
        while(i!=0){
            z=z*10+i%10;
            i=i/10;
        }if (a==z){
            System.out.println(" is a palindrome");
        }
    }

    static void repNum(Integer[] num){
        HashSet<Integer> hs= new HashSet<>();
        for (Integer rep:num){
            if (hs.add(rep)==false){
                System.out.println(rep+" is repeated");
            }
        }
    }

    static  void max_min_num(int[] val){
        int max=0;
        int min=0;
        for (int i =0;i<val.length;i++){
            if (val[i]<min){
                min= val[i];
                System.out.println(min+" is min num");
            }else if (val[i]>max){
                max= val[i];
                System.out.println(max+" is max num");
            }
        }

    }

    static void duplicate_num(int[] val){
        ArrayList al = new ArrayList();
        for (int i=0;i<val.length;i++){
            int count = 0 ;
            if ( !al.contains(val[i])){
                al.add(val[i]);
                count++;
                for (int j =i+1;j<val.length;j++){
                    if (val[i]==val[j]){
                        count++;
                    }
                }
                if (1==count){
                    System.out.println(val[i]+" is unique num");
                }
            }
        }
    }

    static void primeNum(int num){
        for (int i=2;i<num;i++){
            if (num%i==0){
                System.out.println("not prime number");
                break;
            }else
            {
                System.out.println("prime number");
                break;
            }
        }
    }

    public static void main(String[] args) {
        reverseWord("quality");
        reverseMirrorString("Happy morning is great morning");
        reverseString("Happy morning is a great morning");
        palindrome("madam");
        String color[]={"red","blue","white","purple","blue"};
        duplicate_word_in_Array(color);
        String a ="Happy world Happy";
        dupicate_unique_word_in_String(a);
        reverseNum(7890);
        palindromNum(76567);
        Integer b[]={1,2,3,4,5,6,6,7,8,9,0};
        repNum(b);
        int f[]={1,4,-7,10,727,0,-727};
        max_min_num(f);
        int g[]={1,1,-7,10,-727,10,-727};
        duplicate_num(g);
        primeNum(7);
        primeNum(6);
    }
}
