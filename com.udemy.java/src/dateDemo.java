import java.text.SimpleDateFormat;
import java.util.Date;

public class dateDemo {

    public static void main (String[]args){

       //current date &time
        Date dt =new Date();
        System.out.println(dt.toString());
        //when u want to format your date

        SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
        System.out.println(sdf.format(dt));

        SimpleDateFormat sd = new SimpleDateFormat("M/d/yyyy hh:mm:ss");
        System.out.println(sd.format(dt));

    }
}
