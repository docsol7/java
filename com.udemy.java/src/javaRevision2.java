import java.util.ArrayList;

public class javaRevision2 {

    public static void main(String[] args) {
//print th unique an duplicate values
        int a[]={1,2,3,4,4,3,2,6,6,9,9,6,7,4,7};

        ArrayList<Integer> al= new ArrayList<Integer>();

        for (int i =0;i<a.length;i++){
            int k=0;
            if (!al.contains(a[i])){
                al.add(a[i]);
                k++;

                for (int j=0;j<a.length;j++){
                    if(a[i]==a[j]){
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
