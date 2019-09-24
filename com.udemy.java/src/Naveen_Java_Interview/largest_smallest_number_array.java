package Naveen_Java_Interview;

import java.util.Arrays;

public class largest_smallest_number_array {
    //from single and multi dimension array
    public static void main(String[] args) {
        int num[] = {1000, -88, 10, 2468, 12, -7};

        int smallest = num[0];
        int largest = num[0];

        //time complexity 0(n)-since we are using on for loop
        for (int i = 0; i < num.length; i++) {
            if (num[i] < smallest) {
                smallest = num[i];
            } else if (num[i] > largest) {
                largest = num[i];
            }
//            System.out.println(num[i]);
        }
        System.out.println("The smallest value in the array is :" + smallest);
        System.out.println("The largest value in the array is :" + largest);
        System.out.println(Arrays.toString(num));//to print outside for loop

        System.out.println("************");

        int numM[][] = {{1, 2}, {4, -5}, {8, 9}};

        int small = numM[0][0];
        int large = numM[0][0];

        for (int i = 0; i < 3; i++) {
            for (int j=0;j< 2; j++){
//                System.out.println(numM[i][j]);//to print the array complete
                                    // or just print specific number of row and col numM[0][1]=2
                if (numM[i][j]<small){
                    small= numM[i][j];
                }else if (large<numM[i][j]){
                    large= numM[i][j];
                }
//                System.out.println("The smallest value in the numM array is "+small);
//                System.out.println("The largest value in the numM array is "+large);
            }

        }
        System.out.println("specific numner form array "+numM[0][1]);
        System.out.println("The smallest value in the numM array is "+small);
        System.out.println("The largest value in the numM array is "+large);
    }
}