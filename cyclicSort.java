
import java.util.Arrays;

public class cyclicSort {
    public static void main(String[] args) {
        int arr [] = {5,4,3,2,1,6};
        sort(arr);
        System.err.println(Arrays.toString(arr));
        
    }
    static  void sort( int arr []){
        int i =0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
    }

    static void swap(int arr[] , int first , int seocond){
       
        
            int temp = arr[first];
            arr[first] = arr[seocond];
            arr[seocond] = temp;  

        }
            
    
    
}
