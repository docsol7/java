import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class javaRevision1 {
    public static void main (String[]args){
        //reverse string
        String  s = "saurabh";
        String r  = new StringBuffer(s).reverse().toString();
        System.out.println("The reverse string is  "+r);
        //or
        String m = "manavi";
        String re ="";
        for (int i = m.length()-1;i>=0;i--) {
            re = re + m.charAt(i);
        }
        System.out.println("The reverse string is "+re);

        //calculating the sum of the following numbers
        int ab[] ={7,8,9,3,5,43,21};
        int sum =0;
        for (int i=0;i<ab.length;i++){
            sum = sum + ab[i];
        }
        System.out.println("The sum of numbers is "+sum);

        //at what index is number 5 present.
        int ab1[] ={7,8,9,3,5,43,21};
        for (int i =0;i<ab1.length;i++){
            if (ab1[i]==5){
                System.out.println("The number 5 is present on the " +i+ " position.");
                break;
            }
        }

        //print the current date and time
        Date dt = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("M/dd/yyyy hh:mm:ss");
        System.out.println(sdf.format(dt));

        Calendar cd = Calendar.getInstance();
        System.out.println(cd.getCalendarType());
        System.out.println(sdf.format(cd.getTime()));

        //single array print
        int a[]={1,3,5,7,9,13};
        for (int i =0;i<a.length;i++){
            System.out.println(a[i]);
        }

        //multi dimensional array print
        int b[][]={{1,3,5},{5,7,3},{10,2,6}};
        for (int z =0; z<3;z++){
            for (int k =0;k<3;k++){
                System.out.println(b[z][k]);
            }
        }
        //find out the max and minimum number from this array
        int min =b[0][0];
        for (int i=0;i <3;i++){
            for (int j = 0 ; j <3; j++){
                if (b[i][j]<min){
                    min= b[i][j];
                }
            }
        }System.out.println("The minimum value is "+min);
        int max=b[0][0];
        int row=0;
        for (int i =0;i<3;i++){
            for (int j=0;j<3;j++){
                if (b[i][j]>max){
                    max= b[i][j];
                    row=i;
                }
            }
        }System.out.println("The maximum value is "+max);
        System.out.println("The row it is present is in is "+row);
        //find out the min number in the row where max number is present

        int minnos = b[row][0];
        int g=0;
        while(g<3){
            if (b[row][g]<minnos){
                minnos =b[row][g];
            }
            g++;
        }
        System.out.println("The minimum number is the row of maximum number is "+minnos);



    }
}
