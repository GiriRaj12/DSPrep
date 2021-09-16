package ds.prep.DynamicProgamming;


import java.util.Arrays;

public class CalculateSumInGivenNumbers {

    public static void main(String[] args) {
        int N = 4;
        int [] nums = new int []{1, 2, 3};
        solveValues(nums, N);
    }

    private static void solveValues(int[] nums, int n) {
       int [] result = new int[n + 1];

       result[0] = 1;

       for(int i=1; i<=n; i++){
           for(int j=0; j<nums.length; j++){
               if(i - nums[j] >= 0)
                    result[i] = result[i] + result[i - nums[j]];
           }
       }

       for(int obj : result)
           System.out.print(obj+" ");
    }
}
