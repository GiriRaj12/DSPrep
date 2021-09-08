package ds.prep.Arrays;

import java.util.ArrayList;
import java.util.List;

public class LuckyNumberMatrix {
    public static void main(String[] args) {
        int [][] matrix = new int [][]{{3,7,8},{11,5,13},{15,16,17}};
        luckyNumbers(matrix);
    }

    public static List<Integer> luckyNumbers(int [][] matrix){
        List<Integer> luckyNumbers = new ArrayList<>();
        for(int i=0; i<matrix.length; i++) {
            int minIndex = findIndexOfMinNumberInRow(matrix[i]);
            System.out.println("Index for row "+i+"-"+minIndex);
            if(isMaxInColumn(matrix[i][minIndex], minIndex, matrix, i)){
                luckyNumbers.add(matrix[i][minIndex]);
            }
        }
        luckyNumbers.forEach(e -> System.out.print(e+" "));
        return luckyNumbers;
    }

    private static boolean isMaxInColumn(int target, int minIndex, int[][] matrix, int currentIndex) {
        for(int i=0;i<matrix.length; i++){
            if(i == currentIndex)
                continue;

            if(matrix[i][minIndex] > target){
                return false;
            }
        }
        return true;
    }

    public static int findIndexOfMinNumberInRow(int [] row){
        int index = 0;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<row.length; i++){
            if(row[i] < min){
                index = i;
                min = row[i];
            }
        }
        return index;
    }
}
