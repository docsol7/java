package array;

public class multiDimensial {

    public static void main (String[]args){

        //int a [rows] [columns]
        int a [][]= new int [3][3];
        a[0][0]=3;
        a[0][1]=4;
        a[0][2]=5;
        a[1][0]=6;
        a[1][1]=7;
        a[1][2]=8;
        a[2][0]=9;
        a[2][1]=10;
        a[2][2]=11;
        System.out.println(a[2][1]);
        System.out.println("**************");

        for (int i=0;i<3;i++){ //for rows

            for (int j =0;j<3;j++){ //for columns

                System.out.println(a[i][j]);

            }
            System.out.println("**************");

        }

        int b [][]={{1,1,3},{4,5,6}};
        System.out.println(b[1][1]);
        System.out.println("**************");
        for (int i =0;i<2;i++){
            for (int j =0;j<3;j++){
                System.out.println(b[i][j]);
            }

        }
    }
}
