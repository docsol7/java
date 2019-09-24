import java.util.HashMap;

public class numberprintUseHashMap {
    public static void main(String[]args){

        int z[]={1,2,3,4,4,3,2,6,6,9,9,6,7,4,7};

        HashMap hp = new HashMap();
        for (int i=0;i<z.length;i++){
            if (hp.containsKey(z[i])){

                hp.put(z[i] , hp.get(z[i]+1));

            }else {
                hp.put(z[i],1);
            }
            System.out.println(z[i]);
        }



        /*
        int aa[] = {4,5,5,5,4,6,6,9,4,5};

HashMap<Integer,Integer> hmm = new HashMap<Integer,Integer>();

        for (int ii=0;ii<aa.length;ii++) {

        if (hmm.containsKey(aa[ii])){

          hmm.put(aa[ii], hmm.get(aa[ii])+1)
        }
        else {
        hmm.put(aa[ii], 1);

        }

        }
         */





    }
}
