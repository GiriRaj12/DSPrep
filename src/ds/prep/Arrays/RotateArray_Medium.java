package ds.prep.Arrays;

public class RotateArray_Medium {
    //Given an array, rotate the array to the right by k steps, where k is non-negative.
    // Do it with o(1) extra space

    public static void main(String[] args) {
        int [] question = new int[]{1,2,3,4,5,6,7};
        int [] result = rotate(question, 3);
        for(int count : result)
            System.out.print(count+"-");
    }

    public static int [] rotate(int [] arr, int rotationTime){
        int last = 0;
        while(rotationTime > 0){
            last = arr[arr.length - 1];
            for(int i=arr.length -1; i > 0; i--){
                arr[i] = arr[i - 1];
            }
            arr[0] = last;
            rotationTime--;
        }
        return arr;
    }
}
