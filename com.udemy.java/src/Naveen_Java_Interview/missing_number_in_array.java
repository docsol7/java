package Naveen_Java_Interview;

public class missing_number_in_array {


    public static void main(String[] args) {
        /*int a[] = {1,3,4,8,9,10,12,2,5,6,11};
          int sum = 0;
           for (int i = 0; i < a.length; i++) {
            sum=sum+a[i];
        }     int sum1=0;
              for (int j =1;j<=12;j++){
                     sum1=sum1+j;
        }    int missingNumber = sum1-sum;
             System.out.println("The missing number from array is :"+missingNumber);
         */

        int a[] = {1,3,4,5};
        //1- find sum of the array
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum=sum+a[i];
        }
        System.out.println("the sum of array is "+sum);

        //2-now the complete sequence we need to add tht is 1-5
        int sum1=0;
        for (int j =1;j<=5;j++){
            sum1=sum1+j;
        }
        System.out.println("the sum of complete sequence 1-5 is "+sum1);

        int missingNumber = sum1-sum;
        System.out.println("The missing number from array is :"+missingNumber);
    }
}