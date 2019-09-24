package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class arrayListJavaPoint {

    public static void main(String args[]){


        studentInfoJavaPoint s1= new studentInfoJavaPoint(1,"shivum",9);
        studentInfoJavaPoint s2= new studentInfoJavaPoint(2,"kiaan",6);
        studentInfoJavaPoint s3= new studentInfoJavaPoint(3,"rudra",10);

        ArrayList al = new ArrayList();
        al.add(s1);
        al.add(s2);
        al.add(s3);

        Iterator it =al.iterator();
        while (it.hasNext()){
            studentInfoJavaPoint st=(studentInfoJavaPoint)it.next();
            System.out.println("roll number "+ st.rolno+" is "+st.name+" age "+st.age);
        }








    }

}
