package interviewQtns;

public class interviewQtn1 {
    public static void main(String[]args){

        int abd[][]={{5,4,3},{6,7,8},{9,3,2}};
        int min = abd[0][0];
        int max =abd[0][0];
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                if (abd[i][j]< min){
                    min =abd[i][j];
                }
            }
        }
        System.out.println("The minimum value is " +min);

        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                if (abd[i][j]>max){
                    max= abd[i][j];
                }
            }
        }
        System.out.println("The maximum value is "+max);
    }
}
