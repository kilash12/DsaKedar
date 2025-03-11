
import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int num [][] = {
            {2,3,4,5},
            {4,5,7,4},
            {10,22,33,44},
            {22,11,10,12}

        };
        int key = 10;
        int ans []  = search(num,key);
        System.err.println(Arrays.toString(ans));
        

    }
    static int [] search(int arr[][],int key){
        if(arr.length == 0){
            return new int[]{-1,-1};
            
        }
      for (int row = 0; row < arr.length; row++) {
        for (int col = 0; col < arr[row].length; col++) {
            if(arr[row][col] == key){
                return new int[]{row,col};
            }
            
        }
          
      }
      return new int []{-1,-1};
            
    }
    
}
