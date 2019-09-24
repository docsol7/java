package revision_self;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class integer_qtns {

     void reverseNumber(int abc){
       String  res= new StringBuffer(String.valueOf(abc)).reverse().toString();
         System.out.println("The reversed number using StringBuffer is ==>"+res);
         int xyz=0;
         while( abc !=0){
             xyz = xyz*10+abc%10;
             abc=abc/10;
         }
         System.out.println("The reversed number using dummy variable and while is ==>"+xyz);
    }

    void palindromeNumber(int num){
         int revNum=0;
         int z;
         z=num;
         while(num!=0){
             revNum=revNum*10+num%10;
             num=num/10;
         }
         if (revNum==z){
             System.out.println("The number is a palindrome");
         }else
             System.out.println("The number is not a palindrome");

    }

    void repeatedNumber(Integer[]nums){
         List<Integer> liNum = Arrays.asList(nums);
        HashSet<Integer> hs= new HashSet<>();
        for (Integer repNum:liNum){
            if (hs.add(repNum)==false){
                System.out.println("The repeated number in array is ==>"+repNum);
            }
        }
    }

    void uniqueNumber(int[] num){
        ArrayList al= new ArrayList();
        for (int i = 0; i<num.length;i++){
            int count =0;
            if (!al.contains(num[i])){
                al.add(num[i]);
                count++;
                for (int j =i+1;j<num.length;j++){
                    if (num[i]==num[j]){
                        count++;
                    }
                }if (1==count)
                System.out.println("The unique number is ==>"+num[i]);
            }
        }
    }

    void mazMinNumber(int[] num){
         int max=0;
         int min=0;
         for (int i=0;i<num.length;i++){
             if (num[i]>max){
                 max = num[i];
             }else if (num[i]< min){
                 min= num[i];
             }
         }
        System.out.println("The maximum number in array is "+max+" & the minimum number in array is: "+min );

    }

    void missingNum(int[]num,int z){
         int sum=0;
         for (int i=0;i<num.length;i++){
             sum= sum+num[i];
         }
         int sum1=0;
         for (int j=1;j<=z;j++){
             sum1=sum1+j;
         }
         int missinVal = sum1-sum;
        System.out.println(missinVal +" is missing from the list");
    }

    void swapInteger(int x,int y){
         x= x+y;
         y=x-y;
         x=x-y;
        System.out.println("The new value of x is "+x + "and of y is "+y);

    }

    void primeNumber(int num){
         for (int i=2;i<num;i++){
             if (num%i==0){
                 System.out.println("The number :"+num+ " is not a prime number");
                 break;
             }else{
                 System.out.println("The number :"+num+ " is  a prime number");
                 break;
             }
         }
    }

    boolean primeNumber2(int num){
        for (int i=2;i<num;i++){
            if (num%i==0){
                return false;
            }
        }
        return true;
    }



    public static void main(String[] args) {
        int a[]={1,2,3,4,4,3,2,6,6,9,9,6,7,4,7};
        Integer b[]={1,2,3,4,5,6,6,7,8,9,0};
        int c=789969987;
        int d=98765;
        int e[]={1,2,3,4,6,7,8};
        int f[]={1,4,-7,10,727,0,-727};

        integer_qtns iq= new integer_qtns();

        iq.uniqueNumber(a);
        iq.repeatedNumber(b);
        iq.palindromeNumber(c);
        iq.reverseNumber(d);
        iq.missingNum(e,8);
        iq.mazMinNumber(f);
        iq.swapInteger(7,49);
        iq.primeNumber(7);
        iq.primeNumber(12);
        System.out.println("The number is a prime number:"+iq.primeNumber2(3));
        System.out.println("The number is a prime number:"+iq.primeNumber2(24));
    }

}
