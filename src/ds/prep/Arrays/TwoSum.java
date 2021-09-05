package ds.prep.Arrays;

import java.util.HashMap;
import java.util.Map;

//Two sum without n square time complexity
public class TwoSum {
    public static void main(String[] args) {
        int [] arr = new int[]{2, 7, 11, 15};
        int [] result = twoSum(arr, 17);
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
    }

    public static int [] twoSum(int [] arr, int target){
        Map<Integer, Integer> positionCache = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int toFind = target - arr[i];
            if(positionCache.containsKey(toFind)) {
                return new int[]{i, positionCache.get(toFind)};
            } else {
                positionCache.put(arr[i], i);
            }
        }
        return new int[]{0, 1};
    }
}
