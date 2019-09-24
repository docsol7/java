package interviewQtns;

public class inteviewQtn2 {
    public static void main(String[]args){
        //find the max number in the column of the min number present
        /*
        min number
        col of min nos
        then max no in that col
         */

        //find the min number in the row of the max number is present
        /*
        find the max number
        the row of max number
        min mos in that row
         */
        int number[][]={{1,4,5},{10,6,9},{9,8,15},{7,1,2}};
        int max= number[0][0];
        int row=0;
        for (int i =0;i<4;i++) {
            for (int j = 0; j < 3; j++) {
                if (number[i][j] > max) {
                    max = number[i][j];
                    row = i;
                }
            }
        }
                System.out.println("The maximum number is " + max);
                System.out.println("The row of the maximum number is " + row);

         int minnos= number[row][0];
         int m=0;
         while (m<3){
             if (number[row][m]<minnos){
                 minnos=number[row][m];
             }
             m++;
         }
        System.out.println("The minimum number in the row of the maximum number of the table is "+minnos);



        int min=number[0][0];
        int mincol =0;
        for (int i=0;i<4;i++){
            for(int j=0;j<3;j++){
                if(number[i][j]<min){
                    min= number[i][j];
                    mincol=j;
                }
            }
        }
        System.out.println("The minimum number is "+min);
        System.out.println("The minimum number column  is "+mincol);

        int maxnos= number[0][mincol];
        int k=0;
        while (k<3){
            if (number[k][mincol]>maxnos){
                maxnos= number[k][mincol];
            }
            k++;
        }
        System.out.println("The maximum number in the column of the minimum number of the table is "+maxnos);

    }
}
