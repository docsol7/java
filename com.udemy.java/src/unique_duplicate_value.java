import java.util.ArrayList;

public class unique_duplicate_value {
    public static void main(String[]args){

        int a[]={1,2,3,4,4,3,2,6,6,9,9,6,7,4,7};
        ArrayList al = new ArrayList();
        for (int i=0;i<a.length;i++){
            int k =0;
            if (!al.contains(a[i])){
                al.add(a[i]);
                k++;
                for (int j=i+1;j<a.length;j++){
                    if (a[i]==a[j]){
                        k++;
                    }
                }
             System.out.println("The number "+ a[i] +"repeats "+ k+" number of times.");
                if (1==k)
             System.out.println(a[i]+ " is the unique number.");
            }
        }






    }
}
