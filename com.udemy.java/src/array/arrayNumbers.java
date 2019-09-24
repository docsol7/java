package array;

public class arrayNumbers {

    public static void main (String[]args){

        //calculate the sum of a string
        //at what location is 7 present in the array

        int a []={10,11,2,6,9,3,7,8,90,33};
        int sum =0;
        for (int i=0;i<a.length;i++){
           sum = sum + a[i];
           if (a[i]==7){
               System.out.println(i);
               break; //used to optimise the loop by saying break we are stopping the loop at the point where the required condition is matched.
           }
        }
        System.out.println(sum);







    }
}
