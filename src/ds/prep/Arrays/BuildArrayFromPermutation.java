package ds.prep.Arrays;

public class BuildArrayFromPermutation {
    public static void main(String[] args) {
        int question [] = {5,0,1,2,3,4};
        int [] result = numsArray(question);

        for(int i=0;i<result.length; i++){
            System.out.print(result[i]+" ");
        }
    }

    public static int[] numsArray(int [] arr){
        int [] returnPermutationArray = new int[arr.length];

        for(int i=0; i<arr.length; i++){
            returnPermutationArray[i] = arr[arr[i]];
        }
        return returnPermutationArray;
    }
}
