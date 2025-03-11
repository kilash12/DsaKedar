
import java.util.Arrays;

public class  BInarySearch2DArray  {
    public static void main(String[] args) {
        int arr[][] = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {27, 29, 37, 48},
            {32, 33, 39, 50}
        };
        
        int target = 29;
       

        System.err.println( Arrays.toString(searchIn2DArray(arr, target)));
    }

    static int[] searchIn2DArray(int arr[][], int target) {
        int row = 0;
        int col = arr[0].length - 1; // Start from the top-right corner

        while (row < arr.length && col >= 0) {
            if (arr[row][col] == target) {
                return new int[]{row, col}; // Target found
            }
            if (arr[row][col] < target) {
                row++; // Move to the next row
            } else {
                col--; // Move to the previous column
            }
        }
        return new int[]{-1, -1}; // Target not found
    }
}
