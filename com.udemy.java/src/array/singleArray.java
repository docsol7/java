package array;

public class singleArray {

    public static void main(String[]args){

        int a[]=new int[5];
        a[0]=2;
        a[1]=5;
        a[2]=8;
        a[3]=11;
        a[4]=14;

        for (int i =0; i < a.length; i++){
            System.out.println(a[i]);
        }

        int b[]={1,3,5,7,9,13};
        for (int i =0;i<b.length;i++){
            System.out.println(b[i]);
        }

    }
}
