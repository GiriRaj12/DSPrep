package ds.prep.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int arr [] = {-1,0,3,5,9,12};
        System.out.println(binarySearch(arr,2, 0, arr.length));
    }

    public static int binarySearch(int [] arr, int target, int low, int high){
        if(low >= high){
            return -1;
        }

        int mid = ((low + high) / 2);
        
        if(target == arr[mid]){
            return mid;
        } else {
            if (target > arr[mid])
                return binarySearch(arr, target, mid + 1, high);
            else
                return binarySearch(arr, target, 0, mid);
        }
    }
}
