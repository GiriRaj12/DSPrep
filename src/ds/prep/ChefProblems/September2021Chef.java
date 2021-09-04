package ds.prep.ChefProblems;

import java.util.Scanner;

public class September2021Chef {
    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        chefAriLineProblem();
    }

    public static void chefAriLineProblem(){
        int n = in.nextInt();

        for(int i=0; i<n; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();

            int d = in.nextInt();
            int e = in.nextInt();

            if (((a + b) <= d && c <= e) || ((a + c) <= d && b <= e) || ((b + c) <= d && a <= e)) {
                System.out.println("YES");
            } else
                System.out.println("NO");
        }
    }

    public static void chefEPassProblem(){
        int n = in.nextInt();
        for(int i =0; i<n; i++){
            int stringLength = in.nextInt();
            int district = in.nextInt();
            int state = in.nextInt();
            String binaryCode = in.next();
            int result = 0;
            for(int j=0; j<stringLength; j++){
                if(binaryCode.charAt(j) == '0'){
                    result = result + district;
                } else{
                    result = result + state;
                }
            }
            System.out.println(result);
        }
    }
}
